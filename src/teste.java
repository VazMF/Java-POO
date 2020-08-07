import javax.crypto.spec.PSource;

public class teste{
    public static void main(String[] args) {

        int []a = {2,5,4,7};
        int []b = new int[4];

        for (int i=0; i < a.length; i++){
            if (a[i] % 2 == 0){
                b[i] = a[i];
            }
        }

        for (int y=0; y < b.length; y++){
            System.out.println(b[y]);
        }
    }
}
