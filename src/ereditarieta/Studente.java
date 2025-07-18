package ereditarieta;

import java.util.Objects;

public class Studente extends Persona{

    private int matricola;

    public Studente(String nome, String cognome, int eta, int matricola){
        super(nome, cognome, eta);
        this.matricola=matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString(){
        return super.toString() + ", matricola: " + matricola;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Studente studente = (Studente) o;
        return matricola == studente.matricola;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricola);
    }

    //se il metodo richiede di accedere ad una caratteristica della sottoclasse e il parametro di ingresso del metodo è di tipo superlcasse
    //allora devo vericare che la variabile abbia un tipo dinamico uguale a quello ricercato e poi fare il cast esplicito
    public boolean stessaMatricola(Persona p){

        if(p instanceof Studente){

            Studente s = (Studente) p;

            if(matricola==s.getMatricola()){
                return true;
            }
            else{
                return false;
            }

        }
        return false;


    }
}
