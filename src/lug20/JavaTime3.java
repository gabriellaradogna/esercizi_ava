package lug20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class JavaTime3 {

    public static void main(String[] args) {
        LocalDate dataLocale = LocalDate.of(2022, 7, 20);
        LocalTime oraLocale = LocalTime.of(10, 55, 13);
        LocalDateTime localDateTime = LocalDateTime.of(dataLocale, oraLocale); // unisco le istanze di data e ora
        ZoneId europa = ZoneId.of("Europe/Rome"); // localizzazione geografica
        // hh = ora a due cifre, mm = minuti a due cifre, ss = secondi a due cifre
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss").withZone(europa).withLocale(Locale.ITALY);
        System.out.println("Data e ora formattate: " + localDateTime.format(formatter));
    }
}
