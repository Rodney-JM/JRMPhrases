package br.com.jrm.jrmphrases.JRMPhrases.models;

import jakarta.persistence.*;

@Entity
@Table(name = "phrases")
public class Phrase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String phrase;
    private String caracter;
    private String poster;

    public Phrase(){}

    public Phrase(String title, String phrase, String caracter, String poster){
        this.title = title;
        this.phrase = phrase;
        this.caracter = caracter;
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
