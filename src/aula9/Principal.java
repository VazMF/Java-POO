package aula9;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UsaArray use = new UsaArray();

        int opc = 0;
        int[] numeros = new int[5];
        int[] numeros2 = new int[5];
        String aux = "";

        while (opc != 9) {
            System.out.println("[ 1 ] Carregar array");
            System.out.println("[ 2 ] Mostrar array");
            System.out.println("[ 3 ] Dividir array");
            System.out.println("[ 9 ] Encerrar programa");
            System.out.print("Escolha uma opção: ");
            opc = input.nextInt();
            input.nextLine();

            switch (opc) {
                case 1:
                    use.carregaArray(numeros);
                    break;
                case 2:
                    System.out.println(use.mostraArray(numeros));
                    break;
                case 3:
                    use.carregaArray(numeros2);
                    System.out.println("Divisão: " + Arrays.toString(use.geraArrayDivisao(numeros, numeros2)));
                    break;
                case 9:
                    break;
            }
        }
        System.out.println("Programa encerrado.");
    }
}
