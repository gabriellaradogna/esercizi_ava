package lug20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaTime2 {

    public static void main(String[] args) {
        LocalDate dataLocale = LocalDate.of(2022, 7, 20);
        // in questo caso definisco il modello di stampa in base alla localizzazione geografica (ITALY)
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALY);
        System.out.println("Data con formattazione FULL: " + dataLocale.format(formatter));
    }
}
