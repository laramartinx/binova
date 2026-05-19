package com.senai.pi.binova.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.binova.models.Endereco;
import com.senai.pi.binova.repositories.EnderecoRepository;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;
   
    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> listar() {
        return enderecoRepository.findAll();
    }

    public Endereco buscar(Integer id) {

        Optional<Endereco> endereco = enderecoRepository.findById(id);

        if(endereco.isPresent()) {
            return endereco.get();
        }

        return null;
    }
}
