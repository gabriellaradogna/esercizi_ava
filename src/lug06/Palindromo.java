package lug06;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args){

        // ricezione e salvataggio dell'input utente, preparazione del programma
        Scanner input = new Scanner(System.in);
        System.out.print("Scrivi la parola che vuoi verificare: ");
        String parola = input.next();
        /*
        Se acquisisco come input prima un valore numerico e poi una String
        int anniDiNascita = input.nextInt();
        String meseDiNascita = input.next();
        salvo nella String "l'invio" dell'input precedente, che essendo un numero, resta bloccato nella memoria di System.in
        risolvo inserendo tra i due input per salvare i dati, un input.next() "a vuoto"
        int annoDiNascita = input.nextInt();
        input.next();
        String meseDiNascita = input.next();
         */
        String alorap = "";

        // compongo la parola al contrario
        for (int lettera = parola.length()-1; lettera >= 0; lettera--) {
            alorap += parola.charAt(lettera); // "Mela" .charAt(2) restituisce l, il carattere di posizione 2
            // concateno ad alorap l'ultima lettera di parola,quindi sposto lettera verso l'inizio di parola e concateno nuovamente
        }

        // confronto la parola di input con lo String di alorap
        if (alorap.equals(parola)) { // confronto i valori delle stringhe, equals restituisce un boolean
            System.out.println("La parola immessa è palindroma");
        } else {
            System.out.println("La parola immessa non è palindroma");
        }
    }
}
