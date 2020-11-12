package prova;

public class Quadrado extends Figura implements Superficie {
    private double side;

    public Quadrado(String name) {
        super(name);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
