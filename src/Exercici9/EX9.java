package Exercici9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EX9 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        fill(l1);
        List<Integer> l2 = new LinkedList<Integer>();
        fill(l2);
        //Primer test (arraylist)
        test2(l1);
        //segon test(Linkedlist)
        test2(l2);
    }

    static void test2(List<Integer> list) {
        System.out.println("comienza test");
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int random = (int) (Math.random() * list.size());
            int element = list.remove(random);
            list.add(random);
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
