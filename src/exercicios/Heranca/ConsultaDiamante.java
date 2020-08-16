package exercicios.Heranca;

public class ConsultaDiamante extends Consulta{

    @Override
    public double getValorConsulta() {
        return super.getValorConsulta() - (super.getValorConsulta() * 40 / 100);
    }
}
