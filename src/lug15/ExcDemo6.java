package lug15;

public class ExcDemo6 {
    public static void main(String[] args) {

        try{
            Rethrow.genException(); // il metodo è static, non devo fare istanza di Rethrow, caller chiama worker
        } // il main() riprende il controllo del programma ricevendo un ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Errore -- Programma terminato!"); // ri-acchiappo il catch rilanciato dal worker
            //throw è una keyword per lanciare eccezioni volutamente
        }
    }
}
