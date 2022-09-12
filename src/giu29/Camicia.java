package giu29;

public class Camicia {
    // elenco e inizializzo le variabili d'istanza
    public int camiciaID = 0;
    public String descrizione = "- descrizione richiesta -";
    public char codiceColore = 'U'; // codici consentiti: 'R', 'B', 'G'
    public double prezzo = 0.0;
    public int pezziInMagazzino = 0;

    // metodo per stampare la scheda della camicia
    // parentesi tonde vuote perchè un metodo accede liberamente alle variabili d'istanza
    public void mostraInformazioni() {
        System.out.println("Quantita' di camicie " + camiciaID + " di colore " + codiceColore + " disponibili: " +
                pezziInMagazzino);
    }

}
