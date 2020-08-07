package av_diagnostica;
//fazer o teste de mesa da questão 9 da av diagnóstica
public class questao9 {
    public static void main(String[] args) {

        int []a = {2,4,8,8,10};
        int []b = {1,2,2,4,5};
        int []c = new int[5];                   //c=
                                                //i=0
        int x = 0;                              //j=0
        boolean igual;                          //k=0
                                                //x=0
        for (int i=0;i < a.length; i++){
            igual = false;
            for (int j=0;j < b.length; j++){
                if (a[i] == b[j]){
                    igual = true;
                    break;
                }
            }
            if (igual == false){
                for (int k=0; k < c.length; k++){
                    if (c[k] == a[i]){
                        igual = true;
                        break;
                    }
                }
                if (igual == false){
                    c[x] = a[i];
                    x++;
                }
            }
        }
        for (int y=0; y < c.length; y++){
            System.out.println(c[y]);
        }

    }
}
