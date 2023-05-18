package com.ares.rocket_spboot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Rocket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRocket;
    @NotNull
    @Size(min = 4, max = 30)
    private String name;

    @ManyToOne
    private Agence agence;
    private Long lowOrbitPayload;
    private Long highOrbitPayload;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    private Date lunchDate;
    private Long nbLaunches;
    private Long fails;

    public Rocket(){
        super();
    }

    public Rocket(String name,Agence agence, Long lowOrbitPayload, Long highOrbitPayload, Date lunchDate, Long nbLaunches, Long fails) {
        super();
        this.name = name;
        this.agence = agence;
        this.lowOrbitPayload = lowOrbitPayload;
        this.highOrbitPayload = highOrbitPayload;
        this.lunchDate = lunchDate;
        this.nbLaunches = nbLaunches;
        this.fails = fails;
    }

    public Long getIdRocket() {
        return idRocket;
    }

    public void setIdRocket(Long idRocket) {
        this.idRocket = idRocket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Agence getAgence() {
        return agence;
    }
    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public Long getLowOrbitPayload() {
        return lowOrbitPayload;
    }

    public void setLowOrbitPayload(Long lowOrbitPayload) {
        this.lowOrbitPayload = lowOrbitPayload;
    }

    public Long getHighOrbitPayload() {
        return highOrbitPayload;
    }

    public void setHighOrbitPayload(Long highOrbitPayload) {
        this.highOrbitPayload = highOrbitPayload;
    }

    public Date getLunchDate() {
        return lunchDate;
    }

    public void setLunchDate(Date lunchDate) {
        this.lunchDate = lunchDate;
    }

    public Long getNbLaunches() {
        return nbLaunches;
    }

    public void setNbLaunches(Long nbLaunches) {
        this.nbLaunches = nbLaunches;
    }

    public Long getFails() {
        return fails;
    }

    public void setFails(Long fails) {
        this.fails = fails;
    }

    @Override
    public String toString(){
        return "Rocket [idRocket= " + idRocket +  " , Name = " + name +"Agency = "+ agence + " , lowOrbitPayload= "+lowOrbitPayload
                + " , highOrbitPayload= " +highOrbitPayload +" , lunchDate= " + lunchDate + " , nbLaunches= "
                + nbLaunches + " , fails= "+ fails + " ]";
    }
}
