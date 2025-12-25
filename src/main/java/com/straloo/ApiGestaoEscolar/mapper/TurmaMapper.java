package com.straloo.ApiGestaoEscolar.mapper;

import com.straloo.ApiGestaoEscolar.dto.TurmaDTO;
import com.straloo.ApiGestaoEscolar.model.Turma;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TurmaMapper {

    TurmaDTO toDTO(Turma turma);
    Turma toEntity(TurmaDTO dto);
}
