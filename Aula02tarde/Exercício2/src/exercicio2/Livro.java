package exercicio2;

public class Livro {

   private String titulo;
   private String autor;
   private Categoria categoria;
   private Status status;

    public Livro(String titulo, String autor, Categoria categoria, Status status) {
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
        this.categoria = categoria;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Status getStatus() {
        return status;
    }

    }

