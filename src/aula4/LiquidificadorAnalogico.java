package aula4;

public class LiquidificadorAnalogico extends Liquidificador{

    public LiquidificadorAnalogico(int velocidadeMax){
        super(velocidadeMax);
    }

    public void aumentarVelocidade(){
        if ((getVelocidade() +1) <= getVelocidadeMax()){
            setVelocidade(getVelocidade() + 1);
        }else{
            System.out.println("O liquidificador já está na velocidade máxima!");
        }
    }

    public void diminuirVelocidade(){
        if ((getVelocidade() > 0)){
            setVelocidade(getVelocidade() - 1);
        }else{
            System.out.println("O liquidificador já está desligado.");
        }
    }
}
