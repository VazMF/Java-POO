package aula7.foraDoPacote;

import aula7.mesmoPacote.Empregado;
//de uma subclasse fora do mesmo pacote
public class Gerente extends Empregado {
    double bonus;

    public Gerente(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    //override tb
    public void showData() {
        //System.out.println(name);
        super.showData();
        System.out.println("Bonus: " + bonus);
    }

    @Override
    public double getSalary() {
        return salary + bonus;
    }
}
