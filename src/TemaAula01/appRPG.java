package TemaAula01;

import java.sql.SQLOutput;

public class appRPG {
    public static void main(String[] args) {

        //Personagens
        Guerreiro kharsek = new Guerreiro("Kharsek", 900, 60, 60);
        Barbaro khamuxetEndo = new Barbaro("Khamuxet Endo", 750, 90, 70);
        Mago bona = new Mago("Bona", 420, 90, 30, 750);
        Feiticeiro oldJohn = new Feiticeiro("Old John", 600, 120, 40, 900);
        Druida antoszewicz = new Druida("Antoszewicz", 750, 130, 45, 600);
        Clerigo lyh = new Clerigo("Lyh", 420, 110, 30, 550);

        //Objetos de ataque
        Arma clava = new Arma("Clava", 3);
        Arma machado = new Arma("Machado", 2);
        Magia ataqueDasChamas = new Magia("Ataque das Chamas", 3, 90);
        Magia ataqueDeEnergia = new Magia("Ataque de Energia", 2, 70);
        PoderDivino missilDivino = new PoderDivino("Missil Divino", 4, 80);
        PoderDivino calderaDivina = new PoderDivino("Caldera Divina", 3, 100);

        //Intro
        System.out.println("Em algum lugar do Cosmo, 6 povos distintos dividiam o mesmo  planeta. Cada povo tinha sua vocação, sendo eles divididos em:");
        System.out.println("Guerreiros;");
        System.out.println("Magos;");
        System.out.println("Feiticeiros;");
        System.out.println("Druidas;");
        System.out.println("Clérigos.");
        System.out.println("Afim de decidirem qual vocação era a mais forte, 1 representante de cada povo foi escolhido para participar de uma batalha.");
        System.out.println("O guerreiro escolhido foi o Kharsek, um bravo homem que tinha como arma sua lendária Clava.");
        System.out.println("Já os bárbaros escolheram Khamuxet Endo, que desde os 12 anos faz história com seu Machado.");
        System.out.println("Os magos escolheram como sua representate a jovem Bona, que dominava todas as magias de seu povo e se tornou especialista no Ataque das Chamas.");
        System.out.println("Os feiticeiros, prezando pelo conhecimento, escolheram um velho sábio, chamado Old John, que dominava como ninguém as magias envolvendo Energia.");
        System.out.println("Os druidas escolheram Antoszewicz, um jovem devoto, que com sua fé tinha um ataque muito poderoso, chamado de Míssil Divino.");
        System.out.println("Os clérigos escolharam a antiga Lyh como representante, uma especialista no poder divino Caldera Divina.");
        System.out.println("Após os representantes serem devidamente apresentados, a batalha começou! Acompanhe essa épica batalha e descubra qual a vocação mais poderosa!!!");


        //Início rodadas de ataques
        kharsek.atacar(bona, clava);
        khamuxetEndo.atacar(oldJohn, machado);
        bona.atacar(antoszewicz, ataqueDasChamas);
        oldJohn.atacar(lyh, ataqueDeEnergia);
        antoszewicz.atacar(kharsek, missilDivino);
        lyh.atacar(khamuxetEndo, calderaDivina);

        //Parcial após a primeira rodada
        System.out.println("Após a primeira rodada nenhuma vocação foi eliminada, então todos continuam na batalha! Vamos para a segunda rodada:");

        //Rodada 02
        kharsek.atacar(antoszewicz, clava);
        khamuxetEndo.atacar(bona, machado);
        bona.atacar(lyh, ataqueDasChamas);
        oldJohn.atacar(khamuxetEndo, ataqueDeEnergia);
        antoszewicz.atacar(oldJohn, missilDivino);
        lyh.atacar(kharsek, calderaDivina);

        //Parcial após a segunda rodada
        System.out.println("Após a segunda rodada 2 vocações foram eliminadas: Clérigo e Feiticeiro!!! Vamos para a terceira rodada: ");

        //Rodada 03
        kharsek.atacar(khamuxetEndo, clava);
        khamuxetEndo.atacar(antoszewicz, machado);
        bona.atacar(kharsek, ataqueDasChamas);
        antoszewicz.atacar(bona, missilDivino);

        //Parcial após a terceira rodada
        System.out.println("Após a terceira rodada mais 2 vocações foram eliminadas: Guerreiro e Mago!");
        System.out.println("Vamos para a quarta rodada, onde restam apenas 2 vocações, Druida e Bárbaro!");

        //Rodada 04
        khamuxetEndo.atacar(antoszewicz, machado);
        antoszewicz.atacar(khamuxetEndo, missilDivino);

        //Resultado final
        System.out.println("Após quatro rodadas temos o campeão dessa batalha épica: Antoszewicz! O druida representou muito bem sua vocação e mostrou para todos qual é a vocação mais forte!");
        System.out.println("O rank final da batalha ficou:");
        System.out.println("1º Antoszewicz - Vida: " + antoszewicz.vida + " - Fé: " + antoszewicz.fe);
        System.out.println("2º Khamuxet Endo - Vida: " + khamuxetEndo.vida);
        System.out.println("3º Bona - Vida: " + bona.vida + " - Mana: " + bona.mana);
        System.out.println("4º Kharsek - Vida: " + kharsek.vida);
        System.out.println("5º Old John - Vida: " + oldJohn.vida + " - Mana: " + oldJohn.mana);
        System.out.println("6º Lyh - Vida: " + lyh.vida + " - Fé: " + lyh.fe);



    }
}
