package com.marius.projects.sandelis;

public class Preke {

    private Integer id;
    private Integer pagaminimoData;
    private String pavadinimas;
    private Double kaina;
    private Integer kiekis;

    public Preke(Integer id, Integer pagaminimoData, String pavadinimas, Double kaina, Integer kiekis) {
        this.id = id;
        this.pagaminimoData = pagaminimoData;
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
        this.kiekis = kiekis;
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
