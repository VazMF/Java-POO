package aula12;

public abstract class Empregado extends Pessoa{
    private int matricula;

    public Empregado(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //public abstract void listarDadosEmpregado();
}
