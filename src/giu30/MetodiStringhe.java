package giu30;

public class MetodiStringhe {
    public static void main(String[] args) {
        String greet = " HOW ".trim(); // rimuovo gli spazi a inizio e fine stringa
        System.out.println(greet);
        String minuscolo = greet + "DY".toLowerCase(); // rendo in minuscono DY
        System.out.println(minuscolo);
        String laStringa = "Hello World";
        String laStringaParziale = laStringa.substring(6); // l'argomento di substring deve essere un int (taglia i primi 6 caratteri considerando che W è in posizione 0)
        System.out.println(laStringaParziale);
        boolean ePresente =  laStringa.endsWith("World"); // endsWith() restituisce un boolean
        System.out.println(ePresente);
    }
}
