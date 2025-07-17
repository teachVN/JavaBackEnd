package variabili;

import java.util.Scanner;

public class PositivoNegativoNullo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dammi un numero");
        int n = scanner.nextInt();

        if(n>0){
            System.out.println("il numero è positivo");
        }
        else if(n<0){
            System.out.println("il numero è negativo");
        }
        else{
            System.out.println("il numero è 0");
        }
        //questo è un comando per svuotare il buffer del canale di comunicazione tra tastiera e programma
        //se non lo usiamo, quando si passa da scanner.nextint a scanner.nextline, il nextline viene saltato
        scanner.nextLine();

        System.out.println("dammi una parola");
        String parola = scanner.nextLine();

        System.out.println(parola);




    }
}
