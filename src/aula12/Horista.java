package aula12;

public class Horista extends Empregado {
    private double horasTrab;

    public Horista(String nome, int matricula, double horasTrab) {
        super(nome, matricula);
        this.horasTrab = horasTrab;
    }

    public String getDescricao() {
        return "É um horista" + horasTrab + " horas";
    }

    public void listarDadosEmpregado() {
        System.out.println(horasTrab);
    }
}
