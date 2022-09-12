package lug20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class OraCorrente {

    public static void main(String[] args) {

        // Gregorian Calendar è sottoclasse di Calendar
        Calendar calendar = new GregorianCalendar();
        String orario;
        int ore = calendar.get(Calendar.HOUR); // HOUR è un campo static
        int minuti = calendar.get(Calendar.MINUTE); // idem
        int secondi = calendar.get(Calendar.SECOND); // idem

        if (calendar.get(Calendar.AM_PM) == 0) {
            orario = "A.M."; // AM_PM vale 0 la mattina
        } else { // AM_PM in alternativa può valere 1, per il pomeriggio
            orario = "P.M.";
        }
        System.out.println("Sono le " + ore + ":" + minuti + ":" + secondi + " " + orario);
    }
}
