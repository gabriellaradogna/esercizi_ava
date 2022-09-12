package lug05;

public class Capitale {

    public static void main(String[] args) {
        double capitaleIniziale = Double.parseDouble(args[0]);
        double tassoInteresse = Double.parseDouble(args[1]);
        int anni = 0; // inizializzo il numero di anni necessari
        double capitaleAttuale = capitaleIniziale; // io voglio capire in quanti anni il capitale iniziale raddoppia

        while(capitaleAttuale <= 2*capitaleIniziale) {
            capitaleAttuale += capitaleAttuale*tassoInteresse/100; // applico il capitale semplice al capitale attuale
            anni++;
            System.out.println("All'anno " + anni + " il capitale ammonta a " + capitaleAttuale);
        }
    }
}
