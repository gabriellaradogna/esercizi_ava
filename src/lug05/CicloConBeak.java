package lug05;

public class CicloConBeak {

    public static void main(String[] args) {
        int punteggioMin = 12;
        boolean superato = false;
        int[] punteggi = {4, 6, 2, 8, 12, 34, 9};

        // il for avanzato è un ciclo dalla sintassi semplice creato per scansionare array, ArrayList e liste in genere
        // nel caso in esame, lo uso per scansionare l'array punteggi
        // ATTENZIONE! il contatore punteggioSingolo NON E' la posizione degli elementi nell'array, ma gli elementi stessi!
        for (int punteggioSingolo : punteggi) { // i : inviano punteggioSingolo a entrare nell'array punteggi

            if(punteggioSingolo > punteggioMin) {
                superato = true; // avviene con 34
                break; // trovato un punteggio maggiore di quello minimo, esco dal ciclo interrompendolo
            }

        }

        System.out.print("Il valore e' stato superato almeno una volta? ");

        if (superato) {
            System.out.println("Si'");
        } else {
            System.out.println("No");
        }

    }
}
