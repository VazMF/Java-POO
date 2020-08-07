package aula2;

public class Teste {
    public static void main(String[] args) {
        //class ref.obj  constru
        Aluno aluno = new Aluno("Antônio");

        aluno.setNome("Antônio");
        aluno.setEndereco("Rua Goias, 1202");
        aluno.setMatricula(12087);

        double []n = new double[4];
        for (int i=0; i < n.length; i++){
            n[i] = 1 + (int)(Math.random() * 10);
            System.out.println(n[i]);
        }
        aluno.setNotas(n);

        double []novo = aluno.getNotas();
        for (int i =0; i<novo.length; i++){
            System.out.println("Notas: " + novo[i]);
        }

        Professor prof = new Professor("Edson");
        prof.setNome("Edson");

        System.out.println("Num. Matricula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Endereço: " + aluno.getEndereco());
    }
}
