package eccezioni;

public class ProvaDivisione {

    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();

        try{
            System.out.println(aritmetica.divisione(3,0));
        }
        catch (DivisionePer0Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("Operazione conclusa");
    }
}
