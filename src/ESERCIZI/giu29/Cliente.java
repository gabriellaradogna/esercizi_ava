package ESERCIZI.giu29;

public class Cliente {

    public int mioCliente = 4495;
    public boolean newCliente = false;
    public double prezzo = 56.99;

    public void displayInfoCliente(){
        System.out.println("Il codice del cliente è: " + mioCliente);
        System.out.println("Il cliente è un nuovo iscritto?");
        if (newCliente == false) {
            System.out.println(" NO ");
        } else {
            System.out.println(" SI ");
        }
        System.out.println("L'importo totale degli acquisti è di: € " + prezzo);
    }
}
