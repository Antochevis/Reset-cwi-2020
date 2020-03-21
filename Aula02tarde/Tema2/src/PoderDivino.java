public class PoderDivino extends Habilidade{

    double custoDeFe;
    boolean danoEmArea;

    public PoderDivino(String nome, double poder, double custoDeFe, boolean danoEmArea) {
        super(nome, poder);
        this.custoDeFe = custoDeFe;
        this.danoEmArea = danoEmArea;
    }

    public double getCustoDeFe(){
        return custoDeFe;
    }

    public boolean isDanoEmArea (){
        return danoEmArea;
    }
}
