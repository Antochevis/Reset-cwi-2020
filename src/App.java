import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class App {

    public static void main(String[] args) {

        System.out.println("Hello World!");


        Calculadora calculadoraDeIdades = new Calculadora();
        int somaDasIdades = calculadoraDeIdades.somar(33, 54);
        System.out.println(somaDasIdades);

        int subtracaoDasIdades = calculadoraDeIdades.subtrai(66, 22);
        System.out.println(subtracaoDasIdades);

        int multiplicacaoDasIdades = calculadoraDeIdades.multiplica(23, 3);
        System.out.println(multiplicacaoDasIdades);

        int divisaoDasIdades = calculadoraDeIdades.divide(99, 33);
        System.out.println(divisaoDasIdades);


        Comparador comparaNumeros = new Comparador();
        boolean comparacao = comparaNumeros.menorQue(12, 27);
        System.out.println(comparacao);

    }
}
