package com.senai.pi.binova.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="historico")
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name= "relatorio_id")
    private Relatorio relaorio;

    public Historico() {
    }

    public Historico(Integer id, Relatorio relaorio) {
        this.id = id;
        this.relaorio = relaorio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Relatorio getRelaorio() {
        return relaorio;
    }

    public void setRelaorio(Relatorio relaorio) {
        this.relaorio = relaorio;
    }
    

}