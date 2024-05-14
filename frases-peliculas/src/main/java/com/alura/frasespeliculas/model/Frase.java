package com.alura.frasespeliculas.model;

import jakarta.persistence.*;

@Entity
@Table(name="frases")
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String textoFrase;
    private String autor;
    private String tituloSerie;
    private String poster;

    public Frase(Long id, String textoFrase, String autor, String tituloSerie, String poster) {
        this.id = id;
        this.textoFrase = textoFrase;
        this.autor = autor;
        this.tituloSerie = tituloSerie;
        this.poster = poster;
    }

    public Frase(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTextoFrase() {
        return textoFrase;
    }

    public void setTextoFrase(String textoFrase) {
        this.textoFrase = textoFrase;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTituloSerie() {
        return tituloSerie;
    }

    public void setTituloSerie(String tituloSerie) {
        this.tituloSerie = tituloSerie;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "Frase{" +
                ":'" + textoFrase + '\'' +
                ", autor='" + autor + '\'' +
                ", Serie='" + tituloSerie + '\'' +
                '}';
    }
}
