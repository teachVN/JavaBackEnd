package classi;

public class ContaIstanze {

    private static int contatore;

    public static int getContatore(){
        return contatore;
    }

    public ContaIstanze(){
        contatore++;
    }
}
