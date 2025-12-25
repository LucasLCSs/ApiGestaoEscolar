package com.straloo.ApiGestaoEscolar.service;

import com.straloo.ApiGestaoEscolar.dto.BoletimDTO;
import com.straloo.ApiGestaoEscolar.dto.NotaDTO;
import com.straloo.ApiGestaoEscolar.mapper.AlunoMapper;
import com.straloo.ApiGestaoEscolar.mapper.NotaMapper;
import com.straloo.ApiGestaoEscolar.mapper.TurmaMapper;
import com.straloo.ApiGestaoEscolar.model.Aluno;
import com.straloo.ApiGestaoEscolar.model.Nota;
import com.straloo.ApiGestaoEscolar.repository.AlunoRepository;
import com.straloo.ApiGestaoEscolar.repository.NotaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NotaService {

    private final AlunoRepository alunoRepository;
    private final NotaRepository notaRepository;
    private final NotaMapper notaMapper;
    private final AlunoMapper alunoMapper;
    private final TurmaMapper turmaMapper;

    public NotaDTO cadastrarNota(NotaDTO dto) {

        Nota entity = notaMapper.toEntity(dto);

        Nota notaSalva = notaRepository.save(entity);
        return notaMapper.toDTO(notaSalva);
    }

    public BoletimDTO gerarBoletim(Long alunoId) {
        Aluno aluno = alunoRepository.findById((long) alunoId.intValue()).orElseThrow();
        List<Nota> notas = notaRepository.findByAlunoId((long) alunoId.intValue());

        return new BoletimDTO(
                alunoMapper.toDTO(aluno),
                turmaMapper.toDTO(aluno.getTurma()),
                notas.stream().map(notaMapper::toDTO).toList()
        );
    }
}
