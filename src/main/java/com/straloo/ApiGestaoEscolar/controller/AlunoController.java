package com.straloo.ApiGestaoEscolar.controller;

import com.straloo.ApiGestaoEscolar.dto.AlunoDTO;
import com.straloo.ApiGestaoEscolar.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    @PostMapping
    public ResponseEntity<?> cadastrarAluno(@RequestBody AlunoDTO dto) {
        return ResponseEntity.ok(alunoService.cadastrarAluno(dto));
    }

    @GetMapping
    public ResponseEntity<?> listarAlunosDeUmaTurma(@RequestParam Long turmaId) {
        return ResponseEntity.ok(alunoService.listarAlunosDeUmaTurma(turmaId));
    }
}
