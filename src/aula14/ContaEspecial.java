package aula14;

public class ContaEspecial extends Conta implements Tarifado {
    
    /*
     * inclua o atributo valorLimite
     * métodos get e set para valorLimite
     * 
     * implemente a tarifa da conta corrente é 12% do valor de referencia
    */

    private double limitValue;

    public double getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(double limitValue) {
        this.limitValue = limitValue;
    }

    public double getTarifa() {
        return valorReferencia * 12 / 100;
    }
}