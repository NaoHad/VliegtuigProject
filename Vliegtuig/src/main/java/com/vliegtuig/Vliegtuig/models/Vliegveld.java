package com.vliegtuig.Vliegtuig.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vliegveld {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String locatie;
    private String naam;
    @OneToMany
    private List<Vliegtuig> vliegtuigList;
    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
