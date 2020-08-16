package exercicios.Heranca;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;
        String nome;
        int ano;
        String matricula;
        int dependentes;
        double valConsulta;

        System.out.println("POR FAVOR PREENCHA OS CAMPOS A SEGUIR:");
        System.out.print("Número de Matrícula: ");
        matricula = teclado.nextLine();
        System.out.print("Nome completo: ");
        nome = teclado.nextLine();
        System.out.print("Ano de inclusão: ");
        ano = teclado.nextInt();
        System.out.print("Número de dependentes: ");
        dependentes = teclado.nextInt();
        System.out.print("Valor da Consulta: R$");
        valConsulta = teclado.nextDouble();


        while (opcao != 5){
            System.out.println("[1] Consulta Prata");
            System.out.println("[2] Consulta Diamante");
            System.out.println("[3] Consulta Ouro");
            System.out.println("[4] Consulta Família");
            System.out.println("[5] Encerrar");
            System.out.print("Qual seu plano? ");
            opcao = teclado.nextInt();


            switch (opcao){
                case 1:
                    ConsultasPrata prata = new ConsultasPrata();
                    prata.setNomePaciente(nome);
                    prata.setAnoInclusao(ano);
                    prata.setMatricula(matricula);
                    prata.setNumDependentes(dependentes);
                    prata.setValorConsulta(valConsulta);
                    System.out.println("Você tem 20% de desconto, sua consulta custará R$" + prata.getValorConsulta());
                    break;
                case 2:
                    ConsultasDiamante diamante = new ConsultasDiamante();
                    diamante.setNomePaciente(nome);
                    diamante.setAnoInclusao(ano);
                    diamante.setMatricula(matricula);
                    diamante.setNumDependentes(dependentes);
                    diamante.setValorConsulta(valConsulta);
                    System.out.println("Você tem 40% de desconto, sua consulta custará R$" + diamante.getValorConsulta());
                    break;
                case 3:
                    ConsultasOuro ouro = new ConsultasOuro();
                    ouro.setNomePaciente(nome);
                    ouro.setAnoInclusao(ano);
                    ouro.setMatricula(matricula);
                    ouro.setNumDependentes(dependentes);
                    ouro.setValorConsulta(valConsulta);
                    System.out.println("A consulta custará " + ouro.getValorConsulta());
                    break;
                case 4:
                    ConsultasFamilia familia = new ConsultasFamilia();
                    familia.setNomePaciente(nome);
                    familia.setAnoInclusao(ano);
                    familia.setMatricula(matricula);
                    familia.setNumDependentes(dependentes);
                    familia.setValorConsulta(valConsulta);
                    System.out.println("A consulta custará R$" + familia.getValorConsulta());
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar nosso sistema :)");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}
