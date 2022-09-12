package ESERCIZI.lug01;

public class DateTwo {

    //int dayNumber;

    public void displayDay(int dayNumber) {
        String dayValue = " ";

        if(dayNumber == 1) {
            dayValue = "Lunedi'";
        } else if(dayNumber == 2) {
            dayValue = "Martedi'";
        } else if(dayNumber == 3) {
            dayValue = "Mercoledi'";
        } else if(dayNumber == 4) {
            dayValue = "Giovedi'";
        } else if(dayNumber == 5) {
            dayValue = "Venerdi'";
        } else if(dayNumber == 6) {
            dayValue = "Sabato";
        } else if(dayNumber == 7) {
            dayValue = "Domenica";
        } else {
            dayValue = "Inesistente. Valore inserito non valido.";
        }

        System.out.println("Il giorno della settimana è: " + dayValue);
    }
}
