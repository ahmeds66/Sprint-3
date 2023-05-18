package com.ares.rocket_spboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAg;
    private String nomAg;
    private String countryAg;

    @JsonIgnore
    @OneToMany(mappedBy = "agence")
    private List<Rocket> rockets;

    public Agence() {
    }

    public Agence(String nomAg, String countryAg, List<Rocket> rockets) {
        super();
        this.nomAg = nomAg;
        this.countryAg = countryAg;
        this.rockets = rockets;
    }

    public Long getIdAg() {
        return idAg;
    }

    public void setIdAg(Long idAg) {
        this.idAg = idAg;
    }

    public String getNomAg() {
        return nomAg;
    }

    public void setNomAg(String nomAg) {
        this.nomAg = nomAg;
    }

    public String getCountryAg() {
        return countryAg;
    }

    public void setCountryAg(String countryAg) {
        this.countryAg = countryAg;
    }

    public List<Rocket> getRockets() {
        return rockets;
    }

    public void setRockets(List<Rocket> rockets) {
        this.rockets = rockets;
    }
}
