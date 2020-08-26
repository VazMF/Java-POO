package aula5;

public class PrincipalEstatico {
    public static void main(String[] args) {

        double[] valores = {10, 20, 30};
        System.out.println(TesteEstatico.idEstatico);

        //id
        TesteEstatico t1 = new TesteEstatico();
        t1.setId(10);
        System.out.println("Id Estático: " + TesteEstatico.idEstatico);
        System.out.println("id: " + t1.getId());

        TesteEstatico t2 = new TesteEstatico();
        t2.setId(20);
        t2.setIdEstatico(55);
        System.out.println("Id Estático: " + TesteEstatico.getIdEstatico());
        System.out.println("id: " + t2.getId());

        //PI
        System.out.println(TesteEstatico.PI * 2);

        //IMC
        System.out.println(Util.getImc(53, 1.65));

        //soma e media
        System.out.println("Soma dos valores de um Array: " + Util.getSoma(valores));

        System.out.println("Média das notas: " + Util.getMedia(9.5, 10.0));
    }
}
