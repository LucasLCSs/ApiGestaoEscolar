package com.straloo.ApiGestaoEscolar.mapper;

import com.straloo.ApiGestaoEscolar.dto.AlunoDTO;
import com.straloo.ApiGestaoEscolar.model.Aluno;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AlunoMapper {

    @Mapping(source = "turma.id", target = "turmaId")
    AlunoDTO toDTO(Aluno aluno);

    @Mapping(source = "turmaId", target = "turma.id")
    Aluno toEntity(AlunoDTO dto);
}
