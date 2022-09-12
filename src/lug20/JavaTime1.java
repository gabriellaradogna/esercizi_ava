package lug20;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class JavaTime1 {

    public static void main(String[] args) {
        LocalDate dataLocale = LocalDate.of(2022, 7, 20); // passo all'istanza una data da formattare
        // ofPattern() specifica il modello di formazione della data
        // dd = giorno in due cifre, MM = mese in due cifre, yyyy = anno a quattro cifre
        // withLocale(Locale.ITALY) serve per la lettura dei dati dalle impostazioni del sistema
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.ITALY);
        System.out.println("Data formattata: " + dataLocale.format(formatter));
    }
}
