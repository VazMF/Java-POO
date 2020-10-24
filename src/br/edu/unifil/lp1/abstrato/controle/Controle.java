package br.edu.unifil.lp1.abstrato.controle;

import br.edu.unifil.lp1.abstrato.modelo.*;

import java.util.ArrayList;

public class Controle {
    private ArrayList<Funcionario> listEmp;

    public Controle(){
        listEmp = new ArrayList<>();
    }

    public void cadastrarFuncionario(String nome, int matricula, double salario) {
        Mensalista aux = new Mensalista(nome, matricula, salario);
        listEmp.add(aux);
    }

    public void cadastrarFuncionario(String nome, int matricula, double salario, double comissao, int qtdVendida) {
        Comissionado aux = new Comissionado(nome, matricula, salario, comissao, qtdVendida);
        listEmp.add(aux);
    }

    public void cadastrarFuncionario(String nome, int matricula, double salario, double horasTrabalhadas) {
        Horista aux = new Horista(nome, matricula, salario, horasTrabalhadas);
        listEmp.add(aux);
    }

    public void cadastrarFuncionario(String nome, int matricula, double salario, int qtdProduzida) {
        Producao aux = new Producao(nome, matricula, salario, qtdProduzida);
        listEmp.add(aux);
    }

    public String listarFuncionario() {
        String out = "";
        Funcionario funci;
        for (int i = 0; i < listEmp.size(); i++) {
            funci = listEmp.get(i);
            out += "Matricula: " + funci.getMatricula() + '\n' + " Nome: " + funci.getNome() + '\n' + " Ganho: " + funci.getGanhoMensal() + '\n';
        }
        return out;
    }

    public Funcionario getFuncionario(int matricula) {
        Funcionario funcAux;
        Funcionario out = null;
        for (int i = 0; i < listEmp.size(); i++) {
            funcAux = listEmp.get(i);
            if (funcAux.getMatricula() == matricula) {
               out = funcAux;
               break;
            }
        }
        return out;
    }

    public void excluirFuncionario(Funcionario funcionario) {
        Funcionario fun;
        for (int j = 0; j < listEmp.size(); j++) {
            fun = listEmp.get(j);
            if (fun.equals(funcionario)) {
                listEmp.remove(fun);
            }
        }
    }

}
