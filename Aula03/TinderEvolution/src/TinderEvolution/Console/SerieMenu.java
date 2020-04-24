package TinderEvolution.Console;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import TinderEvolution.Dominio.GeneroSerie;
import TinderEvolution.Dominio.Serie;
import TinderEvolution.Gerenciador.SerieGerenciador;

public class SerieMenu {
    private SerieGerenciador gerenciador;

    public SerieMenu() {
        this.gerenciador = new SerieGerenciador();
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

    public Serie create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Série...");

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
        System.out.println("[ S ] SITCOM");
        System.out.println("[ U ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.print("> ");
        String estilo = scanner.next();

        GeneroSerie generoSerie;
        switch (estilo) {
            case "A":
                generoSerie = GeneroSerie.ACAO;
                break;
            case "C":
                generoSerie = GeneroSerie.COMEDIA;
                break;
            case "D":
                generoSerie = GeneroSerie.DRAMA;
                break;
            case "S":
                generoSerie = GeneroSerie.SITCOM;
                break;
            case "U":
                generoSerie = GeneroSerie.SUSPENSE;
                break;
            case "T":
                generoSerie = GeneroSerie.TERROR;
                break;
            default:
                generoSerie = GeneroSerie.DRAMA;
                break;
        }

        System.out.print("Quantidade de Temporadas: ");
        int quantidadeTemporadas = scanner.nextInt();

        System.out.print("Total de Episódios: ");
        int quantidadeEpisodios = scanner.nextInt();

        Serie serie = new Serie(nome, sinopse, diretor, generoSerie, LocalDate.of(ano, mes, dia), quantidadeTemporadas, quantidadeEpisodios);
        return gerenciador.salvar(serie);

    }

    public Serie editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Série...");
        System.out.println("Qual serie deseja editar?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
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
        System.out.println("[ S ] SITCOM");
        System.out.println("[ U ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.print("> ");
        String estilo = scanner.next();

        GeneroSerie generoSerie;
        switch (estilo) {
            case "A":
                generoSerie = GeneroSerie.ACAO;
                break;
            case "C":
                generoSerie = GeneroSerie.COMEDIA;
                break;
            case "D":
                generoSerie = GeneroSerie.DRAMA;
                break;
            case "S":
                generoSerie = GeneroSerie.SITCOM;
                break;
            case "U":
                generoSerie = GeneroSerie.SUSPENSE;
                break;
            case "T":
                generoSerie = GeneroSerie.TERROR;
                break;
            default:
                generoSerie = GeneroSerie.DRAMA;
                break;
        }

        System.out.print("Quantidade de Temporadas: ");
        int quantidadeTemporadas = scanner.nextInt();

        System.out.print("Total de Episódios: ");
        int quantidadeEpisodios = scanner.nextInt();

        Serie atualizacao = new Serie(nome, sinopse, diretor, generoSerie, LocalDate.of(ano, mes, dia), quantidadeTemporadas, quantidadeEpisodios);

        Serie serieAtualizado = gerenciador.editar(id, atualizacao);

        if (serieAtualizado == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(serieAtualizado);
        }

        return serieAtualizado;
    }

    private List<Serie> listar() {

        System.out.println("\nListagem de Série...");
        List<Serie> series = gerenciador.listar();

        for (Serie serie : series) {
            System.out.println(serie);
        }

        return series;

    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Série...");
        System.out.println("Qual o código da serie? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Serie serie = gerenciador.procurar(id);

        if (serie == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(serie);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Série...");
        System.out.println("Qual serie deseja deletar?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Série deletada.");
        } else {
            System.out.println("Série não encontrada.");
        }

    }
}
