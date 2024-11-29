package com.equipe1.sistema_escolar.controllers;

import com.equipe1.sistema_escolar.models.Aluno;
import com.equipe1.sistema_escolar.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping( "/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> getAluno() {
        return alunoRepository.findAll();
    }

    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @PutMapping("/{id}")
    public Aluno atualizarNomeAluno(@PathVariable Long id, @RequestBody Aluno aluno){
        Aluno alunoExistente = alunoRepository.findById(id).orElse(null);
        if (alunoExistente != null && aluno.getNomeAluno() != null){
            alunoExistente.setNomeAluno(aluno.getNomeAluno());
            return  alunoRepository.save(alunoExistente);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarAluno(@PathVariable Long id){
        if (alunoRepository.existsById(id)){
            alunoRepository.deleteById(id);
            return ResponseEntity.ok("Aluno deleta com sucesso");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aluno não encontrado");
        }
    }

}
