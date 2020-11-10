package aula14;

public class ContaCorrente extends Conta implements Tarifado {
// implemente a tarifa da conta corrente é 12% do valor de referencia

    public double getTarifa() {
        return valorReferencia * 12 / 100;
    }
}