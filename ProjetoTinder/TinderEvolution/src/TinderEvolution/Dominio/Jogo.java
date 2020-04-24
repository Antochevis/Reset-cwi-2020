package TinderEvolution.Dominio;

import java.time.LocalDate;

public class Jogo {

    private int id;

    private String nome;

    private String publisher;

    private GeneroJogo genero;

    private PlataformaJogo plataforma;

    private LocalDate lancamento;

    public Jogo(String nome, String publisher, GeneroJogo genero, PlataformaJogo plataforma, LocalDate lancamento) {
        this.nome = nome;
        this.publisher = publisher;
        this.genero = genero;
        this.plataforma = plataforma;
        this.lancamento = lancamento;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public GeneroJogo getGenero() {
        return genero;
    }

    public void setGenero(GeneroJogo genero) {
        this.genero = genero;
    }

    public PlataformaJogo getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(PlataformaJogo plataforma) {
        this.plataforma = plataforma;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pubisher='" + publisher + '\'' +
                ", gênero=" + genero +
                ", plataforma=" + plataforma +
                ", lancamento=" + lancamento +
                '}';
    }
}
