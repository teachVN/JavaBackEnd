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
    }
}
