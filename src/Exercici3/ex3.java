package Exercici3;

import java.util.Comparator;

public class ex3 {
    public static void main(String[] args) {

    }
}
class Person implements Comparator<Person> {
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


    @Override
    public int compare(Person p1, Person p2) {

    }

    public int PersonBirthComparator(Person p1, Person p2) {

    }
}
