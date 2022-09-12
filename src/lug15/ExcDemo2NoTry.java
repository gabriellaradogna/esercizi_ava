package lug15;

public class ExcDemo2NoTry {

    public static void main(String[] args){
        int[] numer = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i=0; i< numer.length; i++){
            System.out.println(numer[i] + "/" + denom[i] + "=" + numer[i]/denom[i]);
        }
    }
}
