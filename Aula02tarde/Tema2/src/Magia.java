public class Magia extends Habilidade {

    double custoDeMana;
    boolean danoEmArea;

    public Magia(String nome, double poder, double custoDeMana, boolean danoEmArea) {
        super(nome, poder);
        this.custoDeMana = custoDeMana;
        this.danoEmArea = danoEmArea;
    }

    public double getCustoDeMana(){
        return custoDeMana;
    }
    public boolean isDanoEmArea (){
        return danoEmArea;
    }
}
