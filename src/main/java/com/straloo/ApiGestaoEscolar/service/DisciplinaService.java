package com.straloo.ApiGestaoEscolar.service;

import com.straloo.ApiGestaoEscolar.dto.DisciplinaDTO;
import com.straloo.ApiGestaoEscolar.mapper.DisciplinaMapper;
import com.straloo.ApiGestaoEscolar.model.Disciplina;
import com.straloo.ApiGestaoEscolar.repository.DisciplinaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DisciplinaService {

    private final DisciplinaRepository repository;
    private final DisciplinaMapper mapper;

    public DisciplinaDTO cadastrarDisciplina(DisciplinaDTO dto) {

        Disciplina entity = mapper.toEntity(dto);

        Disciplina disciplinaSalva = repository.save(entity);
        return mapper.toDTO(disciplinaSalva);
    }

    public List<DisciplinaDTO> listarDisciplinas() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }
}
