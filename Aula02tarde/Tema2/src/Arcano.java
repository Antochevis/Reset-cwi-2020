import java.util.List;

public class Arcano extends Personagem{

    private double mana;


    public Arcano(String nome, double vida, double ataque, double defesa, double mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }


    public boolean atacar (List<Personagem> alvos, Magia magia) {

        if (magia.getTipoMagia() == TipoMagia.EM_AREA) {
            for (Personagem alvo : alvos) {
                this.atacarSemGastarMana(alvo, magia);
            }
            this.mana -= magia.getCustoDeMana();
        }
        return true;
    }

    public boolean atacar(Pesonagem alvo, Magia magia){
        atacarSemGastarMana(alvo, magia);
        this.mana -= magia.getCustoDeMana();
    }




    void imprimirEstado(){
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
    }

    void atacar(Personagem alvo, Magia magia) {
        double dano = dano(alvo.defesa, magia.poder);
        alvo.vida -= dano;
        this.mana -= magia.custoDeMana;
        if (this.vida <= 0 || magia.custoDeMana > this.mana)
        {
            System.out.println(this.nome + " atacou " + alvo + " com " + magia + " causando 0 de dano.");
        } else {
            if (alvo.vida <= 0) {
                System.out.println(this.nome + " atacou " + alvo + " com " + magia + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
                System.out.println(this.nome + " atacou " + alvo + " com " + magia + " causando " + dano + " de dano.");
                System.out.println("Vida parcial da " + alvo + " = " + alvo.vida);

            }
        }
    }
}

