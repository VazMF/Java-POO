package aula13;

import java.util.ArrayList;

public class Controle {
    private ArrayList<Funcionario> listaFunc;
    private ArrayList<Fornecedor> listaForn;

    public Controle() {
        listaFunc = new ArrayList<>();
    }

    public void inserirFuncionario(Funcionario func) {
        listaFunc.add(func);
    }

    public Funcionario getFuncionario(int matricula) {
        Funcionario aux;
        for (int i = 0; i < listaFunc.size(); i++) {
            aux = listaFunc.get(i);
            if (aux.getMatricula() == matricula) {
                return aux;
            }
        }
        return null;
    }

    public void inserirFornecedor(Fornecedor forn) {
        listaForn.add(forn);
    }

    public Fornecedor getFornecedor(String nome) {
        Fornecedor aux;
        for (int i = 0; i < listaForn.size(); i++) {
            aux = listaForn.get(i);
            if (aux.getNome().equals((nome))) {
                return aux;
            }
        }
        return null;
    }
}
