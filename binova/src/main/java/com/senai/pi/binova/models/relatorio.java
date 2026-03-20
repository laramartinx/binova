package com.senai.pi.binova.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "relatório")
public class relatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="data registro")
    private LocalDate data_regisro;

    @Column(name="capacidade")
    private int capacidade;

    @Column(name="localização")
    private String localizacao;
}