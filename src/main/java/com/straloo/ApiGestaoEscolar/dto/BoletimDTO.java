package com.straloo.ApiGestaoEscolar.dto;

import java.util.List;

public record BoletimDTO(
        AlunoDTO aluno,
        TurmaDTO turma,
        List<NotaDTO> notas) {
}
