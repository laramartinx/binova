package com.senai.pi.binova.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "relatorio")
public class Relatorio {
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

    public Relatorio() {
    }

    public Relatorio(Integer id, LocalDate data_regisro, int capacidade, String localizacao) {
        this.id = id;
        this.data_regisro = data_regisro;
        this.capacidade = capacidade;
        this.localizacao = localizacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData_regisro() {
        return data_regisro;
    }

    public void setData_regisro(LocalDate data_regisro) {
        this.data_regisro = data_regisro;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

}