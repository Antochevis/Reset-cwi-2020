package Exercicio3;

public class SituacaoAlunos {
    String nomeDoAluno;
    double nota;
    boolean situacao;

    SituacaoAlunos(String nomeDoAluno, double nota) {
        this.nomeDoAluno = nomeDoAluno;
        this.nota = nota;
    }

    boolean isSituacao() {
        situacao = this.nota >= 7;
        return situacao;
    }
}
