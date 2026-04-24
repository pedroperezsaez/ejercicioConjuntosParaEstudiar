package Exercici4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
 //4. Crea una classe anomenada «Country» (el constructor agafarà el nom del país). Ara crea una
 //llista (ArrayList o LinkedList) anomenada «countryList». Afegeix uns quants objectes a aquesta
 //llista. Ara crida a «Collections.suffle(countryList)» unes quantes vegades, imprimint la llista cada
 //vegada.
public class Ex4 {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("Spain"));
        countryList.add(new Country("Alemania"));
        countryList.add(new Country("Japon"));
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
