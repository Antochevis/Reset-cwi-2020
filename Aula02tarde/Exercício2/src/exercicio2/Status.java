package exercicio2;

public enum Status {

    DISPONIVEL ("Disponível"),
    EM_USO ("Em uso"),
    EMPRESTADO ("Emprestado");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}

