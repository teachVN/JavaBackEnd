package collection;

import ereditarieta.Persona;

import java.util.Comparator;
import java.util.TreeMap;

public class ProvaTreeMap {

    public static void main(String[] args) {
        TreeMap<String, Persona> anagrafica = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        Persona p1 = new Persona("Mario", "Rossi", 25);
        Persona p2 = new Persona("Fabio", "Verdi", 27);
        Persona p3 = new Persona("Sara", "Bianchi", 33);

        anagrafica.put("LKSJDLFKSJF", p1);
        anagrafica.put("LKSDJFSDID", p2);
        anagrafica.put("IUIWEREWWW", p3);

        System.out.println(anagrafica);
    }
}
