package aula6;

public class Operacao {
    public int soma(int n1, int n2){
        return n1 + n2;
    }

    public int soma(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public double soma(double n1, double n2){
        return n1 + n2;
    }

    public double soma(double n1, double n2, double n3){
        return this.soma(n1,n2) + n3;
    }

    public int soma(int[] num){
        int s = 0;
        for (int i=0; i < num.length; i++){
            s += num[i];
        }
        return s;
    }

    public int maiorNum(int n1, int n2){
        if (n1 > n2){
            return n1;
        }else{
            return n2;
        }
    }

    public int maiorNum(int n1, int n2, int n3){
        if (n1 > n2 && n1 > n3){
            return n1;
        }
        else if(n2 > n1 && n2 > n3){
            return n2;
        }else{
            return n3;
        }
    }
}
