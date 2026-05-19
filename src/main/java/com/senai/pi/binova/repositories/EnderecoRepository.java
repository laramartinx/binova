package com.senai.pi.binova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.pi.binova.models.Endereco;

    
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}