package collection;

import ereditarieta.Studente;

import java.util.HashSet;

public class ProvaSet {

    public static void main(String[] args) {
        HashSet<String> parole = new HashSet<>();

        parole.add("java");
        parole.add("html");
        parole.add("css");
        parole.add("spring");

        System.out.println(parole);
        //non viene inserito perchè è un duplicato
        parole.add("html");

        System.out.println(parole);

        HashSet<Studente> studenti = new HashSet<>();

        Studente s1 = new Studente("Mario", "Rossi", 30, 1);
        Studente s2 = new Studente("Carlo", "Bianchi", 24, 2);
        Studente s3 = new Studente("Francesca", "Verdi", 27,3);
        Studente s4 = new Studente("Mario", "Rossi", 30, 1);

        studenti.add(s1);
        studenti.add(s2);
        studenti.add(s3);
        studenti.add(s4);

        System.out.println(studenti);
    }
}
