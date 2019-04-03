package com.marius.projects.sandelis;

import java.util.ArrayList;
import java.util.List;

public class Kategorija {

    private String pavadinimas;


    private List<Kategorija> subKategerijos = new ArrayList<>();

    private List<Preke> prekes = new ArrayList<>();

    public Kategorija(String pavadinimas, List<Kategorija> subKategerijos, List<Preke> prekes) {
        this.pavadinimas = pavadinimas;
        this.subKategerijos = subKategerijos;
        this.prekes = prekes;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public List<Kategorija> getSubKategerijos() {
        return subKategerijos;
    }

    public void setSubKategerijos(List<Kategorija> subKategerijos) {
        this.subKategerijos = subKategerijos;
    }

    public List<Preke> getPrekes() {
        return prekes;
    }

    public void setPrekes(List<Preke> prekes) {
        this.prekes = prekes;
    }
}
