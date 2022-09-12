package lug07;

public class Camicia {
    public int camiciaID = 0; //( se avessi messo public static int avri avuto una variabile che non poteva avere più di un valore, quindi quando
                              // in OrdineTest dichiaro nuovi valore, l'ultimo inserito avrebbe sovrascritto il precedente)
    public String descrizione = "-richiesta-";
    public char codiceColore = 'U';
    public double prezzo = 0.0;
    public int quantita = 0;

    public void display(){
        System.out.println("ID camicia: " + camiciaID);
        System.out.println("Descrizione: " +  descrizione);
        System.out.println("Codice colore: " + codiceColore);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Quantita' ordinata: " + quantita);
        System.out.println();
    }
}
