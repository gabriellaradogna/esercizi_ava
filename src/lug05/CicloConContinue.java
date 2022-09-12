package lug05;

public class CicloConContinue {

    public static void main(String[] args){
        int punteggioMin = 15;
        int superamentiRichiesti =3;
        int[] punteggi = {4,6,2,8,12,34,9};

        for(int punteggioSingolo : punteggi) {

            // se il punteggio dell'array è minore, non vado oltre ma resto nel for con l'iterazione successiva
            if(punteggioSingolo < punteggioMin) {
                continue; // il for passa all'elemento successivo dell'array
            }

            // se arrivi qui, punteggioMin superato
            superamentiRichiesti--; // valore decrementato se punteggi[i] >= 15
        }

        System.out.println("Superamenti mancanti: " + Math.max(0, superamentiRichiesti));
    }
}
