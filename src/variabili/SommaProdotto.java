package variabili;

import java.util.Scanner;

public class SommaProdotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi il primo numero");
        int n1 = scanner.nextInt();

        System.out.println("Dammi il secondo numero");
        int n2 = scanner.nextInt();

        if(n1>0&&n2>0){
            System.out.println(n1+n2);
        }
        else{
            System.out.println(n1*n2);
        }

    }
}
