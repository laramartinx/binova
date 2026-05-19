package com.senai.pi.binova.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.pi.binova.models.Historico;
import com.senai.pi.binova.services.HistoricoService;



@RestController
@RequestMapping("/historico")
public class HistoricoController {

    @Autowired
    private HistoricoService service;

    @PostMapping("/salvar")
    public Historico salvar(@RequestBody Historico historico) {
    return service.salvar(historico);
    }

    @GetMapping("/listar")
    public List<Historico> listar() {
    return service.listar();
    }

    @GetMapping("/buscar/{id}")
    public Historico buscar(@PathVariable Integer id) {
    return service.buscar(id);
    }
}