package com.equipe1.sistema_escolar.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "tb_sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_sala")
    private Long idSala;

    @Column (name = "nome_sala")
    private Date nomeSala;

    @Column (name = "capacidade")
    private int capacidade;

}
