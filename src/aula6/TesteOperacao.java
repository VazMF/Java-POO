package aula6;

public class TesteOperacao {
    public static void main(String[] args) {
        Operacao ope = new Operacao();
        System.out.println((ope.soma(5,7))); // chama o primeiro metodo
        System.out.println(ope.soma(3.5, 2.7, 6.1)); // chama o quarto metodo

        int[] vetor = {3,4,5,6};
        System.out.println(ope.soma(vetor));

        int[] vetorNum = {20, 30, 40, 5, 67, 2};
        System.out.println(ope.soma(vetorNum));

        System.out.println("O maior entre 5 e 9 é " + ope.maiorNum(5,9));
        System.out.println("O maior entre 7, 9 e 2 é " + ope.maiorNum(7,9,2));
    }
}
