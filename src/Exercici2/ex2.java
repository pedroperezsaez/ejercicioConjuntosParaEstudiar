package Exercici2;

import java.util.PriorityQueue;
import java.util.Queue;
//2. Implementa la classe «Car». El resultat del codi anterior ha d'ésser que ha d'imprimir els objectes
//d'acord amb el valor que es passa juntament amb la marca. És a dir: Fiat, Renault, Volkswagen i
//Mercedes. Pista: implementeu la interfície «Comparable».
public class ex2 {
    public static void main(String[] args) {
        Queue<Car> pq = new PriorityQueue<Car>();
        pq.offer(new Car("Renault", 15));
        pq.offer(new Car("Fiat", 5));
        pq.offer(new Car("Mercedes", 25));
        pq.offer(new Car("Volkswagen", 20));
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

    static class Car implements Comparable<Car> {
        private String marca;
        private int n;

        Car(String marca, int n) {
            this.marca = marca;
            this.n = n;
        }

        @Override
        public int compareTo(Car c) {
            if (this.n == c.n) return 0;
            if (this.n < c.n) return -1;
            return 1;
        }

        @Override
        public String toString() {
            String s = "marca: " + this.marca + "n: " + this.n;
            return s;
        }
    }

}
