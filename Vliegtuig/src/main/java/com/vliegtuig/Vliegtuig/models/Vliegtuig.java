package com.vliegtuig.Vliegtuig.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vliegtuig {
    @Id

    @GeneratedValue

    private long id;
    //Vloot van vliegtuigen beheren
    //Details van elk vliegtuig
    
    private String vliegtuigNaam;
    private int brandstof;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVliegtuigNaam() {
        return vliegtuigNaam;
    }

    public void setVliegtuigNaam(String vliegtuigNaam) {
        this.vliegtuigNaam = vliegtuigNaam;
    }

    public int getBrandstof() {
        return brandstof;
    }

    public void setBrandstof(int brandstof) {
        this.brandstof = brandstof;
    }
}