package aula3;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Empregado> listaEmp = new ArrayList<Empregado>();
        Empregado emp = new Empregado("Edson", 1000);
        Scanner teclado = new Scanner((System.in));

        String nome;
        double salario;

        for (int i=0; i < 5; i++){
            System.out.println("Nome: ");
            nome = teclado.nextLine();
            System.out.println("Salário: ");
            salario = teclado.nextDouble();teclado.nextLine();
            listaEmp.add (new Empregado(nome,salario));
        }

        Empregado aux;
        for (int i=0; i < 5; i++){
            aux = listaEmp.get(i);
            System.out.println(aux.getNome() + " " + aux.getSalario());
        }
        System.out.println("Tamanho da lista: " + listaEmp.size());

        Empregado []lista2 = new Empregado[10];
    }
}
