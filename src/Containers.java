import java.util.*;


public class Containers {
    public static void main(String[] args) {
        System.out.println("--- LListes1 ---");
        llistes1();
        System.out.println("--- Iterators ---");
        iterators();
        System.out.println("--- Cua ---");
        cues();
        System.out.println("--- Piles ---");
        piles();
        System.out.println("--- Conjunts ---");
        conjunts();
        System.out.println("--- Mapes ---");
        mapes();

    }

    static void llistes1() {
        // Crea llista d'enters anomenada "l1"
        List<Integer> l1= new ArrayList<>();
        // Afegeix els números 10, 20 i 15
        l1.add(10);
        l1.add(20);
        l1.add(15);

        // Imprimeix la llista
        System.out.println(l1);

        // Elimina el segon element
        l1.remove(1);
        // Imprimeix la llista
        System.out.println(l1);


        // Crea llista d'enters anomenada "l2"
        List<Integer> l2=new ArrayList<>();
        // Afegeix els números 3, 6 i 9
        l2.add(3);
        l2.add(6);
        l2.add(9);
        // Afegeix la llista l1 a la llista l2
        l2.addAll(l1);
        // Imprimeix la llista l2
        System.out.println(l2);
        // Elimina tots els valors de l1
        l1.clear();

        // Afegeix els tres primers elements de l2 a l1
        for (int i = 0; i < 3; i++) {
            l1.add(l2.get(i));
        }
        // Comprova si dins l1 hi ha el número 6
        System.out.println(l1.contains(6));

        // Afegeix el numero 6 un altre cop a l1 al principi de la llista
        l1.addFirst(6);


        // Cerca la posicio de l'element que te el numero 9 a la llista l1
        System.out.println(l1.indexOf(9));

        // A l1, substitueix l'element a la posició 1 per el valor 5
        l1.set(1,5);

        // A l1, insereix a la posició 2 l'element 4
        l1.add(2,4);

        // Imprimeix la llista l1
        System.out.println(l1);
        // Converteix l1 a array i imprimeix-ho
        int[] ar =new int[l1.size()];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=l1.get(i);
        }
        System.out.println(Arrays.toString(ar));
    }

    static void iterators() {
        // Crea llista d'enters anomenada "l1"
        List<Integer> l1=new ArrayList<>();

        // Afegeix a l1 els elements 10, 20, 50 i 90
        l1.add(10);
        l1.add(20);
        l1.add(50);
        l1.add(90);
        // Treu Iterator (it)
        Iterator<Integer> it=l1.iterator();
        // Mentre hi hagi element següent, imprimeix l'element
       while (it.hasNext()){
           System.out.println(it.next());
       }
        // Torna a crear l'objecte iterator i has de recórrer la llista, però has d'esborrar l'element "50"
            Iterator<Integer> it2=l1.iterator();
            while (it2.hasNext()) {
                int el = it2.next();
                if (el == 50) {
                    it2.remove();
                }
                System.out.println(el);
            }

        // Imprimeix la llista
        System.out.println(l1);

        // Crea un ListIterator de la llista l1 (anomenat "li")
        ListIterator<Integer> li=l1.listIterator();
 
        // Avança l'iterador fins al final de la llista
            while (li.hasNext()){
                System.out.println(li.next());
            }

        // Recorre la llista al reves amb l'iterador, imprimint els elements
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }

        // Torna a recorrer la llista amb l'iterador, pero aquest cop imprimeix tambe l'index de l'element
        while (li.hasNext()){
            System.out.println(li.next()+ " "+ li.nextIndex());
        }
    }

    static void cues() {
        // Declara una cua (anomenada "cua") com una LinkedList
        Queue<Integer> cua=new LinkedList<>();
        // Afegeix els elements 12, 14 i 99 a la cua
            cua.offer(12);
            cua.offer(14);
            cua.offer(99);

        // Mostra el primer element (sense treurer-lo) de la cúa i imprimeix-ho
        Integer i= cua.peek();
        System.out.println(i);
        System.out.println(cua);

        // Treu el primer element de la cúa
        cua.poll();
        // Imprimeix la cúa
        System.out.println(cua);

        // Declara una cúa de prioritat anomenada "cuaPrioritat"
        PriorityQueue<Integer> cuaPrioritat=new PriorityQueue<>();

        // Afegeix els elements 5, 2, -1, 9 i 7
            cuaPrioritat.offer(5);
            cuaPrioritat.offer(2);
            cuaPrioritat.offer(-1);
            cuaPrioritat.offer(9);
            cuaPrioritat.offer(7);
        // Imprimeix la cúa
        System.out.println(cuaPrioritat);

        // Fes un bucle que vagi traient cada element i l'imprimeixi de la cúa de prioritat, mentre en quedin
       while (!cuaPrioritat.isEmpty()){
           Integer el= cuaPrioritat.poll();
           System.out.println(el);
       }

    }

    static void piles() {
        // Declara una pila (stack) com una LinkedList
        LinkedList<Integer> stack=new LinkedList<>();


        // Push a la pila dels valors 15, 56, 21 i -5
        stack.push(15);
        stack.push(56);
        stack.push(21);
        stack.push(-5);
        // Imprimeix la pila
        System.out.println(stack);

        // Imprimeix el valor de damunt la pila, sense treurer-lo
        System.out.println(stack.peekFirst());

        // Treu i imprimeix els valors de la pila
      while (!stack.isEmpty()){
          Integer element = stack.pop();
          System.out.println(element);
      }

    }

    static void conjunts() {
        // Declara un conjunt d'enters anomenat "set"
            Set<Integer> set=new HashSet<>();
        // Afegeix els elements 14, 6 i 3
            set.add(14);
            set.add(6);
            set.add(3);
        // Imprimeix el conjunt
        System.out.println(set);
        // Afegeix l'element 6 un altre cop
        set.add(6);

        // Imprimeix el conjunt
        System.out.println(set);


        // Construeix un conjunt de caràcters anomenat set2 (Usa la class Character, no char)
        // i introdueix totes les lletres de la paraula "ESTERNOCLEIDOMASTOIDEO"
        // Després, imprimeix el conjunt
        Set<Character> set2=new HashSet<>();
        String paraula="ESTERNOCLEIDOMASTOIDEO";
        for (int i = 0; i < paraula.length(); i++) {
            char c=paraula.charAt(i);
            set2.add(c);
        }
        System.out.println(set2);

        // Empra un iterador (it) per recórrer tot el conjunt de caràcters anterior i imprimeix element a element
        Iterator<Character> it=set2.iterator();
        while (it.hasNext()){
            Character c= it.next();
            System.out.println(c);
        }

    }

    static void mapes() {
        // Construeix un mapa (map) que associi un String amb un altre String
            Map<String,String> map=new HashMap<>();
        // Introdueix el parell: "RENAULT" - "CLIO"
            map.put("RENAULT", "CLIO");
        // Introdueix el parell: "VOLKSWAGEN" - "GOLF"
            map.put("VOLSKWAGEN" , "GOLF");
        // Introdueix el parell: "PEUGEOT" - "308"
            map.put("PEUGEOT", "308");
        // Introdueix el parell: "HONDA" - "CIVIC"
            map.put("HONDA", "CIVIC");
        // Introdueix el parell: "PEUGEOT" - "RCZ"
            map.put("PEUGEOT" ,"RCZ" );
        // Imprimeix el mapa
        System.out.println(map);

        // Treu el conjunt de claus del mapa (variable kset)
        Set<String> kset=map.keySet();
        System.out.println(kset);
        // Imprimeix aquest conjunt

        // Treu el valor de la clau "PEUGEOT" i imprimeix-ho
        String valor= map.get("PEUGEOT");

        // Mitjançant un iterador, imprimeix tots els parells clau-valor del mapa
            Iterator<String> it=kset.iterator();
            while (it.hasNext()){
                String k=it.next();
                String v= map.get(k);
                System.out.printf("clau=%s, valor=%s",k, v);
            }

        // Empra un mapa que associi un caràcter a un número enter per dur el compte
        // de quantes vegades surt cada lletra a la paraula "ESTERNOCLEIDOMASTOIDEO"
            Map<Character,Integer> map2 = new HashMap<>();
            String s= "ESTERNOCLEIDOMASTOIDEO";
        for (int i = 0; i < s.length(); i++) {
            Character c= s.charAt(i);
            // si el caracter dentro de "c" sino  esta en el mapa debemos poner el valor correspondiente a 1,
            //si esta dentro del mapa debemos sumas 1
            if (map2.containsKey(c)){
                Integer v = map2.get(c)+1;
                map2.put(c,v);
            }else {
                map2.put(c,1);
            }
        }
        System.out.println(map2);

    }
}

