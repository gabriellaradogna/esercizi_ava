package lug07;

public class Pizzaiolo {

    // metodo che accetta due String come da invocazione in comanda()
    public void cucina(String pizza1, String pizza2) {
        System.out.println("Il pizzaiolo prepara e inforna " + pizza1 + ", " + pizza2);
        System.out.println("Il pizzaiolo preleva le pizze e chiama il cameriere");
        // cucina() restituisce il controllo del programma a comanda()
    }
}
