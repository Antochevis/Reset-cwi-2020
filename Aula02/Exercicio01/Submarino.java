package Aula02.Exercicio01;

public class Submarino extends Navio {

    Double profundidadeMaxima;

    Submarino(String nome, Double velocidadeMaxima, String terreno, Double lotacaoMaxima, String combustivel, Double profundidadeMaxima) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima, combustivel);
        this.profundidadeMaxima = profundidadeMaxima;
    }
}

