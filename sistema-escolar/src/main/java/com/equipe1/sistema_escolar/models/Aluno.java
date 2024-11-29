package com.equipe1.sistema_escolar.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name = "tb_aluno")
@Getter
@Setter
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column ( name = "pk_id_aluno")
    private Long idAluno;

    @Column ( name = "data_nascimento_aluno")
    private Date dataNascimento;

    @Column ( name = "nome_aluno")
    private String nomeAluno;

    @Column ( name = "email_aluno")
    private String emailAluno;

    @ManyToOne
    @JoinColumn (name = "professor_id", referencedColumnName = "pk_id_professor", nullable = false)
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "sala_id", nullable = false)
    @JsonBackReference
    private Sala sala;


}
