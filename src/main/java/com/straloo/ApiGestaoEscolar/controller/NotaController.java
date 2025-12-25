package com.straloo.ApiGestaoEscolar.controller;

import com.straloo.ApiGestaoEscolar.dto.NotaDTO;
import com.straloo.ApiGestaoEscolar.service.NotaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/notas")
public class NotaController {

    private final NotaService notaService;

    @PostMapping
    public ResponseEntity<?> cadastrarNota(@RequestBody NotaDTO dto) {
        return ResponseEntity.ok(notaService.cadastrarNota(dto));
    }

    @GetMapping("/boletim/{alunoId}")
    public ResponseEntity<?> gerarBoletimPorAluno(@PathVariable Long alunoId) {
        return ResponseEntity.ok(notaService.gerarBoletim(alunoId));
    }
}
