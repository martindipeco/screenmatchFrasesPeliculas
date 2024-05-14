package com.alura.frasespeliculas.controller;

import com.alura.frasespeliculas.dto.FraseDTO;
import com.alura.frasespeliculas.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series/frases")
public class FraseController {

    @Autowired
    private FraseService servicio;

    @GetMapping()
    public FraseDTO obtenerFraseAleatoria()
    {
        return servicio.obtenerFraseAleatoria();
    }
}
