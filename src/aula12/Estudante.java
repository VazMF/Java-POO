package aula12;

public class Estudante extends Pessoa{
    private String curso;

    public Estudante(String nome) {
        super(nome);
        this.curso = curso;
    }

    public String getDescricao() {
        return "É um estudante do curso: " + curso;
    }
}
