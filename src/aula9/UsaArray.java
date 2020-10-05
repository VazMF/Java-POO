package aula9;

import java.util.Scanner;

public class UsaArray {
    private Scanner input;

    public UsaArray(){
        //instancie a classe Scanner
        input = new Scanner(System.in);
    }

    public void carregaArray(int arr[]){
    /*
      Faça entrada de dados e atribuição nos elementos do array. Faça o tratamento de exceção.
    */
        try {
            for (int i=0; i < arr.length; i++) {
                System.out.print("Digite um número: ");
                arr[i] = input.nextInt();
            }
        } catch (Exception e) {
            System.out.println("[ERRO} " + e.getMessage());
        }

    }
    public String mostraArray(int arr[]){
    /*
        Retorne os numeros armazenados no array.
    */
        String out = "";
        for (int x=0; x < arr.length; x++) {
            out += "Index: " + x + " valor: " + arr[x] + '\n';
        }
        return out;
    }

    public int[] geraArrayDivisao(int arrA[], int arrB[]){
    /*
        Gerar e retornar um array com a divisão do arrA[] por arrB[].
        Faça o tratamento de exceção.
    */
        int[] myArray = new int[5];

        try {
            for (int i = 0; i < arrA.length; i++) {
                myArray[i] = arrA[i] / arrB[i];
            }
        } catch (Exception e) {
            System.out.println("[ERRO] " + e.getMessage());
        }

    return myArray;
    }

    /*
    Faça uma classe para testar os métodos carregaArray(int arr[]), mostraArray(int arr[]) e
    geraArrayDivisao(int arrA[], int arrB[])
     */
}
