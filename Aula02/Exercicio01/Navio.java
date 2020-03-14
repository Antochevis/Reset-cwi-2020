package Aula02.Exercicio01;

public class Navio extends Veiculo {

    String combustivel;

    Navio(String nome, Double velocidadeMaxima, String terreno, Double lotacaoMaxima, String combustivel) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.combustivel = combustivel;
    }
}
