package com.senai.pi.binova.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.binova.models.Alerta;
import com.senai.pi.binova.repositories.AlertaRepository;

@Service
public class AlertaService {
    @Autowired
    private AlertaRepository alertaRepository;

    public Alerta salvar(Alerta alerta) {
        return alertaRepository.save(alerta);
    }

    
    public List<Alerta> listar() {
        return alertaRepository.findAll();
    }

    
    public Alerta buscar(Integer id) {

        Optional<Alerta> alerta = alertaRepository.findById(id);

        if(alerta.isPresent()) {
            return alerta.get();
        }

        return null;
    }
}
