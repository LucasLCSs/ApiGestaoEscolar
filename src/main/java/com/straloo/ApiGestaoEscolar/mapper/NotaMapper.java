package com.straloo.ApiGestaoEscolar.mapper;

import com.straloo.ApiGestaoEscolar.dto.NotaDTO;
import com.straloo.ApiGestaoEscolar.model.Nota;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {DisciplinaMapper.class})
public interface NotaMapper {

    @Mapping(source = "disciplina", target = "disciplina")
    NotaDTO toDTO(Nota nota);

    @Mapping(source = "disciplina", target = "disciplina")
    Nota toEntity(NotaDTO dto);
}
