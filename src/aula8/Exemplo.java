package aula8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Faça um programa que aceite dois numeros inteiros e mostre a divsão do num1 por num2
 */

public class Exemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        try {
            System.out.print("Informe o primeiro número: ");
            num1 = input.nextInt();
            System.out.print("Informe o segundo número: ");
            num2 = input.nextInt();
            System.out.println("O resultado da divisão é: " + num1 / num2);
        } catch (Exception e) {
            System.out.println("ocorreu um erro");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
