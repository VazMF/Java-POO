package br.edu.unifil.lpoo.universidade.controle;

import br.edu.unifil.lpoo.universidade.modelo.Professor;
import br.edu.unifil.lpoo.universidade.modelo.ProfessorDE;
import br.edu.unifil.lpoo.universidade.modelo.ProfessorHorista;

import java.util.ArrayList;

public class Controle {
    private ArrayList<Professor> listProfessores;

    public Controle() {
        listProfessores = new ArrayList<>();
    }

    public void incluirProfessor(String nome, double salario, String matricula, int premium) {
        ProfessorDE prof1 = new ProfessorDE(nome, salario, matricula, premium);
        listProfessores.add(prof1);
    }

    public void incluirProfessor(String nome, double salario, String matricula, double horas) {
        ProfessorHorista prof2 = new ProfessorHorista(nome, salario, matricula, horas);
        listProfessores.add(prof2);
    }


    public String listarProfessores () {
        Professor auxProf;
        String out = "";
        for (int i = 0; i < listProfessores.size(); i ++) {
            auxProf = listProfessores.get(i);
            out += "Nome: " + auxProf.getNome() + '\n' + "Salário: " + auxProf.getSalario() + '\n';
        }
        return out;
    }

    public String mostrarDados() {
        Professor profAux;
        String out = "";
        for (int x = 0; x < listProfessores.size(); x ++) {
            profAux = listProfessores.get(x);
            out += profAux.getDados() + '\n';
        }
        return out;
    }




}
