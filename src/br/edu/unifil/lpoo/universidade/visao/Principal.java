package br.edu.unifil.lpoo.universidade.visao;

import br.edu.unifil.lpoo.universidade.controle.Controle;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Controle control = new Controle();

        int opc = 0;
        int opc1 = 0;
        String name;
        double salary;
        String registry;
        int premium;
        double hours;

        while (opc != 4) {
            System.out.println("[ 1 ] Incluir professor");
            System.out.println("[ 2 ] Listar professores");
            System.out.println("[ 3 ] Mostrar dados dos professores");
            System.out.println("[ 4 ] Encerrar o programa");
            System.out.print("O que deseja fazer? ");
            opc = input.nextInt();
            input.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("[ 1 ] Professor com dedicação exclusiva");
                    System.out.println("[ 2 ] Professor Horista");
                    System.out.print("Escolha um tipo de professor: ");
                    opc1 = input.nextInt();
                    input.nextLine();
                    System.out.print("Nome: ");
                    name = input.nextLine();
                    System.out.print("Salário: ");
                    salary = input.nextDouble();
                    input.nextLine();
                    System.out.print("Mátricula: ");
                    registry = input.nextLine();
                    if ( opc1 == 1) {
                        System.out.print("Qtd. Premium: ");
                        premium = input.nextInt();
                        control.incluirProfessor(name, salary, registry, premium);
                    } else if (opc1 == 2) {
                        System.out.print("Horas trabalhadas: ");
                        hours = input.nextDouble();
                        control.incluirProfessor(name, salary, registry, hours);
                    }
                    break;
                case 2:
                    System.out.println(control.listarProfessores());
                    break;
                case 3:
                    System.out.println(control.mostrarDados());
                    break;
                default:
                    System.out.println("\033[31m[ERRO] Digite uma opção válida.\033[m");
            }
        }
        System.out.println("Programa encerrado, volte sempre :)");
    }
}
