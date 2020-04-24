package TinderEvolution.Console;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import TinderEvolution.Dominio.GeneroFilme;
import TinderEvolution.Dominio.Filme;
import TinderEvolution.Gerenciador.FilmeGerenciador;


public class FilmeMenu {
    private FilmeGerenciador gerenciador;

    public FilmeMenu() {
        this.gerenciador = new FilmeGerenciador();
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

    public Filme create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Filme...");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo: ");
        System.out.println("[ A ] ACAO");
        System.out.println("[ C ] COMEDIA");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ M ] MUSICAL");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.print("> ");
        String estilo = scanner.next();

        GeneroFilme generoFilme;
        switch (estilo) {
            case "A":
                generoFilme = GeneroFilme.ACAO;
                break;
            case "C":
                generoFilme = GeneroFilme.COMEDIA;
                break;
            case "D":
                generoFilme = GeneroFilme.DRAMA;
                break;
            case "M":
                generoFilme = GeneroFilme.MUSICAL;
                break;
            case "S":
                generoFilme = GeneroFilme.SUSPENSE;
                break;
            case "T":
                generoFilme = GeneroFilme.TERROR;
                break;
            default:
                generoFilme = GeneroFilme.DRAMA;
                break;
        }

        Filme filme = new Filme(nome, sinopse, diretor, generoFilme, LocalDate.of(ano, mes, dia));
        return gerenciador.salvar(filme);

    }

    public Filme editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Filme...");
        System.out.println("Qual filme deseja editar?");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[" + filme.getId() + "] - " + filme.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt(); scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo: ");
        System.out.println("[ A ] ACAO");
        System.out.println("[ C ] COMEDIA");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ M ] MUSICAL");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.print("> ");
        String estilo = scanner.next();

        GeneroFilme generoFilme;
        switch (estilo) {
            case "A":
                generoFilme = GeneroFilme.ACAO;
                break;
            case "C":
                generoFilme = GeneroFilme.COMEDIA;
                break;
            case "D":
                generoFilme = GeneroFilme.DRAMA;
                break;
            case "M":
                generoFilme = GeneroFilme.MUSICAL;
                break;
            case "S":
                generoFilme = GeneroFilme.SUSPENSE;
                break;
            case "T":
                generoFilme = GeneroFilme.TERROR;
                break;
            default:
                generoFilme = GeneroFilme.DRAMA;
                break;
        }

        Filme atualizacao = new Filme(nome, sinopse, diretor, generoFilme, LocalDate.of(ano, mes, dia));

        Filme filmeAtualizado = gerenciador.editar(id, atualizacao);

        if (filmeAtualizado == null) {
            System.out.println("Filme não encontrado.");
        } else {
            System.out.println(filmeAtualizado);
        }

        return filmeAtualizado;
    }

    private List<Filme> listar() {

        System.out.println("\nListagem de Filme...");
        List<Filme> filmes = gerenciador.listar();

        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        return filmes;

    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Filme...");
        System.out.println("Qual o código da filme? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Filme filme = gerenciador.procurar(id);

        if (filme == null) {
            System.out.println("Filme não encontrado.");
        } else {
            System.out.println(filme);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Filme...");
        System.out.println("Qual filme deseja deletar?");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[" + filme.getId() + "] - " + filme.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Filme deletado.");
        } else {
            System.out.println("Filme não encontrado.");
        }

    }
}
