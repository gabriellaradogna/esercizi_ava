package lug07;

public class ClienteTest {

    public static void main(String[] args) {
        String ordinazioneEmiliano = "Pizza Capricciosa";
        String ordinazioneSimone = "Pizza con bufala";
        String bevanda = "Vino";
        System.out.println("I clienti elencano le ordinazioni al cameriere: " + ordinazioneEmiliano + ", " + ordinazioneSimone +
                ", " + bevanda);
        Cameriere mioCameriere = new Cameriere();

        //il main() cede il controllo del programma a comanda()
        mioCameriere.comanda(ordinazioneEmiliano, ordinazioneSimone, bevanda);

        // il main() riprende il controllo del programma
        System.out.println("I clienti mangiano quanto ordinato.");
    }
}
