package com.marius.projects.sandelis;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    @Test
    public void search() {

        List<Preke> prekes = new ArrayList<>();

        prekes.add(new Preke(0,"Vanduo", 1876, 0.60, 115, "gaivusisGerimas"));
        prekes.add(new Preke(1,"CocaCola", 1915, 1.30, 70, "gaivusisGerimas"));
        prekes.add(new Preke(2,"SvytEkstra", 1948, 1.20, 40, "lengvasisAlko"));
        prekes.add(new Preke(3,"Fanta", 1927, 1.30, 70, "gaivusisGerimas"));
        prekes.add(new Preke(4,"Heineken", 1913, 1.60, 35, "lengvasisAlko"));

        Sandelis sandelis = new Sandelis(prekes);
        List<Preke> availablePrekes = sandelis.searchPreke("Labas");

        Assert.assertEquals(0, availablePrekes.size());


    }
}
