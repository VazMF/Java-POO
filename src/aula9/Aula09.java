package aula9;

import java.util.Scanner;

public class Aula09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String num,  aux1, aux2;
        int n1, n2, posicao;

        try {
            System.out.print("Informe um par de números inteiros: ");
            num = input.nextLine();

            System.out.println(num.indexOf(','));
            System.out.println(num.indexOf("0,1"));
            System.out.println(num.indexOf(',', 5));

            posicao = num.indexOf(',');

            System.out.println(num.substring(posicao + 1));
            aux2 = num.substring(posicao + 1);
            n2 = Integer.parseInt(aux2.trim());

            aux1 = num.substring(0, posicao);
            System.out.println(aux1);
            n1 = Integer.parseInt(aux1.trim());


            System.out.println(n1 + n2);
        } catch (NumberFormatException e) {
            System.out.println("\033[31m[ERRO] Ocorreu um problema na conversão.\033[m");
        } catch (Exception e) {
            System.out.println("\033[31m[ERRO] Ocorreu um erro inesperado.\033[m");
            System.out.println(e.getMessage());
        }
    }
}
