package classi;

public class ProvaContaIstanze {

    public static void main(String[] args) {
        ContaIstanze c1 = new ContaIstanze();

        System.out.println(ContaIstanze.getContatore());

        ContaIstanze c2 = new ContaIstanze();

        System.out.println("----------------");

        System.out.println(ContaIstanze.getContatore());
        System.out.println(ContaIstanze.getContatore());

        ContaIstanze c3 = new ContaIstanze();

        System.out.println("----------------");

        System.out.println(ContaIstanze.getContatore());
        System.out.println(ContaIstanze.getContatore());
        System.out.println(ContaIstanze.getContatore());

        System.out.println(Math.PI);
    }
}
