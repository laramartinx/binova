package com.senai.pi.binova.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.pi.binova.models.Lixeira;
import com.senai.pi.binova.services.LixeiraService;



@RestController
@RequestMapping("/lixeira")
public class LixeiraController {

    @Autowired
    private LixeiraService service;

    @PostMapping("/salvar")
    public Lixeira salvar(@RequestBody Lixeira lixeira) {
        return service.salvar(lixeira);
    }

    @GetMapping("/listar")
    public List<Lixeira> listar() {
        return service.listar();
    }

    @GetMapping("/buscar/{id}")
    public Lixeira buscar(@PathVariable Integer id) {
        return service.buscar(id);
    }
}