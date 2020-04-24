package calculadorapagamentos;

import java.util.Scanner;

public class CalculadoraFolhaMensal {

    public static void main(String[] args) {
        System.out.println("----------- Aplicação calculo folha mensal -----------\n\n");
        int opcao = 0;

        while (opcao != 9) {
            imprimeMenu();
            opcao = lerInteiro();

            Scanner in = new Scanner(System.in);
            System.out.println("Nome: ");
            String nome = in.next();
            System.out.println("CPF: ");
            String cpf = in.next();
            System.out.println("Salário: ");
            double salario = in.nextDouble();

            int numeroCertificacaoes;
            double lucroUltimoAno;

            if (opcao == 1) {
                // Cadastra Engenheiro
                Funcionario.funcionarioList.add(new Engenheiro(nome, cpf, salario));
            } else if (opcao == 2) {
                // Cadastra Programador
                System.out.println("Número de certificações: ");
                numeroCertificacaoes = in.nextInt();
                Funcionario.funcionarioList.add(new Programador(nome, cpf, salario, numeroCertificacaoes));
            } else if (opcao == 3) {
                // Cadastra Gerente
                System.out.println("Lucro no último ano: ");
                lucroUltimoAno = in.nextDouble();
                Funcionario.funcionarioList.add(new Gerente(nome, cpf, salario, lucroUltimoAno));
            } else {
                System.out.println("----------- Opção invalida -----------");
            }
        }
        // Calculo da folha mensal

        double totalDespesas = 0;
        for (Funcionario f : Funcionario.funcionarioList){
            totalDespesas += f.getRemuneracaoMensal();
        }
        System.out.println("Total de despesas = " + totalDespesas);
    }

    private static int lerInteiro() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void imprimeMenu() {
        System.out.println("----------- 1 - Cadastro Engenheiro              -----------");
        System.out.println("----------- 2 - Cadastro Programador             -----------");
        System.out.println("----------- 3 - Cadastro Gerente                 -----------");
        System.out.println("----------- 9 - Calcular e imprimir folha mensal -----------");
    }

}