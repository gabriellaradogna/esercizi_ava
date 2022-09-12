package lug15;

public class ExcDemo1 {

    public static void main(String[] args){
        int [] nums = new int[4]; // creo un array di int di dimensione 4

        // quello che è nel try viene svolto normalmente però permette di gestirne le eccezioni
        try {
            System.out.println("Prima che l'eccezione sia generata."); // breakpoint n°1 per capire

            nums[7] = 10; // Provoco un'eccezione di tipo ArrayIndexOutOfBoundsException (fuori range dell'array)
            System.out.println("Questo non verra' stampato"); // breakpoint n°2...
        } catch (ArrayIndexOutOfBoundsException exc){ // istanzio l'eccezione lanciata al rigo 11 da JVM, per gestirla
            System.out.println("Indice array fuori dai parametri!");
        }

        System.out.println("Dopo che il blocco try-catch è stato attraversato"); // breakpoint n°3
    }
}
