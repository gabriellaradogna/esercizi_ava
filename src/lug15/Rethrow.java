package lug15;

public class Rethrow {

    public static void genException() { // metodo che genererà delle eccezioni
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for(int i=0; i<numer.length; i++){

            try{
                System.out.println(numer[i] + "/" + denom[i] + "=" + numer[i] / denom[i]);
            } catch (ArithmeticException exc){
                System.out.println("Non puoi dividere " + numer[i] + " per zero!");
            } catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("Denominatore non presente!");
                throw exc; // rimando l'eccezione al caller (main()), e quindi non ne completo la gestione
            }
        }
    }
}
