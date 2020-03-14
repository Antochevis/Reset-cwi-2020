package Exercicio3;

public class AppAlunos {

    public static void main(String[] args) {
        SituacaoAlunos resultado = new SituacaoAlunos("Joao Andrey", 9);
        System.out.println(resultado.nomeDoAluno);
        System.out.println(resultado.nota);

        System.out.println(resultado.isSituacao());
    }

}
