package com.equipe1.sistema_escolar.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table (name = "tb_sala")
@Getter
@Setter
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_sala")
    private Long idSala;

    @Column (name = "nome_sala")
    private String nomeSala;

    @Column (name = "capacidade")
    private int capacidade;

    @OneToMany(mappedBy = "sala")
    @JsonIgnore
    private List<Aluno> alunos;

}
