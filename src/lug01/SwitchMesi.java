package lug01;

public class SwitchMesi {
    public int mese;

    public void calcolaGiorni(int num) {
        mese = num;
        switch(mese){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Ci sono 31 giorni in questo mese");
                break; // ho trovato il mio mese, esco dllo switch

            case 2:
                System.out.println("Ci sono 28 giorni in questo mese");
                break; // ho trovato il mio mese, esco dallo switch

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Ci sono 30 giorni in questo mese");
                break;
            default: // per tutti gli altri valori di mese...
                System.out.println("Errore: Mese inserito non valido");
                break;
        }
    }
}
