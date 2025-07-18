package ereditarieta;

public class ProvaAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("A1", 3);

        Studente s1 = new Studente("Mario1", "Rossi", 23, 1);
        Studente s2 = new Studente("Mario2", "Rossi", 23, 2);
        Studente s3 = new Studente("Mario3", "Rossi", 23, 3);
        Studente s4 = new Studente("Mario4", "Rossi", 23, 4);

        System.out.println(a1.inserisciStudente(s1));
        System.out.println(a1.inserisciStudente(s2));
        System.out.println(a1.inserisciStudente(s3));
        System.out.println(a1.inserisciStudente(s4));

        a1.stampaAula();


    }
}
