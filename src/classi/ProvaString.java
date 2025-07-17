package classi;

public class ProvaString {
    public static void main(String[] args) {
        String parola = "corso backend";

        //il metodo charAt permette di estrarre il carattere dalla Stringa ad un determinato indice
        System.out.println(parola.charAt(4));

        System.out.println(parola.charAt(parola.length()-1));

        System.out.println(parola.equals("corso Backend"));

        //confronta le stringhe ignorando il case
        System.out.println(parola.equalsIgnoreCase("corso Backend"));

        //verifica se la parola inizia con un determinato prefisso
        System.out.println(parola.startsWith(" corso"));

        System.out.println(parola.toUpperCase());

        System.out.println(parola);

        System.out.println(parola.compareTo("Corso java"));

        //verifica se la sequenza di caratteri che sto cercando, si trova nella Stringa
        System.out.println(parola.contains("orso"));

        //estrae l'indice al quale si trova il carattere che sto cercando
        System.out.println(parola.indexOf('o',2));

        //restituisce true se la stringa contiene solo spazi o è vuota
        System.out.println(" c".isBlank());

        //verifica se la stringa è vuota
        System.out.println(" ".isEmpty());

        //sostituisce nella parola un carattere con un altro
        System.out.println(parola.replace('o','i'));

        //permette di separare le stringhe all'interno di una stringa indicando qual'è il carattere separatore
        String[] parole = parola.split(" ");

        for(String s:parole){
            System.out.println(s);
        }

        //estrae una sottostringa dalla stringa iniziale a partire dall'indice indicato
        System.out.println(parola.substring(3));

        //estrae una sottostringa dalla stringa iniziale tra i 2 indici indicati
        System.out.println(parola.substring(3, 5));

    }


}
