package ESERCIZI.lug04;

public class Vacanze {

    int anniDiServizio;
    int [] giorniVacanze;
    public void setVacanze() {
      giorniVacanze = new int[7];
      giorniVacanze[0] = 10;
      giorniVacanze[1] = 15;
      giorniVacanze[2] = 15;
      giorniVacanze[3] = 15;
      giorniVacanze[4] = 20;
      giorniVacanze[5] = 20;
      giorniVacanze[6] = 25;
    }
    public void mostraGiorniVacanze() {

        if(anniDiServizio>0 && anniDiServizio<=5) {
            System.out.println("Se gli anni di servizio sono: " + anniDiServizio + " , allora i giorni di ferie che ti spettano sono: " + giorniVacanze[anniDiServizio]);
        } else if (anniDiServizio > 5) {
            System.out.println("Se gli anni di servizio sono: " + anniDiServizio + " , allora i giorni di ferie che ti spettano sono: " + giorniVacanze[6]);
        } else {
            System.out.println("ERRORE!! Valore inserito non valido");
        }


    }
}
