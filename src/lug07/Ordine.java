package lug07;

public class Ordine {
    private double prezzoTotale = 0.0; // prezzo totale dell'ordine, variabile d'istanza (private elimina l'accessibilità dall'esterno)

    public double aggiungiCamicia(Camicia camicia) { // camicia è una "camicia locale" per il metodo
        prezzoTotale = camicia.prezzo * camicia.quantita;
        return prezzoTotale;
    } // qui, in questo punto, la "camicia locale" smette di esistere

    // avendo reso private prezzoTotale, sono costretto ad accedere ad esso attraverso aggiungiCamicia() dove però
    // devo passargli un'istanza di Camicia. aggiungiCamicia() accede a prezzoTotale perchè si trovano nella stessa classe
}
