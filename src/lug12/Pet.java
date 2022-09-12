package lug12;

import java.util.ArrayList;
import java.util.Scanner;

public class Pet {
    // array che riceveranno prodotti e relativi prezzi
    String[] prod;
    double[] prez;

    public double cassa(String[] prod, double[] prez){ // acquisisco i prodotti per cane o per gatto
        this.prod = prod;
        this.prez = prez;
        boolean ancora = true;
        double totaleParziale = 0.0;
        double totale = 0.0;
        String altri = "";
        Scanner input = new Scanner(System.in);
        ArrayList<String> Carrello; // uso un ArrayList non sapendo quanti articoli saranno acquistati
        Carrello = new ArrayList<>();

        do{
            System.out.print("Digita il codice del prodotto desiderato: ");
            int codice = input.nextInt()-1; // -1 in modo da sfruttare gli indici degli array

            switch (codice){ // l'utente ha digitato il codice ma nello switch arriva direttamente l'indice degli array
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    System.out.print("Digitare la quantità di " + prod[codice] + " desiderati: ");
                    int quanti = input.nextInt();
                    totaleParziale = prez[codice]*quanti;
                    totale += totaleParziale;
                    Carrello.add("Prodotto: " + prod[codice] + " Quantità: " + quanti + " - Prezzo: " + totaleParziale + " euro");
                    System.out.print("Desideri altri prodotti (S/N)? ");
                    altri = input.next().toUpperCase();
                    break;
                default:
                    System.out.println("Scusa, non ho capito...");
            }

            if (!altri.equals("S")) {  // se non digito S, non continuo gli acquisti per l'animale selezionato
                ancora = false;
            }

        } while (ancora);

        System.out.println();
        System.out.println("****** Articoli nel carrello ******");

        for (String lettore : Carrello){
            System.out.println(lettore);
        }

        return totale;
    }
}
