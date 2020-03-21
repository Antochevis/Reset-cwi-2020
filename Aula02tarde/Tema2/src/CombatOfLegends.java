import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CombatOfLegends {

    public static void main(String[] args) {

        List<HomemDeArmas> listaCombatentes = new ArrayList<>();
        List<Arcano> listaCombatentes2 = new ArrayList<>();
        List<Sacerdote> listaCombatentes3 = new ArrayList<>();
        List<Arma> listaArmas = new ArrayList<>();
        List<Magia> listaMagias = new ArrayList<>();
        List<PoderDivino> listaPoderesDivinos = new ArrayList<>();

        List<HomemDeArmas> alvo = new ArrayList<>();
        List<Arcano> alvo2 = new ArrayList<>();
        List<Sacerdote> alvo3 = new ArrayList<>();

        Arma clava = new Arma("Clava", 3);
        Arma machado = new Arma("Machado", 2);

        System.out.println("Bem-Vindo a Combat of Legends!");

        int per;
        for (per = 0; per < 2; per++) {
            System.out.println("Agora, escolha as vocações dos personagens.");
            System.out.println("G - Guerreiro");
            System.out.println("B - Bárbaro");
            System.out.println("C - Clérigo");
            System.out.println("D - Druida");
            System.out.println("M - Mago");
            System.out.println("F - Feiticeiro");

            System.out.println("Personagem " + ( per + 1 ) + ": ");

            Scanner in = new Scanner(System.in);
            System.out.print("Vocação: ");
            char tipo = in.next().charAt(0);
            System.out.print("Nome: ");
            String nome = in.next();
            System.out.print("Vida: ");
            double vida = in.nextDouble();
            System.out.print("Ataque: ");
            double ataque = in.nextDouble();
            System.out.print("Defesa: ");
            double defesa = in.nextDouble();

            double fe;
            double mana;



            switch (tipo) {
                case 'B':
                    listaCombatentes.add(new Barbaro(nome, vida, ataque, defesa, null));
                    break;

                case 'C':
                    System.out.print("Fé: ");
                    fe = in.nextInt();
                    listaCombatentes3.add(new Clerigo(nome, vida, ataque, defesa, fe));
                    break;

                case 'D':
                    System.out.print("Fé: ");
                    fe = in.nextInt();
                    listaCombatentes3.add(new Druida(nome, vida, ataque, defesa, fe));
                    break;

                case 'F':
                    System.out.print("Mana: ");
                    mana = in.nextInt();
                    listaCombatentes2.add(new Feiticeiro(nome, vida, ataque, defesa, mana));
                    break;

                case 'G':
                    listaCombatentes.add(new Guerreiro(nome, vida, ataque, defesa, null));
                    break;

                case 'M':
                    System.out.print("Mana: ");
                    mana = in.nextInt();
                    listaCombatentes2.add(new Mago(nome, vida, ataque, defesa, mana));
                    break;

            }
        }
        System.out.println("------quebra combateeee------");

        listaCombatentes.get(1).atacar((HomemDeArmas) alvo, clava);
        listaCombatentes.get(1).atacar((Sacerdote) alvo, clava);
        listaCombatentes.get(1).atacar((Arcano) alvo, clava);

    }
}

