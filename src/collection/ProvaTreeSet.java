package collection;

import ereditarieta.Persona;

import java.util.Comparator;
import java.util.TreeSet;

public class ProvaTreeSet {

    public static void main(String[] args) {
        TreeSet<String> parole = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        parole.add("Java");
        parole.add("Javascript");
        parole.add("Html");
        parole.add("Java");

        System.out.println(parole);

        TreeSet<Integer> numeri = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        numeri.add(67);
        numeri.add(45);
        numeri.add(56);
        numeri.add(3);

        System.out.println(numeri);

        TreeSet<Persona> persone = new TreeSet<>(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return ((Integer)o2.getEta()).compareTo(o1.getEta());
            }
        });

        Persona p1 = new Persona("Mario", "Rossi", 25);
        Persona p2 = new Persona("Fabio", "Verdi", 27);
        Persona p3 = new Persona("Sara", "Bianchi", 33);

        persone.add(p1);
        persone.add(p2);
        persone.add(p3);

        System.out.println(persone);
    }
}
