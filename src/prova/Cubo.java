package prova;

public class Cubo extends Figura implements Superficie, Volume {
    private double aresta;

    public Cubo(String name) {
        super(name);
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calculateArea() {
        return (aresta * aresta) * 6;
    }

    @Override
    public double calculateVolume() {
        return aresta * aresta * aresta;
    }
}
