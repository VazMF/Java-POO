package br.edu.unifil.lp1.abstrato.visao;
import br.edu.unifil.lp1.abstrato.controle.Controle;
import br.edu.unifil.lp1.abstrato.modelo.Funcionario;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Controle ctrl = new Controle();

        String nome;
        int opc = 0;
        int opc2 = 0;
        int matricula;
        double salario;

        while (opc != 9) {
            System.out.println("-------------------------------------------------");
            System.out.println("[ 1 ] Incluir funcionário");
            System.out.println("[ 2 ] Listar funcionário");
            System.out.println("[ 3 ] Consultar funcionário por matrícula");
            System.out.println("[ 4 ] Excluir funcionário");
            System.out.println("[ 5 ] Atualizar salário");
            System.out.println("[ 9 ] Encerrar programa");
            System.out.print("Escolha uma opção: ");
            opc = input.nextInt();
            input.nextLine();
            System.out.println("-------------------------------------------------");

            switch (opc) {
                case 1:
                    try {
                        System.out.println("[ 1 ] Mensalista");
                        System.out.println("[ 2 ] Comissionado");
                        System.out.println("[ 3 ] Horista");
                        System.out.println("[ 4 ] Produção");
                        System.out.print("Escolha um tipo de funcionário: ");
                        opc2 = input.nextInt();
                        input.nextLine();
                        System.out.println("-------------------------------------------------");

                        System.out.print("Nome: ");
                        nome = input.nextLine();
                        System.out.print("Matricula: ");
                        matricula = input.nextInt();
                        System.out.print("Salario: ");
                        salario = input.nextDouble();

                        if (opc2 == 1) {
                            ctrl.cadastrarFuncionario(nome, matricula, salario);
                        } else if (opc2 == 2) {
                            System.out.print("Comissão: R$");
                            double comissao = input.nextDouble();
                            System.out.print("Qtd. Vendida: ");
                            int qtd = input.nextInt();
                            ctrl.cadastrarFuncionario(nome, matricula, salario, comissao, qtd);
                        } else if (opc2 == 3) {
                            System.out.print("Horas trabalhadas: ");
                            double horas = input.nextDouble();
                            ctrl.cadastrarFuncionario(nome, matricula, salario, horas);
                        } else if (opc2 == 4) {
                            System.out.print("Qtd. Produzida: ");
                            int qtd = input.nextInt();
                            ctrl.cadastrarFuncionario(nome, matricula, salario, qtd);
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println(ctrl.listarFuncionario());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Informe a mátricula: ");
                        matricula = input.nextInt();

                        nome = ctrl.getFuncionario(matricula).getDescricao();
                        System.out.println(nome);
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case  4:
                    try {
                        System.out.print("Informe a matricula: ");
                        matricula = input.nextInt();

                        Funcionario func = ctrl.getFuncionario(matricula);
                        ctrl.excluirFuncionario(func);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.print("Informe a matricula: ");
                        matricula = input.nextInt();

                        System.out.print("Novo salário: R$");
                        salario = input.nextDouble();
                        Funcionario aux = ctrl.getFuncionario(matricula);
                        aux.setSalario(salario);

                        System.out.println("O salário foi atualizado");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 9:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Infome uma opção válida");
                    break;
            }
        }
    }
}