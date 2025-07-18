package ereditarieta;

public class ProvaStudente {
    public static void main(String[] args) {
        Studente s1 = new Studente("Mario", "Rossi", 20, 123);
//        s1.setNome("Mario");
//        s1.setCognome("Rossi");
//        s1.setEta(20);
//        s1.setMatricola(123);

        System.out.println(s1.getNome());

        //System.out.println(s1.visualizza());

        System.out.println(s1.toString());
        System.out.println(s1);

        Studente s2 = new Studente("Mario", "Rossi", 20, 123);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1==s2);

        Persona p = new Studente("Mario", "Rossi", 34, 1);

        Computer computer = new Computer("M1", "Apple", 15);

        s1.setComputer(computer);

        System.out.println(s1);


        //il cast esplicito va a buon fine se il tipo dinamico della variabile superclasse è un oggetto dello stesso tipo
        //del tipo del cast
        Studente s = (Studente)p;

        System.out.println(s.getMatricola());


    }
}
