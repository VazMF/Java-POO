package aula3;

public class Empregado extends Pessoa{
    protected double salario; //protected permite que as subclasses tenham acesso ao atributo

    public Empregado(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
