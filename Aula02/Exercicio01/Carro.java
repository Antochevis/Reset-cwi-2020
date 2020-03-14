package Aula02.Exercicio01;

public class Carro extends Veiculo{

    Double numeroDeRodas;
    String combustivel;

    Carro(String nome, Double velocidadeMaxima, String terreno, Double lotacaoMaxima, Double numeroDeRodas, String combustivel) {
        super(nome, velocidadeMaxima, terreno, lotacaoMaxima);
        this.numeroDeRodas = numeroDeRodas;
        this.combustivel = combustivel;

    }
}