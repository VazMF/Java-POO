package aula11;

import aula10.SaldoInsuficienteException;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conta conta = new Conta(1224, "Fulano");

        double valor;

        try {
            System.out.print("Valor do Depósito: R$");
            valor = input.nextDouble();
            conta.depositar(valor);
            System.out.println("Depósito realizado com sucesso.");
        } catch (IllegalArgumentException e) {
            System.out.println("Não foi possível realizar o depósito.");
        }

        try {
            System.out.print("Valor do Saque: R$");
            valor = input.nextDouble();
            conta.sacar(valor);
            System.out.println("Saque realizado com sucesso.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Não foi possível efetuar o saque.");
        }

        System.out.print("SALDO ATUAL: " + conta.getSaldo());

    }
}