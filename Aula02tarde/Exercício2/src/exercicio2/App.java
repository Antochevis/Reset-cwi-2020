package exercicio2;

public class App {

    public static void main(String[] args) {
         Livro livro = new Livro ("O ladrão de raios", " (Rick Riordan)", Categoria.FANTASIA, Status.EMPRESTADO);
         Livro livro2 = new Livro ("Terror", " (Jan Guillou)", Categoria.TERROR, Status.DISPONIVEL);
         Livro livro3 = new Livro ("Dom Casmurro", " (Machado de Assis)", Categoria.ROMANCE, Status.EMPRESTADO);
         Livro livro4 = new Livro ("Bem atrás de você", " (Lisa Gardner)", Categoria.SUSPENSE, Status.EM_USO);

        System.out.println(livro.getCategoria().getCategoria() + " - " + livro.getTitulo() + livro.getAutor() + ": " + livro.getStatus().getStatus());
        System.out.println(livro2.getCategoria().getCategoria() + " - " + livro2.getTitulo() + livro2.getAutor() + ": " + livro2.getStatus().getStatus());
        System.out.println(livro3.getCategoria().getCategoria() + " - " + livro3.getTitulo() + livro3.getAutor() + ": " + livro3.getStatus().getStatus());
        System.out.println(livro4.getCategoria().getCategoria() + " - " + livro4.getTitulo() + livro4.getAutor() + ": " + livro4.getStatus().getStatus());




    }

}
