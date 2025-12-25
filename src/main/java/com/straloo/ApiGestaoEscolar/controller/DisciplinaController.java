package com.straloo.ApiGestaoEscolar.controller;

import com.straloo.ApiGestaoEscolar.dto.DisciplinaDTO;
import com.straloo.ApiGestaoEscolar.service.DisciplinaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    private final DisciplinaService disciplinaService;

    @PostMapping
    public ResponseEntity<?> cadastrarDisciplina(@RequestBody DisciplinaDTO dto) {
        return ResponseEntity.ok(disciplinaService.cadastrarDisciplina(dto));
    }

    @GetMapping
    public ResponseEntity<?> listarDisciplinas() {
        return ResponseEntity.ok(disciplinaService.listarDisciplinas());
    }
}
