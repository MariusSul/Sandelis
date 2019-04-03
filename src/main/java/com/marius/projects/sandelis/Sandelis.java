package com.marius.projects.sandelis;

import java.util.ArrayList;
import java.util.List;

public class Sandelis {

    private Kategorija katalogas;

    private List<Preke> prekes = new ArrayList<>();

    public Sandelis(Kategorija katalogas, List<Preke> prekes) {
        this.katalogas = katalogas;
        this.prekes = prekes;
    }

    public Kategorija getKatalogas() {
        return katalogas;
    }

    public void setKatalogas(Kategorija katalogas) {
        this.katalogas = katalogas;
    }

    public List<Preke> getPrekes() {
        return prekes;
    }

    public void setPrekes(List<Preke> prekes) {
        this.prekes = prekes;
    }
}
