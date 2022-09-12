package giu28; // package: la "cartella" in cui si trova questo file

// public: questo è il modifier, definisce che la classe è accessibile anche dall'esterno del package
// class: dichiarazione che il file in questione è una classe
// camicia: nome della classe, che DEVE essere uguale al nome del file .java
public class Camicia {
    // campi, variabili globali che caratterizzano l'oggetto Camicia
    public int camiciaID = 0; // int: tipo numerico intero; camiciaID: nome del campo; 0: valore di default
    public String descrizione = "- descrizione richiesta -"; // String: tipo testuale; descrizione: nome del campo

    // codici dei colori: 'R' = red, 'B' = blu, 'G' = green, 'U' = unset (non definito)
    public char codiceColore = 'U'; // char: tipo carattere singolo

    public double prezzo = 0.0; // double: tipo numerico decimale, prezzo: nome del campo; 0.0: valore di default iniziale
    public int pezziInMagazzino = 0; // altro  tipo int
    // fine inserimento campi

    // public: modifier del metodo, per renderlo accessibile anche dall'esterno
    // void: tipo di ritorno, in questo caso il metodo non restituisce nulla
    // mostraInformazioni(): nome del metodo, seguito SEMPRE da una coppia di parentesi tonde
    public void mostraInformazioni() {
        // println() stampa il contenuto in parentesi e poi va a capo; print() stampa senza andare a capo
        System.out.println("ID della camicia: " + camiciaID);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Codice colore:" + codiceColore);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Quantita': " + pezziInMagazzino);
    } // fine del metodo

} // fine della classe

// System.out.print("Ciao sono \n Gaspare");
//
