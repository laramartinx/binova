package com.senai.pi.binova.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.pi.binova.models.Relatorio;
import com.senai.pi.binova.services.RelatorioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/relatorio")
public class RelatorioController {

    @Autowired
    private RelatorioService service;

    @PostMapping("/salvar")
    public Relatorio salvar(@RequestBody Relatorio relatorio) {
    return service.salvar(relatorio);
    }

    @GetMapping("/listar")
    public List<Relatorio> listar() {
    return service.listar();
    }

    @GetMapping("/buscar/{id}")
    public Relatorio buscar(@PathVariable Integer id) {
    return service.buscar(id);
    }
}