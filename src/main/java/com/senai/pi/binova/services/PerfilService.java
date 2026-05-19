package com.senai.pi.binova.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.binova.models.Perfil;
import com.senai.pi.binova.repositories.PerfilRepository;

@Service
public class PerfilService {
    @Autowired
    private PerfilRepository perfilRepository;

    public Perfil salvar(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    public List<Perfil> listar() {
        return perfilRepository.findAll();
    }

    public Perfil buscar(Integer id) {

        Optional<Perfil> perfil = perfilRepository.findById(id);

        if(perfil.isPresent()) {
            return perfil.get();
        }

        return null;
    }
}
