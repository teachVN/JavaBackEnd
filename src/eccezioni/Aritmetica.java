package eccezioni;

public class Aritmetica {

    public int divisione(int a, int b) throws DivisionePer0Exception{

        int risultato=0;

        if(b!=0)
            risultato=a/b;
        else{
            throw new DivisionePer0Exception("Divisione per 0 non ammessa");
        }

        return risultato;
    }
}
