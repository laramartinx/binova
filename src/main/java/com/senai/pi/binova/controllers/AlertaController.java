package com.senai.pi.binova.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.pi.binova.models.Alerta;
import com.senai.pi.binova.services.AlertaService;



    
@RestController
@RequestMapping("/alerta")
public class AlertaController {

    @Autowired
    private AlertaService service;

    @PostMapping("/salvar")
    public Alerta salvar(@RequestBody Alerta alerta) {
    return service.salvar(alerta);
    }

    @GetMapping("/listar") 
    public List<Alerta> listar() {
    return service.listar();
    }

    @GetMapping("/buscar/{id}")
    public Alerta buscar(@PathVariable Integer id) {
    return service.buscar(id);
    }

}