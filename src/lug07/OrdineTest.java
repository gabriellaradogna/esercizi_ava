package lug07;

import javax.sound.midi.SysexMessage;

public class OrdineTest {

    public static void main(String[] args){
        Ordine ordine =  new Ordine(); // istanza di un ordine di acquisto (carrello dell'utente loggato)

        Camicia camicia1 = new Camicia(); // istanza primo modello di camicia da acquistare
        camicia1.camiciaID = 100;
        camicia1.descrizione = "Camicia sportiva";
        camicia1.codiceColore = 'G';
        camicia1.prezzo = 44.99;
        camicia1.quantita = 2;

        Camicia camicia2 = new Camicia(); // istanza secondo modello di camicia da acquistare
        camicia2.camiciaID = 144;
        camicia2.descrizione = "Camicia con taschini";
        camicia2.codiceColore = 'B';
        camicia2.prezzo = 30.15;
        camicia2.quantita = 3;

        Camicia camicia3 = new Camicia(); // istanza terzo modello di camicia da acquistare
        camicia3.camiciaID = 300;
        camicia3.descrizione = "Camicia di lino";
        camicia3.codiceColore = 'R';
        camicia3.prezzo = 64.00;
        camicia3.quantita = 1;

        int camicieTotali = camicia1.quantita + camicia2.quantita + camicia3.quantita;
        System.out.println("Stai acquistando " + camicieTotali + " camicie; per la precisione i modelli: ");
        camicia1.display();
        camicia2.display();
        camicia3.display();

        // faccio il totale per emettere lo scontrino; double è il tipo di ritorno di aggiungi camicia
        double costoTotale = ordine.aggiungiCamicia(camicia1) + ordine.aggiungiCamicia(camicia2) + ordine.aggiungiCamicia(camicia3);

        // stampo il totale da pagare
        System.out.println("Il costo totale della merce ammonta a " + costoTotale + " euro.");
    }
}
