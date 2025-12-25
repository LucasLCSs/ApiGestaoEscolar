package com.straloo.ApiGestaoEscolar.service;

import com.straloo.ApiGestaoEscolar.dto.TurmaDTO;
import com.straloo.ApiGestaoEscolar.mapper.TurmaMapper;
import com.straloo.ApiGestaoEscolar.model.Turma;
import com.straloo.ApiGestaoEscolar.repository.TurmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TurmaService {

    private final TurmaRepository repository;
    private final TurmaMapper mapper;

    public TurmaDTO cadastrarTurma(TurmaDTO dto) {

        Turma entity = mapper.toEntity(dto);

        Turma turmaSalva = repository.save(entity);
        return mapper.toDTO(turmaSalva);
    }

    public List<TurmaDTO> listarTurmas() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }
}
