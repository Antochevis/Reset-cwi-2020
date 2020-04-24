package TinderEvolution.Dominio;

public class Time {


    private int id;

    private String nome;

    public Time(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Time de futebol{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
