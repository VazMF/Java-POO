package aula4;

public class Liquidificador {
    private int velocidade;
    private int velocidadeMax;

    public Liquidificador(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public void setVelocidade(int novaVelocidade){
        if (novaVelocidade <= velocidadeMax){
            this.velocidade = novaVelocidade;
        }else{
            System.out.println("A velocidade máxima permitida é " + velocidadeMax);
        }
    }

    public void setVelocidadeMax(int velocidadeMaxN){
        if (velocidadeMaxN > 0){
            this.velocidadeMax = velocidadeMaxN;
        }
        else {
            System.out.println("Erro. Digite um valor maior que zero!");
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

}
