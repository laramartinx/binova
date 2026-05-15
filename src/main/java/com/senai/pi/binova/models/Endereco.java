package com.senai.pi.binova.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="bairro")
    private String bairro;

    @Column(name="cep")
    private String cep;

    @Column(name="uf")
    private String uf;

    @Column(name="complemento")
    private String complemento;

    @Column(name="localidade")
    private String localidade;

    public Endereco() {
    }

    public Endereco(String bairro, String cep, String complemento, Integer id, String localidade, String logradouro, String uf) {
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
        this.id = id;
        this.localidade = localidade;
        this.logradouro = logradouro;
        this.uf = uf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

}
