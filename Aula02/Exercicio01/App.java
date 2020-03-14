package Aula02.Exercicio01;


public class App {

    public static void main(String[] args) {

        Navio navio = new Navio("Navio237Yc", 60., "Água", 3000., "Óleo Diesel");
        Submarino submarino = new Submarino("Poseidon", 40., "Água", 20., "Óleo Diesel", 1000.);
        Trem trem = new Trem("140C", 100., "Terra", 250., 40., "Eletricidade");
        Caminhao caminhao = new Caminhao("Judith", 100., "Terra", 3., 8., "Óleo Diesel");
        Carro carro = new Carro("Argo", 180., "Terra", 5., 4., "Gasolina");
        Bicicleta bicicleta = new Bicicleta("Fiona", 40., "Terra", 2.);
        Aviao aviao = new Aviao("Boeing 747", 700.5, "Ar", 300., 3., "Gasolina de aviação");


    }


}
