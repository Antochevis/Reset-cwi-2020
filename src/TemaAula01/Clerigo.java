package TemaAula01;

public class Clerigo {
    String nomeDoClerigo;
    int vida;
    int ataque;
    int defesa;
    int fe;

    Clerigo(String nomeDoClerigo, int vida, int ataque, int defesa, int fe) {
        this.nomeDoClerigo = nomeDoClerigo;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
    }

    public void atacar (Guerreiro guerreiro, PoderDivino poder) {
        int poderFinalDeAtaque = this.ataque * poder.intensidade;
        int dano = poderFinalDeAtaque - guerreiro.defesa;
        this.fe -= poder.custoDeFe;
        guerreiro.vida -= dano;
        if (this.vida <= 0 || poder.custoDeFe > this.fe)
        {
            System.out.println(this.nomeDoClerigo + " atacou " + guerreiro.nomeDoGuerreiro + " com " + poder.nomeDoPoder + " causando 0 de dano.");
        } else {
            if (guerreiro.vida <= 0) {
                guerreiro.vida = 0;
                System.out.println(this.nomeDoClerigo + " atacou " + guerreiro.nomeDoGuerreiro + " com " + poder.nomeDoPoder + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoClerigo + " atacou " + guerreiro.nomeDoGuerreiro + " com " + poder.nomeDoPoder + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + guerreiro.nomeDoGuerreiro + " = " + guerreiro.vida);

    }}}

    public void atacar (Barbaro barbaro, PoderDivino poder) {
        int poderFinalDeAtaque = this.ataque * poder.intensidade;
        int dano = poderFinalDeAtaque - barbaro.defesa;
        this.fe -= poder.custoDeFe;
        barbaro.vida -= dano;
        if (this.vida <= 0 || poder.custoDeFe > this.fe)
        {
            System.out.println(this.nomeDoClerigo + " atacou " + barbaro.nomeDoBarbaro + " com " + poder.nomeDoPoder + " causando 0 de dano.");
        } else {
            if (barbaro.vida <= 0) {
                barbaro.vida = 0;
                System.out.println(this.nomeDoClerigo + " atacou " + barbaro.nomeDoBarbaro + " com " + poder.nomeDoPoder + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoClerigo + " atacou " + barbaro.nomeDoBarbaro + " com " + poder.nomeDoPoder + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + barbaro.nomeDoBarbaro + " = " + barbaro.vida);

    }}}

    public void atacar (Mago mago, PoderDivino poder) {
        int poderFinalDeAtaque = this.ataque * poder.intensidade;
        int dano = poderFinalDeAtaque - mago.defesa;
        this.fe -= poder.custoDeFe;
        mago.vida -= dano;
        if (this.vida <= 0 || poder.custoDeFe > this.fe)
        {
            System.out.println(this.nomeDoClerigo + " atacou " + mago.nomeDoMago + " com " + poder.nomeDoPoder + " causando 0 de dano.");
        } else {
            if (mago.vida <= 0) {
                mago.vida = 0;
                System.out.println(this.nomeDoClerigo + " atacou " + mago.nomeDoMago + " com " + poder.nomeDoPoder + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoClerigo + " atacou " + mago.nomeDoMago + " com " + poder.nomeDoPoder + " causando " + dano + " de dano.");
        System.out.println("Vida parcial da " + mago.nomeDoMago + " = " + mago.vida);

    }}}

    public void atacar (Feiticeiro feiticeiro, PoderDivino poder) {
        int poderFinalDeAtaque = this.ataque * poder.intensidade;
        int dano = poderFinalDeAtaque - feiticeiro.defesa;
        this.fe -= poder.custoDeFe;
        feiticeiro.vida -= dano;
        if (this.vida <= 0 || poder.custoDeFe > this.fe)
        {
            System.out.println(this.nomeDoClerigo + " atacou " + feiticeiro.nomeDoFeiticeiro + " com " + poder.nomeDoPoder + " causando 0 de dano.");
        } else {
            if (feiticeiro.vida <= 0) {
                feiticeiro.vida = 0;
                System.out.println(this.nomeDoClerigo + " atacou " + feiticeiro.nomeDoFeiticeiro + " com " + poder.nomeDoPoder + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoClerigo + " atacou " + feiticeiro.nomeDoFeiticeiro + " com " + poder.nomeDoPoder + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + feiticeiro.nomeDoFeiticeiro + " = " + feiticeiro.vida);

    }}}

    public void atacar (Druida druida, PoderDivino poder) {
        int poderFinalDeAtaque = this.ataque * poder.intensidade;
        int dano = poderFinalDeAtaque - druida.defesa;
        this.fe -= poder.custoDeFe;
        druida.vida -= dano;
        if (this.vida <= 0 || poder.custoDeFe > this.fe)
        {
            System.out.println(this.nomeDoClerigo + " atacou " + druida.nomeDoDruida + " com " + poder.nomeDoPoder + " causando 0 de dano.");
        } else {
            if (druida.vida <= 0) {
                druida.vida = 0;
                System.out.println(this.nomeDoClerigo + " atacou " + druida.nomeDoDruida + " com " + poder.nomeDoPoder + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoClerigo + " atacou " + druida.nomeDoDruida + " com " + poder.nomeDoPoder + " causando " + dano + " de dano.");
        System.out.println("Vida parcial do " + druida.nomeDoDruida + " = " + druida.vida);

    }}}

    public void atacar (Clerigo clerigo, PoderDivino poder) {
        int poderFinalDeAtaque = this.ataque * poder.intensidade;
        int dano = poderFinalDeAtaque - this.defesa;
        this.fe -= poder.custoDeFe;
        this.vida -= dano;
        if (this.vida <= 0 || poder.custoDeFe > this.fe)
        {
            System.out.println(this.nomeDoClerigo + " atacou " + this.nomeDoClerigo + " com " + poder.nomeDoPoder + " causando 0 de dano.");
        } else {
            if (this.vida <= 0) {
                this.vida = 0;
                System.out.println(this.nomeDoClerigo + " atacou " + this.nomeDoClerigo + " com " + poder.nomeDoPoder + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
        System.out.println(this.nomeDoClerigo + " atacou " + this.nomeDoClerigo + " com " + poder.nomeDoPoder + " causando " + dano + " de dano.");
        System.out.println("Vida parcial da " + this.nomeDoClerigo + " = " + this.vida);

    }}}
}
