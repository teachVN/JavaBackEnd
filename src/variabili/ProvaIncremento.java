package variabili;

public class ProvaIncremento {

    public static void main(String[] args) {
        int x = 4;

        x = x + 1;

        System.out.println(x);

        x++;

        System.out.println(x);

        ++x;

        System.out.println(x);

        int y = 3 + (++x);//pre incremento: prima l'incremento e poi l'operazione di somma

        System.out.println(y);

        int j = 3 + (x++);//post incremento: prima l'operazione e poi dopo l'incremento

        System.out.println(j);

        System.out.println(x);

        System.out.println(x!=j);

        boolean prova = (x==y)&&(j>(++x));

        System.out.println("la x vale " + x);

        System.out.println("la y vale " + y);

        System.out.println("la j vale " + j);

        System.out.println(prova);
    }
}
