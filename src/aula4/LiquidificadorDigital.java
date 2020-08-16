package aula4;

public class LiquidificadorDigital extends Liquidificador{

    public LiquidificadorDigital(int velocidadeMax){
        super(velocidadeMax);
    }

    public void trocarVelocidade(int velocidadeNova){
        if (velocidadeNova > 0){
            setVelocidade(velocidadeNova);
        }else{
            System.out.println("Não existe velocidade negativa.");
        }
    }
}
