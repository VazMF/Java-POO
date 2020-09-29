package br.edu.unifil.lpoo.universidade.modelo;

public class ProfessorDE extends Professor {
    private int qtdLicenca;

    public ProfessorDE(String nome, double salario, String matricula, int qtdLicenca) {
        super(nome, salario, matricula);
        this.qtdLicenca = qtdLicenca;
    }

    public int getQtdLicenca() {
        return qtdLicenca;
    }

    public void setQtdLicenca(int qtdLicenca) {
        this.qtdLicenca = qtdLicenca;
    }

    @Override
    public String getDados() {
        return super.getDados() + "\nPremium: " + qtdLicenca;
    }
}
