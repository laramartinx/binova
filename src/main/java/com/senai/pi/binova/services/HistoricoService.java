package com.senai.pi.binova.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.binova.models.Historico;
import com.senai.pi.binova.repositories.HistoricoRepository;

@Service
public class HistoricoService {
    @Autowired
    private HistoricoRepository historicoRepository;

    public Historico salvar(Historico historico) {
        return historicoRepository.save(historico);
    }

    public List<Historico> listar() {
        return historicoRepository.findAll();
    }

    public Historico buscar(Integer id) {

        Optional<Historico> historico = historicoRepository.findById(id);

        if(historico.isPresent()) {
            return historico.get();
        }

        return null;
    }
}
