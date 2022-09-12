package ESERCIZI.giu29;

public class Persona {

    int etaPersona = 27;
    short giorniAnno = 365;
    byte anniBisestili = (byte)(etaPersona/4);
    short giorniVita = (short)((etaPersona * giorniAnno) + anniBisestili);
    int secondiInUnGiorno = 86400;
    int secondiVita = (giorniVita * secondiInUnGiorno);

    double temperaturaFahrenheit = 80.5;
    double temperaturaCelsius = ((temperaturaFahrenheit * 5 / 9) - 32);
    public void calcolaEta(){
        System.out.println("Gabriella oggi compie " + etaPersona + " anni");
        System.out.println("Gabriella è in vita da: " + giorniVita + " giorni");
        System.out.println("Gabriella è in vita da: " + secondiVita + " secondi");

        System.out.println("Una temperatura in Fahrenheit di: " + temperaturaFahrenheit + " equivale a: " +
                temperaturaCelsius + " Celsius");
    }
}
