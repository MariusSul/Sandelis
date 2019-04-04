package com.marius.projects.sandelis;

import java.util.ArrayList;
import java.util.List;

public class Sandelis {

    //   private Kategorija katalogas;

    private List<Preke> prekes = new ArrayList<>();

    public Sandelis(List<Preke> prekes) {

        this.prekes = prekes;
    }


    public List<Preke> getPrekes() {
        return prekes;
    }

    public void setPrekes(List<Preke> prekes) {
        this.prekes = prekes;
    }
}
