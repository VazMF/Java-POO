package aula7.mesmoPacote;
//sublclasse no mesmo pacote
public class Empregado extends Pessoa{
    protected double salary;

    public Empregado(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //é um override
    public void showData() {
        //System.out.println(name);
        super.showData();
        System.out.println("Salário: " + salary);
    }

    public double getSalary() {
        return this.salary;
    }
}
