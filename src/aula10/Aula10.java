package aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula10 {
    private Scanner input;

    public Aula10() {
        input = new Scanner(System.in);
    }

    public void carregaArray(int arr[]) throws InputMismatchException {
        for (int i=0; i < arr.length; i++) {
                System.out.print("Digite um número: ");
                arr[i] = input.nextInt();
        }
    }
}
