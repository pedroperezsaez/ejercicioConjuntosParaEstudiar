package Exercici4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("Spain"));
        countryList.add(new Country("Alemania"));
        countryList.add(new Country("Japon"));
        countryList.add("Andorra");
        barajarPaises(countryList);


    }

    public static void barajarPaises(List<Country> countryList) {
        for (int i = 0; i < 5; i++) {
            System.out.println(countryList);
            Collections.shuffle(countryList);
        }
    }
}

class Country {
    String pais;

    Country(String pais) {
        this.pais = pais;
    }

    public String toString() {
        return pais;
    }
}
