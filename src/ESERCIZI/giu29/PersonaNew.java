package ESERCIZI.giu29;

public class PersonaNew {
    int etaPersona;

    double temperaturaFahrenheit = 80.5;
    double temperaturaCelsius = ((temperaturaFahrenheit * 5 / 9) - 32);

    public void calcolaEta() {

        short giorniAnno = 365;
        short giorniVita = (short)(etaPersona * giorniAnno);
        int secondiInUnGiorno = 86400;
        int secondiVita = (giorniVita * secondiInUnGiorno);

        System.out.println("Gabriella oggi compie " + etaPersona + " anni");
        System.out.println("Gabriella è in vita da: " + giorniVita + " giorni");
        System.out.println("Gabriella è in vita da: " + secondiVita + " secondi");
    }

    public void calcolaTemperatura() {
        System.out.println("Una temperatura in Fahrenheit di: " + temperaturaFahrenheit + " equivale a: " +
                temperaturaCelsius + " Celsius");
    }
}