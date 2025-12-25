package com.straloo.ApiGestaoEscolar.dto;

import java.math.BigDecimal;

public record NotaDTO(DisciplinaDTO disciplina,
                      BigDecimal valor) {
}
