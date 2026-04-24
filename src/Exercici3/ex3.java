package Exercici3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("John", 1990));
        persons.add(new Person("Mary", 1981));
        persons.add(new Person("Tom", 2000));
        persons.add(new Person("Elisabeth", 1999));
        Collections.sort(persons, new PersonBirthComparator());
        System.out.println(persons);
        Collections.sort(persons, new PersonNameComparator());
        System.out.println(persons);
    }
}
class PersonBirthComparator implements  Comparator<Person>{
    @Override
    public  int compare(Person o1, Person o2){
        // sirve para devolve numero negativo, positivo o  o para saber si es menor mayor o igual las dos comparaciones
        return o1.birthYear - o2.birthYear;
    }
}
class PersonNameComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        //Mirar quinadels dos noms es mes curt i despres fer un bucle per cada lletra, i si en trobam dues de diferents
        //ja podem saber quina es la mes gran
        String s1 = o1.name;
        String s2 = o2.name;
        boolean intercanvi = false;
        if (s1.length()>s2.length()){
            String t=s1;
            s1=s2;
            s2=t;
            intercanvi=true;
        }
        for (int i = 0; i < s1.length(); i++) {
            char c1=s1.charAt(0);
            char c2= s2.charAt(0);
            if (c1<c2){
                return intercanvi ? 1 : -1;
            }
            if (c2<c1){
                return intercanvi ? -1 : 1;
            }
        }
        if (s1.length()== s2.length()) return 0;
        // s2 seria mas larga
        if (intercanvi){
            return -1;
        }
        return 1;
    }
}

class Person {
    int birthYear;
    String name;
    Person(String name, int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format("%s %d", name, birthYear);
    }
}
