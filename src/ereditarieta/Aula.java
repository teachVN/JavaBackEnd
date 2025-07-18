package ereditarieta;

public class Aula {

    private String nome;

    private Studente[] studenti;

    public Aula(String nome, int numStudenti){
        this.nome = nome;
        studenti = new Studente[numStudenti];
    }

    public Aula(String nome, Studente[] studenti){
        this.nome=nome;
        this.studenti=studenti;
    }

    public boolean inserisciStudente(Studente studente){
        int posto = postoLibero(); //chiamo il metodo postoLibero per sapere se c'è un posto libero

        if(posto!=-1){
            studenti[posto]=studente;
            return true;
        }
        else{
            return false;
        }


    }

    public int postoLibero(){
        for(int i=0; i<studenti.length; i++){
            if(studenti[i]==null){
                return i;
            }
        }

        return -1;
    }

    public void stampaAula(){
        for(Studente s:studenti){
            System.out.println(s);
        }
    }
}
