package lug08;

public class Camicia {
    private int camiciaID = 0;
    private String descrizione = "-richiesta-";
    private char codiceColore = 'U';
    private int disponibili = 0;  // disponibilità in magazzino
    private int quantita = 0; // pezzi acquistati
    private double prezzo = 0.0;

    public void display(){
        System.out.println("Identificativo camicia: " + getCamiciaID());
        System.out.println("Descrizione: " + getDescrizione());
        System.out.println("Codice colore: " + getCodiceColore());
        System.out.println("Pezzi in magazzino: " + getDisponibili());
        System.out.println("Pezzi acquistati: " + getQuantita());
        System.out.println("Prezzo unitario: " + getPrezzo());
    }

    // INIZIO INCAPSULAMENTO
    public void setCamiciaID(int camiciaID) {

        if (camiciaID <= 0) {
            System.out.println("L'ID di una camicia deve essere positivo.");
            System.out.println("Verrà assegnato un ID standard da sostituire.");
            this.camiciaID = 9999; // valore che segnala il doverlo aggiornare in altra sede
        } else {
            this.camiciaID = camiciaID; // assegno il valore dell'argomento del metodo al campo privato omonimo
        }
    }

    public int getCamiciaID() {
        return camiciaID; // non occorrebbe this perchè non c'è una variabile locale omonima
    }

    public void setDescrizione(String descrizione){

        if(descrizione.length() < 10) {
            System.out.println("Descrizione troppo breve.");
            System.out.println("Verra' stampato 'Non disponibile'.");
            this.descrizione = "Non disponibile.";
        } else {
            this.descrizione = descrizione; // assegno il valore dell'argomento del metodo al campo private omonimo
        }
    }

    public String getDescrizione(){
        return descrizione;
    }

    public void setCodiceColore(char codiceColore) {

        switch (codiceColore) { // controllo se il codice del colore è tra quelli consentiti
            case 'R': // camicia rossa
            case 'B': // camicia blu
            case 'G': // camicia verde
                this.codiceColore = codiceColore;
                break;
            default: // tutti gli altri colori immessi
                System.out.println("Il codice colore immesso non e' accettato;");
                System.out.println("Verrà impostato un codice 'X' di errore.");
                this.codiceColore= 'X';
                break;
        }
    }

    public char getCodiceColore() {
        return codiceColore;
    }

    public void setDisponibili(int disponibili){

        if (disponibili <= 0) {
            System.out.println("Prodotto non disponibile.");
        }

        if (disponibili >= 0) {
            this.disponibili = disponibili;
        }
    }

    public int getDisponibili() {
        return disponibili;
    }

    public void setQuantita(int quantita){

        if (quantita <= 0) {
            System.out.println("Non è possibile ordinare meno di un pezzo per articolo");
        } else if (quantita < this.disponibili) { // sto ordinando meno di quanti articoli sono disponibili?
            this.quantita = quantita;
        } else {
            System.out.println("Non è possibile ordinare più articoli di quanti disponibili;");
            System.out.println("Verranno aggiunti al carrello tutti gli articoli disponibili.");
            this.quantita = this.disponibili;
        }
    }

    public int getQuantita() {
        return quantita;
    }

    public void setPrezzo(double prezzo){

        if(prezzo <= 0) {
            System.out.println("Non puo' esserci un prezzo nullo o negativo;");
            System.out.println("Verra' impostato un prezzo standard di 10.00 euro.");
            this.prezzo = 10.00;
        } else {
            this.prezzo = prezzo;
        }
    }

    public double getPrezzo() {
        return prezzo;
    }

    // FINE INCAPSULAMENTO
}
