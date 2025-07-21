package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ProvaList {

    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>(10);

        //aggiunge i valori nella lista
        numeri.add(6);
        numeri.add(8);
        numeri.add(10);

        for(Integer i:numeri){
            System.out.println(i);
        }

        for(int i=0; i<numeri.size();i++){
            System.out.println(numeri.get(i));
        }

        System.out.println(numeri);

        //verifica se un determinato elemento è presente nella lista
        System.out.println(numeri.contains(6));

        //cancella il contenuto della lista
//        numeri.clear();
//
//        System.out.println(numeri);

        //verifica se la lista è vuota
        System.out.println(numeri.isEmpty());

        System.out.println(numeri.indexOf(8));

        numeri.remove((Integer)10);

        System.out.println(numeri);

        //sostituisce valori della lista
        numeri.set(1, 2);

        System.out.println(numeri);
        //ordina i numeri o le stringhe in ordine crescente
        numeri.sort(Comparator.naturalOrder());

        System.out.println(numeri);
    }
}
