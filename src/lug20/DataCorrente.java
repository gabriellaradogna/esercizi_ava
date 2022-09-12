package lug20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataCorrente {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        int giorno = calendar.get(Calendar.DAY_OF_MONTH); // DAY_OF_MONTH è static
        int mese = calendar.get(Calendar.MONTH); // idem
        int anno =  calendar.get(Calendar.YEAR); // idem
        System.out.println("Oggi e' il " + giorno + "/" + (mese+1) + "/" + anno); // MONTH conta da 0
    }
}
