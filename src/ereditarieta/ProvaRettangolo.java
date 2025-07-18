package ereditarieta;

public class ProvaRettangolo {

    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(2,8);

        //cast implicito: da oggetto di tipo sottoclasse a variabile di tipo superclasse
        //sulla variabile p posso chiamare solo i metodi della superclasse e non quelli della sottoclasse in fase di scrittura
        Poligono p = new Rettangolo(3,4);

        //tipo statico è il tipo della variabile, tipo dinamico è il tipo dell'oggetto
        PoligonoUtility pu = new Rettangolo(2,3);

        //il metodo perimetro di Poligono è astratto e non può essere chiamato. Quindi java usa il binding
        //in fase di esecuzione per capire quale metodo chiamare. Java in esecuzione verifica prima il tipo dinamico
        //della variabile e poi verifica se il metodo da chiamare si trova nel tipo dinamico. Se c'è chiama quello, altrimenti
        //va nella superclasse per cercarlo
        System.out.println(p.perimetro());
        System.out.println(p.area());



        Rettangolo r2 = new Rettangolo(3,15);

        System.out.println(r.stessaArea(r2));

        Poligono[] poligoni = new Poligono[3];

        poligoni[0]= new Rettangolo(2,4);
        poligoni[1]= new Quadrato(4);
        poligoni[2]= new Quadrato(8);

        for(Poligono p2: poligoni){
            System.out.println(p2.perimetro());
        }

    Quadrato q = new Quadrato(4);

        System.out.println(r.stessaArea(q));

        

    }
}
