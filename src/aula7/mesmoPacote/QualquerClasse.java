package aula7.mesmoPacote;

import aula7.foraDoPacote.Gerente;

import java.util.ArrayList;

//qualquer classe no mesmo pacote
public class QualquerClasse {
    public static void main(String[] args) {
        Pessoa person = new Pessoa("Kaneshi");
        //System.out.println(person.name);

        ArrayList<Pessoa> listPers = new ArrayList<>();
        listPers.add(person);
        listPers.add(new Gerente("Fatima", 1000, 500));
        listPers.add(new Empregado("Geraldo", 4000));

        Pessoa auxPer;
        for (int i=0; i<listPers.size(); i++) {
            auxPer = listPers.get(i);
            auxPer.showData();
        }
    }
}
