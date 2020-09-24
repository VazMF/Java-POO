package aula7.mesmoPacote;
//mesma classe
public class Pessoa {
    private String name;

    public Pessoa(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showData() {
        System.out.println("Nome: " + name);
    }
}
