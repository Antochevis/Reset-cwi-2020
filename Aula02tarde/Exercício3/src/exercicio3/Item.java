package exercicio3;

public class Item {

    private String nome;
    private Double valor;
    private int quantidade;
    private Segmento segmento;

    public Item(String nome, Double valor, int quantidade, Segmento segmento) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.segmento = segmento;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Segmento getSegmento() {
        return segmento;
    }
}
