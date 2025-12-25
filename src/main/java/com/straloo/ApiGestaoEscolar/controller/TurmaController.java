package com.straloo.ApiGestaoEscolar.controller;

import com.straloo.ApiGestaoEscolar.dto.TurmaDTO;
import com.straloo.ApiGestaoEscolar.service.TurmaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/turmas")
public class TurmaController {

    private final TurmaService service;

    @PostMapping
    public ResponseEntity<?> cadastrarTurma(@RequestBody TurmaDTO dto) {
        return ResponseEntity.ok(service.cadastrarTurma(dto));
    }

    @GetMapping
    public ResponseEntity<?> listarTurmas() {
        return ResponseEntity.ok(service.listarTurmas());
    }
}
