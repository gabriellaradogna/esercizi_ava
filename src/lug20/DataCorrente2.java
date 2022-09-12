package lug20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DataCorrente2 {

    public static void main(String[] args) {
        LocalDate d = LocalDate.now(); // istanza per invocare i ChronoField
        // ChronoField è la classe di java.time contenente tutti i campi ove salvare dati temporali
        //int giorno = d.get(ChronoField.DAY_OF_MONTH); // DAY_OF_MONTH giorno del mese static per java.time
        //int mese = d.get(ChronoField.MONTH_OF_YEAR); // MONTH_OF_YEAR mese dell'anno static per java.time (parte da 1!)
        //int anno = d.get(ChronoField.YEAR); // YEAR static per java.time
        //LocalDate dataLocale = LocalDate.of(anno, mese, giorno);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data odierna con java.time: " + d.format(formatter));
        //System.out.println("Data odierna con Chronofield: " + dataLocale.format(formatter));
    }
}
