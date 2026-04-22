package Exercici3;

public class ex3 {
    public static void main(String[] args) {

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
