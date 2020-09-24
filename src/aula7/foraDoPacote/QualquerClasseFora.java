package aula7.foraDoPacote;
//qualquer classe fora do pacote
import aula7.mesmoPacote.Empregado;
import aula7.mesmoPacote.Pessoa;

import java.util.ArrayList;

public class QualquerClasseFora {
    public static void main(String[] args) {
        Pessoa person = new Pessoa("Edson");
        //System.out.println(person.name);

        ArrayList<Empregado> listEmp = new ArrayList<>();
        listEmp.add(new Gerente("Edson", 1000, 500));
        listEmp.add(new Empregado("Fatima", 5000));
        listEmp.add(new Empregado("Geraldo", 4000));

        Empregado auxEmp;
        for (int i=0; i<listEmp.size(); i++) {
            auxEmp = listEmp.get(i);
            System.out.println("Nome: " + auxEmp.getName() + " salário: " + auxEmp.getSalary());
        }
    }

}
