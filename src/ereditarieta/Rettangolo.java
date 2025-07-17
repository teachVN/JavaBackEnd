package ereditarieta;

public class Rettangolo extends Poligono implements PoligonoUtility{
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double area() {
        return base*altezza;
    }

    @Override
    public double perimetro() {
        return base*2+altezza*2;
    }

    @Override
    public boolean stessaArea(Rettangolo r) {
        if(area()==r.area()){
            return true;
        }
        return false;
    }
}
