package com.straloo.ApiGestaoEscolar.repository;

import com.straloo.ApiGestaoEscolar.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotaRepository extends JpaRepository<Nota, Long> {
    List<Nota> findByAlunoId(Long alunoId);
}
