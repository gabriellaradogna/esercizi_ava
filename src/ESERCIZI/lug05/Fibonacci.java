package ESERCIZI.lug05;

public class Fibonacci {

    public static void mostraSequenza(){
        int x = 0;
        int y = 1;
        int z = 1;
        System.out.print(x + " ");
        System.out.print(y + " ");
        
        while (z<=100){
            System.out.print(z + " ");
            x = y;
            y = z;
            z= x+y;
        }
    }
}
