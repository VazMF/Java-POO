package aula3;

public class Principal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Edson", 1000);
        Gerente gerente = new Gerente("José", 5000, 500);

        System.out.println("Nome do gerente: " + gerente.getNome());
        System.out.println("Salário do gerente: " + gerente.getSalario());

        System.out.println("Nome do empregado: " + empregado.getNome());
        System.out.println("Salário do empregado: " + empregado.getSalario());
    }
}
