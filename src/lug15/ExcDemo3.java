package lug15;

public class ExcDemo3 {

    public static void main(String[] args){
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        // due problemi da gestire: divisione per zero e inesistenza denom per gli ultimi due numer
        try{
            for(int i=0; i<numer.length; i++){

                try{
                    System.out.println(numer[i] + "/" + denom[i] + "=" + numer[i]/denom[i]);
                }catch (ArithmeticException exc){
                    System.out.println("Non puoi dividere " + numer[i] + " per zero!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Denominatore non presente -- Programma terminato!");
        }
    }
}
