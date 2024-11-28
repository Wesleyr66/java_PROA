package com.equipe1.sistema_escolar.repositories;

import com.equipe1.sistema_escolar.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
