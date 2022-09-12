package ESERCIZI.lug07;

import ESERCIZI.lug07.Cellulare;

public class CellulareTest {

    public static void main(String[] args){
        Cellulare mioCellulare = new Cellulare();
        double creditoIniziale = 20.00;
        mioCellulare.credito(creditoIniziale);
        double ricarica = 10.00;
        mioCellulare.ricarica(ricarica);
        int minutiDiChiamata = 15;
        mioCellulare.numeroChiamate();
        mioCellulare.chiamate(minutiDiChiamata);
        mioCellulare.azzeroNumeroChiamate();
    }
}
