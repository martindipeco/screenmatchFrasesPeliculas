package com.alura.frasespeliculas.repository;

import com.alura.frasespeliculas.dto.FraseDTO;
import com.alura.frasespeliculas.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f ORDER BY FUNCTION('RANDOM') LIMIT 1")
    public Frase obtenerFraseAleatoria();

}
