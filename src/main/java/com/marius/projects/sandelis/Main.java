package com.marius.projects.sandelis;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Preke p = new Preke();
        List<Preke> prekes = new ArrayList<>();

        prekes.add(new Preke(0,"Vanduo", 1876, 0.60, 115, "gaivusisGerimas"));
        prekes.add(new Preke(1,"CocaCola", 1915, 1.30, 70, "gaivusisGerimas"));
        prekes.add(new Preke(2,"SvytEkstra", 1948, 1.20, 40, "lengvasisAlko"));
        prekes.add(new Preke(3,"Fanta", 1927, 1.30, 70, "gaivusisGerimas"));
        prekes.add(new Preke(4,"Heineken", 1913, 1.60, 35, "lengvasisAlko"));
        prekes.add(new Preke(5,"Carlsberg", 1847, 1.55, 58, "lengvasisAlko"));
        prekes.add(new Preke(6,"Diuse", 1899, 0.99, 80, "gaivusisGerimas"));
        prekes.add(new Preke(7,"Malunininku", 1871, 12.80, 20, "stirpusAlko"));
        prekes.add(new Preke(8,"Finlandia", 1936, 15.90, 30, "stiprusAlko"));
        prekes.add(new Preke(9,"Sprite", 1927, 1.30, 66, "gaivusisGerimas"));
        prekes.add(new Preke(10,"JackDaniels", 1818, 19.99, 14, "stiprusAlko"));
        prekes.add(new Preke(11,"Saltinelis", 1962, 1.10, 59, "gaivusisGerimas"));
        prekes.add(new Preke(12,"Bushmills", 1894, 17.50, 15, "stiprusAlko"));

        Sandelis s = new Sandelis(prekes);
       List<Preke> paieskosRezultatas = s.searchPreke("19.99");
       for (Preke pr: paieskosRezultatas){


           System.out.println(pr.getId());
       }


    }
}
