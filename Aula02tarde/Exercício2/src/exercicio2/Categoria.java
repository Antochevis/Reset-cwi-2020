package exercicio2;

public enum Categoria {

    SUSPENSE ("Suspense"),
    ROMANCE ("Romance"),
    FANTASIA ("Fantasia"),
    TERROR ("Terror");

    private String categoria;

    Categoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}
