package aula10;

import java.util.InputMismatchException;

public class TesteAula10 {
    public static void main(String[] args) {
        Aula10 aula = new Aula10();

        int[] a = new int[10];

        try {
            aula.carregaArray(a);
        } catch (InputMismatchException e) {
            System.out.println("[ERRO] Ocorreu um erro na entrada de dados");
        }

    }
}
