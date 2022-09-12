package ESERCIZI.lug07;

public class Cellulare {

    double creditoDisponibile = 0;
    int chiamateEffettuate = 0;

    public void credito(double creditoIniziale){
        creditoDisponibile += creditoIniziale;
    }
    public void ricarica(double ricarica){
        creditoDisponibile+= ricarica;
    }

    public void numeroChiamate(){
        chiamateEffettuate++;
        System.out.println("A seguito della " + chiamateEffettuate + " chiamata effettuata,");
    }
    public void chiamate(int minutiDiChiamata){
        double tariffa = 0.20;
        double costoChiamata = tariffa*minutiDiChiamata;
        creditoDisponibile -= costoChiamata;
        System.out.println("il suo credito disponibile è di: " + creditoDisponibile + " €");
    }

    public void azzeroNumeroChiamate(){
        chiamateEffettuate--;
        System.out.println("Al momento il numero di chiamate effettuate è: " + chiamateEffettuate);
    }
}
