package ereditarieta;

public class Computer {

    private String nome;
    private String marca;
    private int pollici;

    public Computer(String nome, String marca, int pollici) {
        this.nome = nome;
        this.marca = marca;
        this.pollici = pollici;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", pollici=" + pollici +
                '}';
    }
}
