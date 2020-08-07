package aula2;

public class Aluno extends Pessoa{
    private int matricula;
    private double []notas;

    public Aluno(String nome){
        super(nome); //chamando o construtor da superclasse(pessoa) sempre como primeiro comando
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
