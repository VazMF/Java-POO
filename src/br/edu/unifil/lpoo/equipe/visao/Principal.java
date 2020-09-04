package br.edu.unifil.lpoo.equipe.visao;

import br.edu.unifil.lpoo.equipe.controle.Controle;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        String nome;
        String posicao;
        String time;

        Controle control = new Controle();

        while (opcao != 9){
            System.out.println("-----------------------------------------");
            System.out.println("[1] Cadastrar jogador");
            System.out.println("[2] Cadastrar time");
            System.out.println("[3] Contratar jogador");
            System.out.println("[4] Demitir jogador");
            System.out.println("[5] Listar jogadores de um time");
            System.out.println("[6] Listar jogadores por posição");
            System.out.println("[9] Encerrar o programa");
            System.out.print("O QUE DESEJA FAZER? ");
            opcao = input.nextInt();
            input.nextLine();
            System.out.println("-----------------------------------------");
            switch (opcao){
                case 1:
                    System.out.print("Nome do jogador: ");
                    nome = input.nextLine();
                    System.out.print("Posição: ");
                    posicao = input.next();
                    control.cadJogador(nome, posicao);
                    break;
                case 2:
                    System.out.print("Nome do time: ");
                    time = input.nextLine();
                    control.cadEquipe(time);
                    System.out.println("Equipe " + time + " adicionada com sucesso!");
                    break;
                case 3:
                    System.out.print("Nome do time: ");
                    time = input.nextLine();
                    System.out.print("Nome do jogador: ");
                    nome = input.nextLine();
                    control.contratarJogador(time, nome);
                    break;
                case 4:
                    System.out.print("Nome do time: ");
                    time = input.nextLine();
                    System.out.print("Nome do jogador: ");
                    nome = input.nextLine();
                    control.demitirJogador(time, nome);
                    break;
                case 5:
                    System.out.print("Nome do time: ");
                    time = input.nextLine();
                    System.out.println(control.listarJogEq(time));
                    break;
                case 6:
                    System.out.print("Posição: ");
                    posicao = input.nextLine();
                    System.out.println(control.mostrarJogPos(posicao));
                    break;
                case 9:
                    System.out.println("Programa encerrado. Volte sempre :)");

            }
        }
    }
}
