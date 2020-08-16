package exercicios.Heranca;

public class ConsultasFamilia extends Consulta{

    @Override
    public double getValorConsulta() {
        if (getNumDependentes() > 2){
            return super.getValorConsulta() - (super.getValorConsulta() * 50 / 100);
        }else{
            return super.getValorConsulta();
        }
    }
}
