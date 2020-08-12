package aula3;

public class Gerente extends Empregado{
    private double bonus;

    public Gerente(String nome, double salario, double bonus){
        super(nome, salario); //chamada do construtor da super classe
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //override subscreve o salario podendo usar o @Override
    public double getSalario(){
        return salario + bonus;
    }
}
