package com.straloo.ApiGestaoEscolar.service;

import com.straloo.ApiGestaoEscolar.dto.AlunoDTO;
import com.straloo.ApiGestaoEscolar.mapper.AlunoMapper;
import com.straloo.ApiGestaoEscolar.model.Aluno;
import com.straloo.ApiGestaoEscolar.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AlunoService {

    private final AlunoRepository repository;
    private final AlunoMapper mapper;

    public AlunoDTO cadastrarAluno(AlunoDTO dto) {

        Aluno entity = mapper.toEntity(dto);

        Aluno alunoSalvo = repository.save(entity);
        return mapper.toDTO(alunoSalvo);
    }

    public List<AlunoDTO> listarAlunosDeUmaTurma(Long turmaId) {
        return repository.findByTurmaId(turmaId).stream()
                .map(mapper::toDTO)
                .toList();
    }
}
