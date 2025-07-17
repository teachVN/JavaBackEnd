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
}
