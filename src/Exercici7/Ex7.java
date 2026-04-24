package Exercici7;

import java.util.ArrayList;
import java.util.List;
//7. Crea les classes «Cat» i «Dog». Ara crea una llista on es pugui inserir objectes de les dues classes
//següents. Fes un bucle on es tregui element per element i indiqui si es tracta d'un «Cat» o un «Dog».
public class Ex7 {
    public static void main(String[] args) {
        List<Object> animales = new ArrayList<>();
        animales.add(new Cat("gato1"));
        animales.add(new Dog("perro1"));
        animales.add(new Cat("gato2"));
        animales.add(new Dog("Perro2"));

        tipoAnimal(animales);

    }

    static void tipoAnimal(List<Object> animales) {
        for (int i = 0; i < animales.size(); i++) {
            Object o = animales.get(i);
            if (o instanceof Dog) {
                System.out.println(animales.get(i) + " es un  perro");
            } else if (o instanceof Cat) {
                System.out.println(animales.get(i) + " es un gato");
            }

        }
    }


}

class Cat {
    String nombre;

    Cat(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "El nom és: " + nombre;
    }
}

class Dog {
    String nombre;

    Dog(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "el nom és: " + nombre;
    }


}
