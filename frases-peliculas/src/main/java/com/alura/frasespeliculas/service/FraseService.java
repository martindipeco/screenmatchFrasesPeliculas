package com.alura.frasespeliculas.service;

import com.alura.frasespeliculas.dto.FraseDTO;
import com.alura.frasespeliculas.model.Frase;
import com.alura.frasespeliculas.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;
    public FraseDTO obtenerFraseAleatoria()
    {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTextoFrase(), frase.getAutor(), frase.getTituloSerie(), frase.getPoster());
    }
}
