package exercicios.Heranca;

public class ConsultaPrata extends Consulta{

    @Override
    public double getValorConsulta() {
        return super.getValorConsulta() - (super.getValorConsulta() * 20 / 100);
    }
}