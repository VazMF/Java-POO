package aula15;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declaração e instância da matriz 4x4
        int matriz[][] = new int[4][4];

        //lendo os valores para as posições
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Informe um valor para a %d° linha e %d° coluna: ", i+1, j+1);
                matriz[i][j] = input.nextInt();
            }
        }

        //mostra os números armazenados
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Valor na linha %d e coluna %d = %d\n", i+1, j+1, matriz[i][j]);
            }
        }

        //mostra a soma da segunda coluna
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma = soma + matriz[i][1];
        }
        System.out.println("Soma da segunda coluna: " + soma);

        //mostra a soma da terceira linha
        soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[2][i];
        }
        System.out.println("Soma da terceira linha: " + soma);

        //mostra a soma de todos os números armazenados na matriz
        soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[j].length; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println("Soma geral: " + soma);

        int media = soma / matriz.length;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > media) {
                    System.out.printf("Valor na linha %d e coluna %d = %d\n", i+1, j+1, matriz[i][j]);
                }
            }
        }

        soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        System.out.println("Soma digonal: " + soma);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    matriz[i][j] = matriz[i][j] * 2;
                }
            }
        }
        System.out.println();
    }
}
