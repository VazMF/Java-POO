package aula11;

import aula10.SaldoInsuficienteException;

public class Conta {
    private int numero;
    String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        // sendo o valor do parâmetro um valor negativo, ou zero, lançar uma exception
        if (valor <= 0) {
            throw new IllegalArgumentException("Saque inválido.");
        } else {
            if (valor > saldo) {
                throw new SaldoInsuficienteException("Saldo insuficiente: " + this.saldo);
            } else {
                saldo -= valor;
            }
        }

    }

    public void depositar(double valor) throws IllegalArgumentException{
        // sendo o valor do parâmetro um valor negativo, ou zero, lançar uma exception
        if (valor <= 0) {
            throw new IllegalArgumentException("Deposito inválido");
        } else {
            saldo += valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
