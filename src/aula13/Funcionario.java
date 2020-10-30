package aula13;

public abstract class Funcionario {
    protected int matricula;
    protected String nome;
    protected double salario;

    private static int proxMatricula = 1;

    public Funcionario() {
        this.matricula = proxMatricula++;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonificacao();
}
