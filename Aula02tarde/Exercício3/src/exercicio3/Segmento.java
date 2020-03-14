package exercicio3;

public enum Segmento {

    ALIMENTACAO ("[Alimentação]"),
    LIMPEZA ("[Limpeza]"),
    HIGIENE ("[Higiene]");

    private String segmento;

    Segmento(String segmento) {
        this.segmento = segmento;
    }

    public String getSegmento() {
        return segmento;
    }
}
