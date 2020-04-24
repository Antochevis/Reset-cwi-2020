package TinderEvolution.Console;

import TinderEvolution.Dominio.Time;
import TinderEvolution.Gerenciador.TimeGerenciador;

import java.util.List;
import java.util.Scanner;

public class TimeMenu {
    private TimeGerenciador gerenciador;

    public TimeMenu() {
        this.gerenciador = new TimeGerenciador();
    }

    public void opcoes() {
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ C ] Criar");
            System.out.println("[ E ] Editar");
            System.out.println("[ L ] Listar");
            System.out.println("[ P ] Procurar");
            System.out.println("[ D ] Deletar");
            System.out.println("[ X ] Voltar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'C':
                    create();
                    break;
                case 'E':
                    editar();
                    break;
                case 'L':
                    listar();
                    break;
                case 'P':
                    procurar();
                    break;
                case 'D':
                    deletar();
                    break;
                case 'X':
                    System.out.println("...");
                    break;
                default:
                    System.out.println("... opção inválida ...");
            }
        }
    }

    public Time create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Time de futebol...");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        Time time = new Time(nome);
        return gerenciador.salvar(time);

    }

    public Time editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Time de futebol...");
        System.out.println("Qual esporte deseja editar?");

        List<Time> times = gerenciador.listar();
        for (Time time : times) {
            System.out.println("[" + time.getId() + "] - " + time.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt(); scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        Time atualizacao = new Time(nome);

        Time timeAtualizado = gerenciador.editar(id, atualizacao);

        if (timeAtualizado == null) {
            System.out.println("Time de futebol não encontrado.");
        } else {
            System.out.println(timeAtualizado);
        }

        return timeAtualizado;
    }

    private List<Time> listar() {

        System.out.println("\nListagem de Time de futebol...");
        List<Time> times = gerenciador.listar();

        for (Time time : times) {
            System.out.println(time);
        }

        return times;

    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Time de futebol...");
        System.out.println("Qual o código do time de futebol? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Time time = gerenciador.procurar(id);

        if (time == null) {
            System.out.println("Time de futebol não encontrado.");
        } else {
            System.out.println(time);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Time de futebol...");
        System.out.println("Qual time de futebol deseja deletar?");

        List<Time> times = gerenciador.listar();
        for (Time time : times) {
            System.out.println("[" + time.getId() + "] - " + time.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Time de futebol deletado.");
        } else {
            System.out.println("Time de futebol não encontrado.");
        }

    }
}
