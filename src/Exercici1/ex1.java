//1- Tenim una classe anomenada «Sequence»:
package Exercici1;
import java.util.Iterator;
public class ex1 {
    public static void main(String[] args) {
        Sequence seq = new Sequence();
        for (Integer i : seq) {
            System.out.println(i);
        }
    }
}

class Sequence implements Iterable<Integer> {
    private int[] data = {1, 5, 6, 7, -1, 2};

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(data);
    }
}

class MyIterator implements Iterator<Integer> {
    private int[] data;
    private int index = 0;

    MyIterator(int[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return (index < data.length);
    }

    @Override
    public Integer next() {
        int actual = index;
        index++;
        return data[actual];
    }
}