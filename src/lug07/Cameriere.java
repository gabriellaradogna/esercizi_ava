package lug07;

public class Cameriere {

    public void comanda(String ord1, String ord2, String bev){
        System.out.println("Il cameriere porta " + bev + " al tavolo.");
        System.out.println("Il cameriere chiede al pizzaiolo " + ord1 + ", " + ord2);
        Pizzaiolo mioPizzaiolo = new Pizzaiolo();

        // comanda() cede il controllo del programma a cucina()
        mioPizzaiolo.cucina(ord1, ord2);

        // comanda() riprende il controllo del programma (dopo cucina)
        System.out.println("Il cameriere consenga " + ord1 + ", " + ord2 + " al tavolo");
    }
}
