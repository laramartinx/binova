package com.senai.pi.binova.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.binova.models.Lixeira;
import com.senai.pi.binova.repositories.LixeiraRepository;

@Service
public class LixeiraService {
    @Autowired
    private LixeiraRepository lixeiraRepository;

    public Lixeira salvar(Lixeira lixeira) {
        return lixeiraRepository.save(lixeira);
    }

    public List<Lixeira> listar() {
        return lixeiraRepository.findAll();
    }

    public Lixeira buscar(Integer id) {

        Optional<Lixeira> lixeira = lixeiraRepository.findById(id);

        if(lixeira.isPresent()) {
            return lixeira.get();
        }

        return null;
    }
}
