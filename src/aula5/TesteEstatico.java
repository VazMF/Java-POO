package aula5;

public class TesteEstatico {
    private int id;
    public static int idEstatico = 2;

    public static final double PI = 3.14;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdEstatico() {
        return idEstatico;
    }

    public void setIdEstatico(int idEstatico) {
        this.idEstatico = idEstatico;
    }

}
