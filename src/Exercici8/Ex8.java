package Exercici8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//8. Anem a comprovar el rendiment de ArrayList front a LinkedList per accessos aleatoris:
//La vostra tasca és implementar els procediments «fill», que agafa una llista i hi inserta 5 milions
//d'elements aleatoris (empreu java.util.Random), i també el procediment «test», que el que fa és
//accedir als elements de la llista de manera aleatòria 1000 vegades. Pista: utilitzeu el procediment
//«System.currentTimeMillis()» per controlar el temps d'execució.
public class Ex8 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        fill(l1);
        List<Integer> l2 = new LinkedList<Integer>();
        fill(l2);
        //Primer test (arraylist)
        test(l1);
        //segon test(Linkedlist)
        test(l2);
    }

    static void test(List<Integer> list) {
        System.out.println("comienza test");
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int random = (int) (Math.random() * list.size());
            int element = list.get(random);
        }
        long time2 = System.currentTimeMillis();
        long elapsed = time2 - time1;
        System.out.println("han pasado: " + elapsed + " ms");
    }

    static void fill(List<Integer> list) {
        for (int i = 0; i < 5_000_000; i++) {
            int random = (int) (Math.random() * 5000);
            list.add(random);
        }
    }


}
