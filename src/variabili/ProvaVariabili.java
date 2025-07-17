package variabili;

public class ProvaVariabili {

    public static void main(String[] args) {

        int x; //dichiarazione della variabile x

        x=3; //assegnazione della variabile

        x=10; //riassegnazione: sovrascrive il valore precedente della variabile

        int y = 9; //dichiarazione e assegnazione di una variabile

        System.out.println(x); //istruzione per scrivere in console

        final int a=9;

        byte b = 20;

        short s = 7000;

        long l = 243424;

        float f = 3.4f;

        System.out.println(f);

        double d = 2.5;

        char c = 'w';

        boolean b2 = true;

        int j = b + 30;

        System.out.println(j);

        b = (byte)(b + 130); //cast esplicito, per costringere java  a convertire un tipo più grande in uno più piccolo

        System.out.println(b);

        int i = x/y;

        System.out.println(i);

        double d2 = x/d;

        System.out.println(d2);

        i = x%y;

        System.out.println(i);

        i=i+3;

        i+=3;

    }

}
