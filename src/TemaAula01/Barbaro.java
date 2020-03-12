package TemaAula01;

public class Barbaro {
    String nomeDoBarbaro;
    int vida;
    int ataque;
    int defesa;

    Barbaro(String nomeDoBarbaro, int vida, int ataque, int defesa){
        this.nomeDoBarbaro = nomeDoBarbaro;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void atacar (Guerreiro guerreiro, Arma arma) {
        int poderFinalDeAtaque = this.ataque * arma.poderDeAtaque;
        int dano = poderFinalDeAtaque - guerreiro.defesa;
        guerreiro.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nomeDoBarbaro + " atacou " + guerreiro.nomeDoGuerreiro + " com " + arma.nomeDaArma + " causando 0 de dano.");
        } else {
            if (guerreiro.vida <= 0) {
                guerreiro.vida = 0;
                System.out.println(this.nomeDoBarbaro + " atacou " + guerreiro.nomeDoGuerreiro + " com " + arma.nomeDaArma + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoBarbaro + " atacou " + guerreiro.nomeDoGuerreiro + " com " + arma.nomeDaArma + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + guerreiro.nomeDoGuerreiro + " = " + guerreiro.vida);

    }}}

    public void atacar (Barbaro barbaro, Arma arma) {
        int poderFinalDeAtaque = this.ataque * arma.poderDeAtaque;
        int dano = poderFinalDeAtaque - this.defesa;
        this.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nomeDoBarbaro + " atacou " + this.nomeDoBarbaro + " com " + arma.nomeDaArma + " causando 0 de dano.");
        } else {
            if (this.vida <= 0) {
                this.vida = 0;
                System.out.println(this.nomeDoBarbaro + " atacou " + this.nomeDoBarbaro + " com " + arma.nomeDaArma + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoBarbaro + " atacou " + this.nomeDoBarbaro + " com " + arma.nomeDaArma + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + this.nomeDoBarbaro + " = " + this.vida);

    }}}

    public void atacar (Mago mago, Arma arma) {
        int poderFinalDeAtaque = this.ataque * arma.poderDeAtaque;
        int dano = poderFinalDeAtaque - mago.defesa;
        mago.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nomeDoBarbaro + " atacou " + mago.nomeDoMago + " com " + arma.nomeDaArma + " causando 0 de dano.");
        } else {
            if (mago.vida <= 0) {
                mago.vida = 0;
                System.out.println(this.nomeDoBarbaro + " atacou " + mago.nomeDoMago + " com " + arma.nomeDaArma + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoBarbaro + " atacou " + mago.nomeDoMago + " com " + arma.nomeDaArma + " causando " + dano + " de dano.");
        System.out.println("Vida parcial da " + mago.nomeDoMago + " = " + mago.vida);

    }}}

    public void atacar (Feiticeiro feiticeiro, Arma arma) {
        int poderFinalDeAtaque = this.ataque * arma.poderDeAtaque;
        int dano = poderFinalDeAtaque - feiticeiro.defesa;
        feiticeiro.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nomeDoBarbaro + " atacou " + feiticeiro.nomeDoFeiticeiro + " com " + arma.nomeDaArma + " causando 0 de dano.");
        } else {
            if (feiticeiro.vida <= 0) {
                feiticeiro.vida = 0;
                System.out.println(this.nomeDoBarbaro + " atacou " + feiticeiro.nomeDoFeiticeiro + " com " + arma.nomeDaArma + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoBarbaro + " atacou " + feiticeiro.nomeDoFeiticeiro + " com " + arma.nomeDaArma + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + feiticeiro.nomeDoFeiticeiro + " = " + feiticeiro.vida);

    }}}

    public void atacar (Druida druida, Arma arma) {
        int poderFinalDeAtaque = this.ataque * arma.poderDeAtaque;
        int dano = poderFinalDeAtaque - druida.defesa;
        druida.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nomeDoBarbaro + " atacou " + druida.nomeDoDruida + " com " + arma.nomeDaArma + " causando 0 de dano.");
        } else {
            if (druida.vida <= 0) {
                druida.vida = 0;
                System.out.println(this.nomeDoBarbaro + " atacou " + druida.nomeDoDruida + " com " + arma.nomeDaArma + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoBarbaro + " atacou " + druida.nomeDoDruida + " com " + arma.nomeDaArma + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + druida.nomeDoDruida + " = " + druida.vida);

    }}}

    public void atacar (Clerigo clerigo, Arma arma) {
        int poderFinalDeAtaque = this.ataque * arma.poderDeAtaque;
        int dano = poderFinalDeAtaque - clerigo.defesa;
        clerigo.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nomeDoBarbaro + " atacou " + clerigo.nomeDoClerigo + " com " + arma.nomeDaArma + " causando 0 de dano.");
        } else {
            if (clerigo.vida <= 0) {
                clerigo.vida = 0;
                System.out.println(this.nomeDoBarbaro + " atacou " + clerigo.nomeDoClerigo + " com " + arma.nomeDaArma + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoBarbaro + " atacou " + clerigo.nomeDoClerigo + " com " + arma.nomeDaArma + " causando " + dano + " de dano.");
        System.out.println("Vida parcial da " + clerigo.nomeDoClerigo + " = " + clerigo.vida);

    }}}
}
