package com.marius.projects.sandelis;

import java.util.ArrayList;
import java.util.List;

public class Sandelis {


    private List<Preke> prekes = new ArrayList<>();

    public Sandelis(List<Preke> prekes) {

        this.prekes = prekes;
    }


    public List<Preke> getPrekes() {
        return prekes;
    }

    public List<Preke> searchPreke(String paieskosTxt) {

        paieskosTxt =  apodorotiTxt(paieskosTxt);


        List<Preke> paieskosRez = new ArrayList<>();

        for (int i = 0; i < prekes.size(); i++) {
            if(arAtitinkaPaieskosKriterijus(prekes.get(i),paieskosTxt)){
                paieskosRez.add(prekes.get(i)) ;
            }
        }

        return paieskosRez;
    }

    private String apodorotiTxt(String paieskosTxt) {
        return paieskosTxt.toLowerCase().trim();
    }

    private boolean arAtitinkaPaieskosKriterijus(Preke preke, String paieskosTxt) {
        if(paieskosKriterijusListe(paieskosTxt ,preke.getTagai() )) {

            return true ;
        }
        if (paieskosKriterijus(paieskosTxt ,preke.getPavadinimas(),false)) {
            return true;
        }

        if (paieskosKriterijus(paieskosTxt ,""+preke.getId(),true)) {
            return true;
        }

        if (paieskosKriterijus(paieskosTxt ,""+preke.getKaina(),true)) {
            return true;
        }

        if (paieskosKriterijus(paieskosTxt ,""+preke.getPagaminimoData(),true)) {
            return true;
        }
        return false;
    }

    private boolean paieskosKriterijusListe(String paieskosTxt, List<String> strings) {

        for (String str : strings) {

            if (paieskosKriterijus(paieskosTxt,str,false)){

                return true;
            }
        }

        return false;
    }

    private boolean paieskosKriterijus(String paieskosTxt, String atributas,boolean tikslei) {
        atributas = apodorotiTxt(atributas);
        if (tikslei){
            return atributas.equals(paieskosTxt);
        }
        return atributas.contains(paieskosTxt);

    }
}
