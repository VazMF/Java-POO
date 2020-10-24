package br.edu.unifil.lp1.abstrato.modelo;

public class Producao extends Funcionario {
    private int qtdProduzida;

    public Producao(String nome, int matricula, double salario, int qtdProduzida) {
        super(nome, matricula, salario);
        this.qtdProduzida = qtdProduzida;
    }

    public int getQtdProduzida() {
        return qtdProduzida;
    }

    public void setQtdProduzida(int qtdProduzida) {
        this.qtdProduzida = qtdProduzida;
    }

    @Override
    public double getGanhoMensal() {
        return getSalario() * getQtdProduzida();
    }

    @Override
    public String getDescricao() {
        return "Nome: " + getNome() + '\n' + "Ganho mensal: " + getGanhoMensal() + '\n';
    }
}
