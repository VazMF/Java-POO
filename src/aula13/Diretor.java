package aula13;

public class Diretor extends Funcionario implements Acesso{
    private String senha;

    @Override
    public double getBonificacao() {
        return salario * 0.5;
    }

    public boolean isLiberado(String senha) {
        if (this.senha.equals(senha)) {
            return true;
        } else {
            return false;
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
