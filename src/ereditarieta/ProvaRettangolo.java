package ereditarieta;

public class ProvaRettangolo {

    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(5,9);


        System.out.println(r.perimetro());
        System.out.println(r.area());

        Rettangolo r2 = new Rettangolo(3,15);

        System.out.println(r.stessaArea(r2));
    }
}
