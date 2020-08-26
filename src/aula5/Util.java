package aula5;

public class Util {
    public static double getImc(double peso, double altura){
        return peso / (altura * altura);
    }

    public static double getSoma(double numeros[]){
        double soma = 0;
        for (int i=0; i < numeros.length; i++){
            soma += numeros[i];
        }
        return soma;
    }

    public static double getMedia(double num1, double num2){
        return (num1 + num2) / 2;
    }
}
