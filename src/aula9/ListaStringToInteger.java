package aula9;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaStringToInteger {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<Integer> n1 = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int opc = 0, posicao;
        String nums = "";

        while (opc != 9) {
            System.out.println("[ 1 ] Incluir par de número");
            System.out.println("[ 2 ] Mostrar pares");
            System.out.println("[ 9 ] Encerrar programa");
            opc = input.nextInt();
            input.nextLine();

            try {
                switch (opc) {
                    case 1:
                        System.out.print("Informe um par de números inteiros: ");
                        nums = input.nextLine();
                        lista.add(nums);
                        break;
                    case 2:
                        for (int i = 0; i < lista.size(); i++) {
                            nums = lista.get(i);
                            posicao = nums.indexOf(" ");
                            n1.add(Integer.parseInt(nums.substring(0, posicao)));
                            n2.add(Integer.parseInt(nums.substring(posicao + 1)));
                        }
                        System.out.println("Lista1: " + n1);
                        System.out.println("Lista2: " + n2);
                        break;
                    case 9:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Programa encerrado.");

      /*
        a) Crie uma lista para armazenar pares de numeros inteiros, por exemplo: 11 23. Utilize ArrayList.
        b) Leia a lista, separe os dois números e inclua o primeiro número em um ArrayList<Integer> (listaN1) e o
           segundo número em um ArrayList<Integer> (listaN2).
        c) Faça o tratamento de exceção se ocorrer erro na conversão.
      */
    }
}
