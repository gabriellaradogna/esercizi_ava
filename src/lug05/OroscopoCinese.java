package lug05;

import java.util.Scanner;

public class OroscopoCinese {

    public static void main(String[] args) {
        // nell'oroscopo cinese ogni segno si ripete ogni 12 anni
        // mi servono un array con i segni e un array con gli anni in cui cade un certo segno
        int[] anni = {1936, 1948, 1960, 1972, 1984, 1996, 2008}; // anni del Topo
        String[] segni = {"Topo", "Bufalo", "Tigre", "Coniglio", "Drago", "Serpente", "Cavallo", "Capra", "Scimmia", "Gallo", "Cane",
        "Maiale"}; // i segni dell'oroscopo cinese
        String intro = "Il tuo segno cinese e': ";
        Scanner input = new Scanner(System.in); // istanza di Scanner per ricevere input da riga di comando
        System.out.print("Digita e invia il tuo anno di nascita "); // invito l'utente a immettere l'anno di nascita
        int base = input.nextInt(); // riceviamo una String e la convertiamo nel tipo con cui salvare il valore

        ciclo : for(int indexSegno = 0; indexSegno < segni.length; indexSegno++) { // scansiono array dei segni

            for(int indexAnno = 0; indexAnno < anni.length; indexAnno++) {

                // sfrutto i due contatori index pr intercetare l'anno immesso dall'utente
                if(base == anni[indexAnno] + indexSegno){
                    System.out.println(intro + segni[indexSegno]);
                    break ciclo; // blocco il ciclo esterno "a distanza" tramite la sua etichetta "ciclo:"
                }
            }
        }
    }
}
