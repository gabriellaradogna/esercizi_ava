package ESERCIZI.eser10SegniZodiacali;

public class SegniZodiacali {
    public int bdayDay;
    public int bdayMounth;

    public void calcoloSegniZodiacali() {
        String segnoValue = " ";

        if (bdayMounth == 1) {
            if (bdayDay <= 19) {
                segnoValue = "Capricorno";
            } else if (bdayDay >= 20 && bdayDay <= 31) {
                segnoValue = "Acquario";
            }
        } else if (bdayMounth == 2) {
            if (bdayDay <= 19) {
                segnoValue = "Acquario";
            } else if (bdayDay >= 20 && bdayDay <= 29) {
                segnoValue = "Pesci";
            }
        } else if (bdayMounth == 3) {
            if (bdayDay <= 20) {
                segnoValue = "Pesci";
            } else if (bdayDay >= 21 && bdayDay <= 31) {
                segnoValue = "Ariete";
            }
        } else if (bdayMounth == 4) {
            if (bdayDay <= 19) {
                segnoValue = "Ariete";
            } else if (bdayDay >= 20 && bdayDay <= 30) {
                segnoValue = "Toro";
            }
        } else if (bdayMounth == 5) {
            if (bdayDay >= 1 && bdayDay <= 20) {
                segnoValue = "Toro";
            } else if (bdayDay >= 21 && bdayDay <= 31) {
                segnoValue = "Gemelli";
            }
        } else if (bdayMounth == 6) {
            if (bdayDay <= 20) {
                segnoValue = "Gemelli";
            } else if (bdayDay >= 21 && bdayDay <= 30) {
                segnoValue = "Cancro";
            }
        } else if (bdayMounth == 7) {
            if (bdayDay <= 22) {
                segnoValue = "Cancro";
            } else if (bdayDay >= 23 && bdayDay <= 31) {
                segnoValue = "Leone";
            }
        } else if (bdayMounth == 8) {
            if (bdayDay <= 23) {
                segnoValue = "Leone";
            } else if (bdayDay >= 24 && bdayDay <= 31) {
                segnoValue = "Vergine";
            }
        } else if (bdayMounth == 9) {
            if (bdayDay >= 1 && bdayDay <= 22) {
                segnoValue = "Vergine";
            } else if (bdayDay >= 23 && bdayDay <= 30) {
                segnoValue = "Bilancia";
            }
        } else if (bdayMounth == 10) {
            if (bdayDay <= 22) {
                segnoValue = "Bilancia";
            } else if (bdayDay >= 23 && bdayDay <= 31) {
                segnoValue = "Scorpione";
            }
        } else if (bdayMounth == 11) {
            if (bdayDay <= 21) {
                segnoValue = "Scorpione";
            } else if (bdayDay >= 22 && bdayDay <= 30) {
                segnoValue = "Sagittario";
            }
        } else if (bdayMounth == 12) {
            if (bdayDay <= 21) {
                segnoValue = "Sagittario";
            } else if (bdayDay >= 22 && bdayDay <= 31) {
                segnoValue = "Capricorno";
            }
        } else {
            segnoValue = "Errore. I valori inseriti non sono validi";
        }

        System.out.println("Il tuo segno è: " + segnoValue);
    }
}
