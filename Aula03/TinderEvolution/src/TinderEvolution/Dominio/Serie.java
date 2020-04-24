package TinderEvolution.Dominio;

import java.time.LocalDate;

public class Serie {

    private int id;

    private String nome;

    private String sinopse;

    private String diretor;

    private GeneroSerie genero;

    private LocalDate lancamento;

    private int numeroTemporadas;

    private int numeroEpisodios;

    public Serie(String nome, String sinopse, String diretor, GeneroSerie genero, LocalDate lancamento, int numeroTemporadas, int numeroEpisodios) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.genero = genero;
        this.lancamento = lancamento;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroEpisodios = numeroEpisodios;
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

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public GeneroSerie getGenero() {
        return genero;
    }

    public void setGenero(GeneroSerie genero) {
        this.genero = genero;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", diretor='" + diretor + '\'' +
                ", gênero=" + genero +
                ", lancamento=" + lancamento +
                ", numeroTemporadas=" + numeroTemporadas +
                ", numeroEpisodios=" + numeroEpisodios +
                '}';
    }
}
