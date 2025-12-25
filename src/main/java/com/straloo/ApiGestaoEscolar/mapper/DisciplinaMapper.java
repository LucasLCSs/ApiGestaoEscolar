package com.straloo.ApiGestaoEscolar.mapper;

import com.straloo.ApiGestaoEscolar.dto.DisciplinaDTO;
import com.straloo.ApiGestaoEscolar.model.Disciplina;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DisciplinaMapper {

    DisciplinaDTO toDTO(Disciplina disciplina);
    Disciplina toEntity(DisciplinaDTO dto);
}
