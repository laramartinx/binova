package com.senai.pi.binova.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.binova.repositories.RelatorioRepository;

@Service
public class RelatorioService {
    @Autowired
    private RelatorioRepository relatorioRepository;
}
