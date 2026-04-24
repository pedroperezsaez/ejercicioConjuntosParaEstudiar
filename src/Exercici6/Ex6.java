package Exercici6;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
// 6. Tenim una classe anomenada «IntList» que serà subclasse de «AbstractList»:
public class Ex6 {
    public static void main(String[] args) {
        List il = new IntList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
// Comprova que el mètode «size()» funciona
        int size = il.size();
        System.out.println("size " + size);

// Comprova que es poden treure elements amb «get()»
        System.out.println("Tercer element:" + il.get(2));
// Què passa si intento afegir elements (il.add(10))?
        il.add(10);
        System.out.println(il);
// Recórre la llista amb un Iterador
        Iterator it = il.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
// Comprova si funciona el mètode «contains()»
        System.out.println("Llista conté el numero 5: " + il.contains(5));
        System.out.println("Llista conté el numero 20: " + il.contains(20));
// Comprova si funciona el mètode «sublist()»
        List sublist = il.subList(0, 3);
        System.out.println(sublist);
// Comprova si funciona el mètode «remove()»
        il.remove(5);
        System.out.println(il);
// Converteix la llista a un Array d'Objects i imprimeix-la
        Object[] ar = il.toArray();
        System.out.println(Arrays.toString(ar));
    }

}

class IntList extends AbstractList {
    Integer[] data;

    IntList(int[] data) {
        this.data = new Integer[data.length];
        for (int i = 0; i < data.length; i++) {
            this.data[i] = data[i];
        }
    }

    @Override
    public Object remove(int index) {
        if (index >= this.data.length) {
            throw new RuntimeException("No podem eliminar l'element a la posició" + index);
        }
        Integer[] ar = new Integer[this.data.length - 1];
        int valor = this.data[index];
        int ind2 = 0;
        for (int i = 0; i < this.data.length; i++) {
            if (i == index) continue;
            ar[ind2] = this.data[i];
            ind2++;
        }
        this.data = ar;
        return valor; //esto sirve para retornar el valor que eliminamos

    }

    @Override
    public Object get(int index) {
        return this.data[index];
    }

    @Override
    public int size() {
        return this.data.length;
    }

    @Override
    public boolean add(Object o) {
        Integer[] ar = new Integer[this.data.length + 1];
        for (int i = 0; i < this.data.length; i++) {
            ar[i] = this.data[i];
        }
        ar[ar.length - 1] = (Integer) o;
        this.data = ar;
        return true;
    }
}
