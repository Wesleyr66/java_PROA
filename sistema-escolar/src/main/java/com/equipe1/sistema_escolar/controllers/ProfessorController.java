package com.equipe1.sistema_escolar.controllers;

import com.equipe1.sistema_escolar.models.Professor;
import com.equipe1.sistema_escolar.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    ProfessorRepository professorRepository;

    @GetMapping
    private List<Professor> professor() {
        return professorRepository.findAll();
    }
}
