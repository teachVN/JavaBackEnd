package classi;

public class ProvaWrapper {
    public static void main(String[] args) {
        Integer x = 3; //auto boxing

        int i = 6;

        x=i;

        System.out.println(x);

        x=9;

        i=x; //auto unboxing

        int j =Integer.parseInt("45");

        System.out.println(j);


    }
}
