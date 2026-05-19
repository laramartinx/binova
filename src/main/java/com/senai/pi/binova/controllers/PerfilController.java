package com.senai.pi.binova.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.pi.binova.models.Perfil;
import com.senai.pi.binova.services.PerfilService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/perfil")
public class PerfilController {

    @Autowired
    private PerfilService service;

    @PostMapping("/salvar")
    public Perfil salvar(@RequestBody Perfil perfil) {
    return service.salvar(perfil);
    }

    @GetMapping("/listar")
    public List<Perfil> listar() {
    return service.listar();
    }

    @GetMapping("/buscar/{id}")
    public Perfil buscar(@PathVariable Integer id) {
    return service.buscar(id);
    }
}