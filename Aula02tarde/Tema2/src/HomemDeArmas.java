public class HomemDeArmas extends Personagem{

    Arma armaEquipada;


    public Arma getArmaEquipada() {
        return armaEquipada;
    }

    public void setArmaEquipada(Arma armaEquipada) {
        this.armaEquipada = armaEquipada;
    }

    public HomemDeArmas(String nome, double vida, double ataque, double defesa, Arma armaEquipada) {
        super(nome, vida, ataque, defesa);
        this.armaEquipada = armaEquipada;
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.getNome() + " | Vida: " + this.getVida());
    }

       public void atacar(Personagem alvo, Arma armaEquipada) {
            double dano = dano(alvo.getDefesa(), armaEquipada.getPoder());
            alvo.setVida();
            if (alvo.getVida() <= 0)
            {
                System.out.println(this.nome + " atacou " + alvo + " com " + armaEquipada + " causando 0 de dano.");
            } else {
                if (alvo.vida <= 0) {
                    System.out.println(this.nome + " atacou " + alvo + " com " + armaEquipada + " causando " + dano + " de dano e matou a vocação inimiga.");
                } else {
                    System.out.println(this.nome + " atacou " + alvo + " com " + armaEquipada + " causando " + dano + " de dano.");
                    System.out.println("Vida parcial da " + alvo + " = " + alvo.vida);

                }
            }
    }
}
