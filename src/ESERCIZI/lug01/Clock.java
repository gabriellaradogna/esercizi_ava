package ESERCIZI.lug01;

public class Clock {

    public void displayPartOfDay(short currentTime) {
        if((currentTime >= 701 && currentTime <= 759)
                || (currentTime >= 800 && currentTime <= 859)
                || (currentTime >= 900 && currentTime <= 959)
                || (currentTime >= 1000 && currentTime <= 1059)
                || (currentTime >= 1100 && currentTime <= 1159)
                || (currentTime == 1200)) {
            System.out.println("Il periodo è: Mattina");
        } else if((currentTime >= 1201 && currentTime <= 1259)
                || (currentTime >= 1300 && currentTime <= 1359)
                || (currentTime >= 1400 && currentTime <= 1459)
                || (currentTime >= 1500 && currentTime <= 1559)
                || (currentTime >= 1600 && currentTime <= 1659)
                || (currentTime == 1700)) {
            System.out.println("Il periodo è: Pomeriggio");
        } else if((currentTime >= 1701 && currentTime <= 1759)
                || (currentTime >= 1800 && currentTime <= 1859)
                || (currentTime >= 1900 && currentTime <= 1959)
                || (currentTime >= 2000 && currentTime <= 2059)
                || (currentTime >= 2100 && currentTime <= 2159)
                || (currentTime >= 2200 && currentTime <= 2259)
                || (currentTime == 2300)) {
            System.out.println("Il periodo è: Sera");
        } else if((currentTime >= 2301 && currentTime <= 2359)
                || (currentTime >= 0 && currentTime <= 59)
                || (currentTime >= 100 && currentTime <= 159)
                || (currentTime >= 200 && currentTime <= 259)
                || (currentTime >= 300 && currentTime <= 359)
                || (currentTime >= 400 && currentTime <= 459)
                || (currentTime >= 500 && currentTime <= 559)
                || (currentTime >= 600 && currentTime <= 659)
                || (currentTime == 700)) {
            System.out.println("Il periodo è: Notte");
        } else {
            System.out.println("Errore! Non hai inserito un orario valido!");
        }
    }
}
