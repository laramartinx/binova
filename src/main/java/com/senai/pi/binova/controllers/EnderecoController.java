package com.senai.pi.binova.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.pi.binova.models.Endereco;
import com.senai.pi.binova.services.EnderecoService;



@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco) {
    return service.salvar(endereco);
    }

    @GetMapping("/listar")
    public List<Endereco> listar() {
    return service.listar();
    }

    @GetMapping("/buscar/{id}")
    public Endereco buscar(@PathVariable Integer id) {
    return service.buscar(id);
    }
} 