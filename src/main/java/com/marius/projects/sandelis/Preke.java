package com.marius.projects.sandelis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Preke {

    private Integer id;
    private Integer pagaminimoData;
    private String pavadinimas;
    private Double kaina;
    private Integer kiekis;
    private List<String> tagai;

    public Preke(Integer id, String pavadinimas, Integer pagaminimoData, Double kaina, Integer kiekis, String... tagai) {
        this.id = id;
        this.tagai = new ArrayList<>(Arrays.asList(tagai));
        this.pagaminimoData = pagaminimoData;
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
        this.kiekis = kiekis;
    }

    public List<String> getTagai() {
        return tagai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPagaminimoData() {
        return pagaminimoData;
    }

    public void setPagaminimoData(Integer pagaminimoData) {
        this.pagaminimoData = pagaminimoData;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }

    public Integer getKiekis() {
        return kiekis;
    }

    public void setKiekis(Integer kiekis) {
        this.kiekis = kiekis;
    }
}
