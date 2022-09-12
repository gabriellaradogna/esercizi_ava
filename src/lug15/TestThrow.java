package lug15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestThrow {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int den;
        try{
            System.out.print("Inserisci il numeratore (intero): ");
            num = input.nextInt();
            System.out.print("Inserisci il denominatore (intero): ");
            den = input.nextInt();
            System.out.println("La radice della divisione è " + DivisioneRadice.div(num, den));
        } catch (InputMismatchException e){
            System.out.println("Il valore immesso non è corretto!");
        } catch (Exception e){
            System.out.println(e.getMessage()); // getMessage() recupera la String argomento dell'eccezione generatasi
        }
        finally {
            System.out.println("Grazie per aver utilizzato il mio programma :)");
        }
    }
}
