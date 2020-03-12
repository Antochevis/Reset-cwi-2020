package TemaAula01;

public class Feiticeiro {
    String nomeDoFeiticeiro;
    int vida;
    int ataque;
    int defesa;
    int mana;

    Feiticeiro(String nomeDoFeiticeiro, int vida, int ataque, int defesa, int mana) {
        this.nomeDoFeiticeiro = nomeDoFeiticeiro;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }

    public void atacar (Guerreiro guerreiro, Magia magia) {
        int poderFinalDeAtaque = this.ataque * magia.poder;
        int dano = poderFinalDeAtaque - guerreiro.defesa;
        this.mana -= magia.custoDeMana;
        guerreiro.vida -= dano;
        if (this.vida <= 0 || magia.custoDeMana > this.mana)
        {
            System.out.println(this.nomeDoFeiticeiro + " atacou " + guerreiro.nomeDoGuerreiro + " com " + magia.nomeDaMagia + " causando 0 de dano.");
        } else {
            if (guerreiro.vida <= 0) {
                guerreiro.vida = 0;
                System.out.println(this.nomeDoFeiticeiro + " atacou " + guerreiro.nomeDoGuerreiro + " com " + magia.nomeDaMagia + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoFeiticeiro + " atacou " + guerreiro.nomeDoGuerreiro + " com " + magia.nomeDaMagia + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + guerreiro.nomeDoGuerreiro + " = " + guerreiro.vida);

    }}}

    public void atacar (Barbaro barbaro, Magia magia) {
        int poderFinalDeAtaque = this.ataque * magia.poder;
        int dano = poderFinalDeAtaque - barbaro.defesa;
        this.mana -= magia.custoDeMana;
        barbaro.vida -= dano;
        if (this.vida <= 0 || magia.custoDeMana > this.mana)
        {
            System.out.println(this.nomeDoFeiticeiro + " atacou " + barbaro.nomeDoBarbaro + " com " + magia.nomeDaMagia + " causando 0 de dano.");
        } else {
            if (barbaro.vida <= 0) {
                 barbaro.vida = 0;
                System.out.println(this.nomeDoFeiticeiro + " atacou " + barbaro.nomeDoBarbaro + " com " + magia.nomeDaMagia + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoFeiticeiro + " atacou " + barbaro.nomeDoBarbaro + " com " + magia.nomeDaMagia + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + barbaro.nomeDoBarbaro + " = " + barbaro.vida);

    }}}

    public void atacar (Mago mago, Magia magia) {
        int poderFinalDeAtaque = this.ataque * magia.poder;
        int dano = poderFinalDeAtaque - mago.defesa;
        this.mana -= magia.custoDeMana;
        mago.vida -= dano;
        if (this.vida <= 0 || magia.custoDeMana > this.mana)
        {
            System.out.println(this.nomeDoFeiticeiro + " atacou " + mago.nomeDoMago + " com " + magia.nomeDaMagia + " causando 0 de dano.");
        } else {
            if (mago.vida <= 0) {
                mago.vida = 0;
                System.out.println(this.nomeDoFeiticeiro + " atacou " + mago.nomeDoMago + " com " + magia.nomeDaMagia + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoFeiticeiro + " atacou " + mago.nomeDoMago + " com " + magia.nomeDaMagia + " causando " + dano + " de dano.");
        System.out.println("Vida parcial da " + mago.nomeDoMago + " = " + mago.vida);

    }}}

    public void atacar (Feiticeiro feiticeiro, Magia magia) {
        int poderFinalDeAtaque = this.ataque * magia.poder;
        int dano = poderFinalDeAtaque - this.defesa;
        this.mana -= magia.custoDeMana;
        this.vida -= dano;
        if (this.vida <= 0 || magia.custoDeMana > this.mana)
        {
            System.out.println(this.nomeDoFeiticeiro + " atacou " + this.nomeDoFeiticeiro + " com " + magia.nomeDaMagia + " causando 0 de dano.");
        } else {
            if (this.vida <= 0) {
                this.vida = 0;
                System.out.println(this.nomeDoFeiticeiro + " atacou " + this.nomeDoFeiticeiro + " com " + magia.nomeDaMagia + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoFeiticeiro + " atacou " + this.nomeDoFeiticeiro + " com " + magia.nomeDaMagia + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + this.nomeDoFeiticeiro + " = " + this.vida);

    }}}

    public void atacar (Druida druida, Magia magia) {
        int poderFinalDeAtaque = this.ataque * magia.poder;
        int dano = poderFinalDeAtaque - druida.defesa;
        this.mana -= magia.custoDeMana;
        druida.vida -= dano;
        if (this.vida <= 0 || magia.custoDeMana > this.mana)
        {
            System.out.println(this.nomeDoFeiticeiro + " atacou " + druida.nomeDoDruida + " com " + magia.nomeDaMagia + " causando 0 de dano.");
        } else {
            if (druida.vida <= 0) {
                druida.vida = 0;
                System.out.println(this.nomeDoFeiticeiro + " atacou " + druida.nomeDoDruida + " com " + magia.nomeDaMagia + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoFeiticeiro + " atacou " + druida.nomeDoDruida + " com " + magia.nomeDaMagia + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + druida.nomeDoDruida + " = " + druida.vida);

    }}}

    public void atacar (Clerigo clerigo, Magia magia) {
        int poderFinalDeAtaque = this.ataque * magia.poder;
        int dano = poderFinalDeAtaque - clerigo.defesa;
        this.mana -= magia.custoDeMana;
        clerigo.vida -= dano;
        if (this.vida <= 0 || magia.custoDeMana > this.mana)
        {
            System.out.println(this.nomeDoFeiticeiro + " atacou " + clerigo.nomeDoClerigo + " com " + magia.nomeDaMagia + " causando 0 de dano.");
        } else {
            if (clerigo.vida <= 0) {
                clerigo.vida = 0;
                System.out.println(this.nomeDoFeiticeiro + " atacou " + clerigo.nomeDoClerigo + " com " + magia.nomeDaMagia + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoFeiticeiro + " atacou " + clerigo.nomeDoClerigo + " com " + magia.nomeDaMagia + " causando " + dano + " de dano.");
        System.out.println("Vida parcial da " + clerigo.nomeDoClerigo + " = " + clerigo.vida);

    }}}

}