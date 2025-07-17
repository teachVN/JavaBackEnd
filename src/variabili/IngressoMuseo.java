package variabili;

import java.util.Scanner;

public class IngressoMuseo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli le opzioni tra 1 o 4");
        int scelta = scanner.nextInt();

//        if(scelta==1){
//            System.out.println("Ingresso gratuito");
//        }
//        else if(scelta==2){
//            System.out.println("Costo biglietto 8€");
//        }
//        else if(scelta==3){
//            System.out.println("Costo biglietto 10€");
//        }
//        else if (scelta==4){
//            System.out.println("Costo biglietto 15€");
//        }
//        else{
//            System.out.println("Scelta sbagliata");
//        }

        switch (scelta){
            case 1,2:
                System.out.println("Ingresso gratuito");
                break;
//            case 2:
//                System.out.println("Costo biglietto 8€");
//                break;
            case 3:
                System.out.println("Costo biglietto 10€");
                break;
            case 4:
                System.out.println("Costo biglietto 15€");
                break;
            default:
                System.out.println("Scelta sbagliata");
        }



    }
}
