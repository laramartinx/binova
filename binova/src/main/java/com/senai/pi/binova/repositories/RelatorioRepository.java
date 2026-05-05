package com.senai.pi.binova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.pi.binova.models.Relatorio;

@Repository
public interface RelatorioRepository extends JpaRepository<Relatorio, Integer> {
    
}