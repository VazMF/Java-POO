package exercicios.Heranca;

public class ConsultaOuro extends Consulta{

    @Override
    public double getValorConsulta() {
        if (getAnoInclusao() <= 2000){
            return 0;
        }else{
            return super.getValorConsulta() - (super.getValorConsulta() * 30 / 100);
        }
    }
}
