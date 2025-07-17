package classi;

public class ProvaPunto {

    public static void main(String[] args) {
        //p1 è la variabile di riferimento della classe Punto, mentre new Punto è l'oggetto della classe Punto
        Punto p1 = new Punto();

        System.out.println(p1.getX());
        System.out.println(p1.getY());

        p1.setX(3);
        p1.setY(6);

        System.out.println(p1.getX());
        System.out.println(p1.getY());

        Punto p2 = new Punto(6,7);

        System.out.println(p2.getX());
        System.out.println(p2.getY());

        p2.setX(5);
        p2.setY(9);

        System.out.println(p2.getX());
        System.out.println(p2.getY());

        p1.muoviPunto(10,15);

        System.out.println(p1.getX());
        System.out.println(p1.getY());

        double distanza = p1.distanzaDaOrigine();

        System.out.println(distanza);

        Punto p3 = p2;

        p3.setX(14);

        System.out.println(p2.getX());
        //la variabile di riferimento non è collegata a nessun oggetto
        p2 = null;

        if(p2!=null)
            System.out.println(p2.getX());

        p2 = new Punto(3,4);

        System.out.println(p2.getX());

        p2 = p3;

        System.out.println(p2.getX());
    }

}
