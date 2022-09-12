package ESERCIZI.giu29;

public class PersonaNewTest {
    public static void main(String[] args) {
        PersonaNew miaPersona = new PersonaNew();
        PersonaNew temperatura = new PersonaNew();
        miaPersona.etaPersona= Integer.parseInt(args[0]);
        miaPersona.calcolaEta();
        temperatura.calcolaTemperatura();
    }

}