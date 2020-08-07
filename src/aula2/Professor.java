package aula2;

public class Professor extends Pessoa{
    private double salario;
    private String departamento;


    public Professor(String nome){
        super(nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
