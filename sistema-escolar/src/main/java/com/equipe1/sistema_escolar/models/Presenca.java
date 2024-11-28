package com.equipe1.sistema_escolar.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table (name = "tb_presenca")
@Getter
@Setter
public class Presenca {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "pk_id_presenca")
    private Long idPresenca;

    @Column (name = "data_presenca")
    private Date dataPresenca;

}
