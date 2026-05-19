package com.senai.pi.binova.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.binova.models.Relatorio;
import com.senai.pi.binova.repositories.RelatorioRepository;

@Service
public class RelatorioService {
    @Autowired
    private RelatorioRepository relatorioRepository;

    public Relatorio salvar(Relatorio relatorio) {
        return relatorioRepository.save(relatorio);
    }

    public List<Relatorio> listar() {
        return relatorioRepository.findAll();
    }

    public Relatorio buscar(Integer id) {

        Optional<Relatorio> relatorio = relatorioRepository.findById(id);

        if(relatorio.isPresent()) {
            return relatorio.get();
        }

        return null;
    }
}
