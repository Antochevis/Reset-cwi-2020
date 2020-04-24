package TinderEvolution.Console;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import TinderEvolution.Dominio.GeneroJogo;
import TinderEvolution.Dominio.Jogo;
import TinderEvolution.Dominio.PlataformaJogo;
import TinderEvolution.Gerenciador.JogoGerenciador;

public class JogoMenu {
    private JogoGerenciador gerenciador;

    public JogoMenu() {
        this.gerenciador = new JogoGerenciador();
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

    public Jogo create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Jogo...");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria: ");
        System.out.println("[ A ] ACAO");
        System.out.println("[ C ] COMEDIA");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ M ] MUSICAL");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.print("> ");
        String categoria = scanner.next();

        GeneroJogo generoJogo;
        switch (categoria) {
            case "A":
                generoJogo = GeneroJogo.ACAO;
                break;
            case "C":
                generoJogo = GeneroJogo.COMEDIA;
                break;
            case "D":
                generoJogo = GeneroJogo.DRAMA;
                break;
            case "M":
                generoJogo = GeneroJogo.MUSICAL;
                break;
            case "S":
                generoJogo = GeneroJogo.SUSPENSE;
                break;
            case "T":
                generoJogo = GeneroJogo.TERROR;
                break;
            default:
                generoJogo = GeneroJogo.DRAMA;
                break;
        }

        System.out.println("Plataforma: ");
        System.out.println("[ P ] PC");
        System.out.println("[ S ] PS4");
        System.out.println("[ N ] SNES");
        System.out.println("[ B ] XBOX");
        System.out.print("> ");
        String plataforma = scanner.next();

        PlataformaJogo plataformaJogo;
        switch (plataforma) {
            case "P":
                plataformaJogo = PlataformaJogo.PC;
                break;
            case "S":
                plataformaJogo = PlataformaJogo.PS4;
                break;
            case "N":
                plataformaJogo = PlataformaJogo.SNES;
                break;
            case "B":
                plataformaJogo = PlataformaJogo.XBOX;
                break;
            default:
                plataformaJogo = PlataformaJogo.SNES;
                break;
        }

        Jogo jogo = new Jogo(nome, publisher, generoJogo, plataformaJogo, LocalDate.of(ano, mes, dia));
        return gerenciador.salvar(jogo);

    }

    public Jogo editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Jogo...");
        System.out.println("Qual jogo deseja editar?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt(); scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria: ");
        System.out.println("[ A ] ACAO");
        System.out.println("[ C ] COMEDIA");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ M ] MUSICAL");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.print("> ");
        String categoria = scanner.next();

        GeneroJogo generoJogo;
        switch (categoria) {
            case "A":
                generoJogo = GeneroJogo.ACAO;
                break;
            case "C":
                generoJogo = GeneroJogo.COMEDIA;
                break;
            case "D":
                generoJogo = GeneroJogo.DRAMA;
                break;
            case "M":
                generoJogo = GeneroJogo.MUSICAL;
                break;
            case "S":
                generoJogo = GeneroJogo.SUSPENSE;
                break;
            case "T":
                generoJogo = GeneroJogo.TERROR;
                break;
            default:
                generoJogo = GeneroJogo.DRAMA;
                break;
        }

        System.out.println("Plataforma: ");
        System.out.println("[ P ] PC");
        System.out.println("[ S ] PS4");
        System.out.println("[ N ] SNES");
        System.out.println("[ B ] XBOX");
        System.out.print("> ");
        String plataforma = scanner.next();

        PlataformaJogo plataformaJogo;
        switch (plataforma) {
            case "P":
                plataformaJogo = PlataformaJogo.PC;
                break;
            case "S":
                plataformaJogo = PlataformaJogo.PS4;
                break;
            case "N":
                plataformaJogo = PlataformaJogo.SNES;
                break;
            case "B":
                plataformaJogo = PlataformaJogo.XBOX;
                break;
            default:
                plataformaJogo = PlataformaJogo.SNES;
                break;
        }

        Jogo atualizacao = new Jogo(nome, publisher, generoJogo, plataformaJogo, LocalDate.of(ano, mes, dia));

        Jogo jogoAtualizado = gerenciador.editar(id, atualizacao);

        if (jogoAtualizado == null) {
            System.out.println("Jogo não encontrado.");
        } else {
            System.out.println(jogoAtualizado);
        }

        return jogoAtualizado;
    }

    private List<Jogo> listar() {

        System.out.println("\nListagem de Jogo...");
        List<Jogo> jogos = gerenciador.listar();

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

        return jogos;

    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Jogo...");
        System.out.println("Qual o código da jogo? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Jogo jogo = gerenciador.procurar(id);

        if (jogo == null) {
            System.out.println("Jogo não encontrado.");
        } else {
            System.out.println(jogo);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Jogo...");
        System.out.println("Qual jogo deseja deletar?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Jogo deletado.");
        } else {
            System.out.println("Jogo não encontrado.");
        }

    }
}
