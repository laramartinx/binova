package com.senai.pi.binova.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "lixeira")
public class Lixeira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="capacidade")
    private int capacidade;

    @Column(name="descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name= "perfil_id")
    private Perfil perfil;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public Lixeira() {
    }

    public Lixeira(int capacidade, String descricao, Endereco endereco, Integer id, Perfil perfil) {
        this.capacidade = capacidade;
        this.descricao = descricao;
        this.endereco = endereco;
        this.id = id;
        this.perfil = perfil;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
