package com.senai.pi.binova.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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

    @Column(name="cargo")
    private int cargo;

    @Column(name="endereco")
    private String endereco;

    @Column(name="responsavel")
    private String responsavel;

    @Column(name="descricao")
    private String localizacao;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Alerta alerta;

    public Relatorio() {
    }

    public Relatorio(Alerta alerta, int cargo, LocalDate data_regisro, String endereco, Integer id, String localizacao, String responsavel) {
        this.alerta = alerta;
        this.cargo = cargo;
        this.data_regisro = data_regisro;
        this.endereco = endereco;
        this.id = id;
        this.localizacao = localizacao;
        this.responsavel = responsavel;
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

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Alerta getAlerta() {
        return alerta;
    }

    public void setAlerta(Alerta alerta) {
        this.alerta = alerta;
    }

    
}

