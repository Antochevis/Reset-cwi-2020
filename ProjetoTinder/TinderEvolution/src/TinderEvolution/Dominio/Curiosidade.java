package TinderEvolution.Dominio;

public class Curiosidade {

    private int id;

    private String descricao;

    private CategoriaCuriosidade categoria;

    public Curiosidade(String descricao, CategoriaCuriosidade categoria) {
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaCuriosidade getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCuriosidade categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Curiosidade{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
