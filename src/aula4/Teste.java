package aula4;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;
        int opcao1 = 0;
        int novaVel;
        int velMax;

        Liquidificador liq = new Liquidificador(0);
        LiquidificadorDigital ld = new LiquidificadorDigital(0);
        LiquidificadorAnalogico la = new LiquidificadorAnalogico(0);


        System.out.println("[1] Liquidificador Analógico");
        System.out.println("[2] Liquidificador Digital");
        System.out.print("Qual seu tipo de liquidificador? ");
        opcao1 = teclado.nextInt();
        System.out.print("Qual a velocidade máxima? ");
        velMax = teclado.nextInt();

        if (opcao1 == 1){
            la.setVelocidadeMax(velMax);
        }
        else if (opcao1 == 2){
            ld.setVelocidadeMax(velMax);
        }

        switch (opcao1) {
            case 1:
                while (opcao != 9){
                    System.out.println("---------------------------------------------");
                    System.out.println("[1] Aumentar velocidade");
                    System.out.println("[2] Diminuir velocidade");
                    System.out.println("[9] Encerrar");
                    System.out.print("O que deseja fazer? ");
                    opcao = teclado.nextInt();
                    switch (opcao) {
                        case 1:
                            la.aumentarVelocidade();
                            System.out.println("O liquidificador está na velocidade " + la.getVelocidade());
                            break;
                        case 2:
                            la.diminuirVelocidade();
                            System.out.println("O liquidificador está na velocidade " + la.getVelocidade());
                            break;
                        case 9:
                            break;
                        default:
                            System.out.println("Informe uma opção válida.");
                    }
                }
            case 2:
                while (opcao != 9){
                    System.out.println("---------------------------------------------");
                    System.out.println("[1] Trocar velocidade");
                    System.out.println("[9] Encerrar");
                    System.out.print("O que deseja fazer? ");
                    opcao = teclado.nextInt();
                    switch (opcao){
                        case 1:
                            System.out.print("Infome a velocidade: ");
                            novaVel = teclado.nextInt();
                            ld.trocarVelocidade(novaVel);
                            System.out.println("A velocidade é " + ld.getVelocidade());
                            break;
                        case 9:
                            break;
                    }
                }
        }
    }
}
