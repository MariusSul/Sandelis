package com.marius.projects.sandelis;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    @Test
    public void searchByTag() {

        List<Preke> prekes = new ArrayList<>();

        prekes.add(new Preke(0, "Vanduo", 1111, 0.60, 115, "preketag"));
        prekes.add(new Preke(1, "VANDUO", 2222, 1.30, 70, "preketag"));
        prekes.add(new Preke(2, " Vanduo ", 3333, 1.20, 40, "preke"));
        prekes.add(new Preke(3, "vanduo", 4444, 1.30, 70, "preke"));


        Sandelis sandelis = new Sandelis(prekes);
        List<Preke> availablePrekes = sandelis.searchPreke("TAG");

        Assert.assertEquals(2, availablePrekes.size());


    }

    @Test
    public void searchByAny() {

        List<Preke> prekes = new ArrayList<>();
        Preke preke0 = new Preke(1111, "ergdgf", 1, 0.60, 115, "preketag");
        prekes.add(preke0);
        Preke preke1 = new Preke(0, "1111", 1, 0.60, 115, "preketag");
        prekes.add(preke1);
        Preke preke2 = new Preke(1, "VANDUO", 2, 1.30, 70, "1111");
        prekes.add(preke2);
        Preke preke3 = new Preke(2, " Vanduo ", 1111, 1.20, 40, "preke");
        prekes.add(preke3);
        Preke preke4 = new Preke(3, "vanduo", 4, 1.30, 1111, "preke");
        prekes.add(preke4);
        Preke preke5 = new Preke(3, "vanduo", 5, 1111.0, 1, "preke");
        prekes.add(preke5);



        Sandelis sandelis = new Sandelis(prekes);
        List<Preke> availablePrekes = sandelis.searchPreke("1111");

        Assert.assertEquals(5, availablePrekes.size());
        Assert.assertTrue(availablePrekes.contains(preke0));
        Assert.assertTrue(availablePrekes.contains(preke1));
        Assert.assertTrue(availablePrekes.contains(preke2));
        Assert.assertTrue(availablePrekes.contains(preke3));
        Assert.assertTrue(availablePrekes.contains(preke4));
        Assert.assertFalse(availablePrekes.contains(preke5));

    }

    @Test
    public void search() {

        List<Preke> prekes = new ArrayList<>();

        prekes.add(new Preke(0, "Vanduo", 1111, 0.60, 115, "preketag"));
        prekes.add(new Preke(1, "VANDUO", 2222, 1.30, 70, "preketag"));
        prekes.add(new Preke(2, " Vanduo ", 3333, 1.20, 40, "preke"));
        prekes.add(new Preke(3, "vanduo", 4444, 1.30, 70, "preke"));


        Sandelis sandelis = new Sandelis(prekes);
        List<Preke> availablePrekes = sandelis.searchPreke("uO");

        Assert.assertEquals(4, availablePrekes.size());


    }

    @Test
    public void searchBynumberNtFound() {

        List<Preke> prekes = new ArrayList<>();

        prekes.add(new Preke(0, "Vanduo", 1111, 0.60, 115, "preketag"));
        prekes.add(new Preke(1, "VANDUO", 2222, 1.30, 70, "preketag"));
        prekes.add(new Preke(2, " Vanduo ", 3333, 1.20, 40, "preke"));
        prekes.add(new Preke(3, "vanduo", 4444, 1.30, 70, "preke"));


        Sandelis sandelis = new Sandelis(prekes);
        List<Preke> availablePrekes = sandelis.searchPreke("33");

        Assert.assertEquals(0, availablePrekes.size());


    }

    @Test
    public void searchBynumberFound() {

        List<Preke> prekes = new ArrayList<>();

        prekes.add(new Preke(0, "Vanduo", 1111, 0.60, 115, "preketag"));
        prekes.add(new Preke(1, "VANDUO", 2222, 1.30, 70, "preketag"));
        prekes.add(new Preke(2, " Vanduo ", 3333, 1.20, 40, "preke"));
        prekes.add(new Preke(3, "vanduo", 4444, 1.30, 70, "preke"));


        Sandelis sandelis = new Sandelis(prekes);
        List<Preke> availablePrekes = sandelis.searchPreke("3333");

        Assert.assertEquals(1, availablePrekes.size());


    }

    @Test
    public void emptyStorage() {

        List<Preke> prekes = new ArrayList<>();


        Sandelis sandelis = new Sandelis(prekes);
        List<Preke> availablePrekes = sandelis.searchPreke("a");
        Assert.assertEquals(0, availablePrekes.size());


    }

    @Test
    public void searchByPrice() {

        List<Preke> prekes = new ArrayList<>();
        Preke preke0 = new Preke(1111, "ergdgf", 1, 0.60, 115, "preketag");
        prekes.add(preke0);
        Preke preke1 = new Preke(0, "1111", 1, 0.60, 115, "preketag");
        prekes.add(preke1);
        Preke preke2 = new Preke(1, "VANDUO", 2, 1.30, 70, "1111");
        prekes.add(preke2);
        Preke preke3 = new Preke(2, " Vanduo ", 1111, 1.20, 40, "preke");
        prekes.add(preke3);
        Preke preke4 = new Preke(3, "vanduo", 4, 1.30, 1111, "preke");
        prekes.add(preke4);
        Preke preke5 = new Preke(3, "vanduo", 5, 1111.0, 1, "preke");
        prekes.add(preke5);



        Sandelis sandelis = new Sandelis(prekes);
        List<Preke> availablePrekes = sandelis.searchPreke("1.3");

        Assert.assertEquals(2, availablePrekes.size());
        Assert.assertFalse(availablePrekes.contains(preke0));
        Assert.assertFalse(availablePrekes.contains(preke1));
        Assert.assertTrue(availablePrekes.contains(preke2));
        Assert.assertFalse(availablePrekes.contains(preke3));
        Assert.assertTrue(availablePrekes.contains(preke4));
        Assert.assertFalse(availablePrekes.contains(preke5));

    }
}
