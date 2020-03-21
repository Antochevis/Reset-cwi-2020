public class Habilidade {

    private String nome;
    private double poder;

    protected Habilidade (String nome, double poder){
        this.nome = nome;
        this.poder = poder;
    }

    public double getPoder() {
        return poder;
    }

    public String getNome() {
        return nome;
    }

}
