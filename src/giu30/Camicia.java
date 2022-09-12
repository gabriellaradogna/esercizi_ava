package giu30;

import javax.sound.midi.SysexMessage;

public class Camicia {

    public int camiciaID = 0;
    public String descrizione = "-descrizione richiesta-";
    /* String dichiarata come oggetto, sintassi chesi può evitare di usare
    public String descrizione;
    descrizione = new String();
    descrizione = "-descrizione richiesta-"
     */
    public char codiceColore = 'U';
    public double prezzo = 0.0;

    public void display() {
        System.out.println("ID della camicia: " + camiciaID);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Codice colore: " + codiceColore);
        System.out.println("Prezzo " + prezzo + " €");
    }
}
