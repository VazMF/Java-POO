package br.edu.unifil.lp1.abstrato.modelo;

public class Horista extends Funcionario{
    private double horasTrabalhadas;

    public Horista(String nome, int matricula, double salario, double horasTrabalhadas) {
        super(nome, matricula, salario);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }


    @Override
    public double getGanhoMensal() {
        return getSalario() * getHorasTrabalhadas();
    }

    @Override
    public String getDescricao() {
        return "Nome: " + getNome() + '\n' + "Ganho mensal: " + getGanhoMensal() + '\n';
    }
}
