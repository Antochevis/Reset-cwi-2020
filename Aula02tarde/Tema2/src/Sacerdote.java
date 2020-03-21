public class Sacerdote extends Personagem {

    double fe;

    public Sacerdote(EnumVocacao enumVocacao, String nome, double vida, double ataque, double defesa, double fe) {
        super(enumVocacao, nome, vida, ataque, defesa);
        this.fe = fe;
    }


    void imprimirEstado(){
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.fe);
    }

    void atacar(Personagem alvo, PoderDivino poderDivino) {
        double dano = dano(alvo.defesa, poderDivino.intensidade);
        alvo.vida -= dano;
        this.fe -= poderDivino.custoDeFe;
        if (this.vida <= 0 || poderDivino.custoDeFe > this.fe)
        {
            System.out.println(this.nome + " atacou " + alvo + " com " + poderDivino + " causando 0 de dano.");
        } else {
            if (alvo.vida <= 0) {
                System.out.println(this.nome + " atacou " + alvo + " com " + poderDivino + " causando " + dano + " de dano e matou a vocação inimiga.");
            } else {
                System.out.println(this.nome + " atacou " + alvo + " com " + poderDivino + " causando " + dano + " de dano.");
                System.out.println("Vida parcial da " + alvo + " = " + alvo.vida);

            }}}
}
