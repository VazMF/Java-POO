package br.edu.unifil.lp1.abstrato.modelo;

public class Comissionado extends Funcionario {
    private double comissao;
    private int qtdVendida;

    public Comissionado(String nome, int matricula, double salario, double comissao, int qtdVendida) {
        super(nome, matricula, salario);
        this.comissao = comissao;
        this.qtdVendida = qtdVendida;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }


    @Override
    public double getGanhoMensal() {
        return (getSalario() + getComissao()) * getQtdVendida();
    }

    @Override
    public String getDescricao() {
        return "Nome: " + getNome() + '\n' + "Ganho mensal: " + getGanhoMensal() + '\n';
    }
}
