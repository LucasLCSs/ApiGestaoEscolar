package com.straloo.ApiGestaoEscolar.repository;

import com.straloo.ApiGestaoEscolar.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findByTurmaId(Long turmaId);
}
