package com.equipe1.sistema_escolar.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_professor")
@Getter
@Setter
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "pk_id_professor")
    private Long idProfessor;

    @Column(name = "nome_professor")
    private String nomeProfessor;

    @Column(name = "email_professor")
    private String emailProfessor;

}
