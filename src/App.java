import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class App {

    public static void main(String[] args) {

        Calculadora calculadoraDeIdades = new Calculadora();
        int somaDasIdades = calculadoraDeIdades.somar(33, 54);
        System.out.println(somaDasIdades);

        int subtracaoDasIdades = calculadoraDeIdades.subtrai(66, 22);
        System.out.println(subtracaoDasIdades);

        int multiplicacaoDasIdades = calculadoraDeIdades.multiplica(23, 3);
        System.out.println(multiplicacaoDasIdades);

        int divisaoDasIdades = calculadoraDeIdades.divide(99, 33);
        System.out.println(divisaoDasIdades);
    }
}
