package classi;

public class Punto {
    //x e y sono variabili di istanza
    private int x;
    private int y;


    //questo è il costruttore di default che java inserisce nella classe quando noi non ne creiamo uno
    public Punto(){

    }

    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }

    //questo metodo modifica lo stato dell'oggetto e per questo solitamente non ha tipo di ritorno
    public void muoviPunto(int x, int y){

        this.x=x;
        this.y=y;
    }

    //metodo che fa un calcolo e torna il valore. Bisogna mettere il tipo di ritorno adatto e usare return per tornare il valore
    public double distanzaDaOrigine(){
        double distanza = Math.sqrt(x*x+y*y);

        return distanza;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }
}
