package ereditarieta;

public class Quadrato extends Poligono{

    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    @Override
    public double perimetro() {
        return lato*4;
    }

    @Override
    public double area() {
        return lato*lato;
    }


}
