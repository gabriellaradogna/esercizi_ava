package ESERCIZI.eserc11Edicola;


public class Edicola {

    double[] prezzoPubblicazione = {1.50, 1.75, 2.00, 1.80, 1.60};
    double[] aggioPubblicazione = {0.20, 0.35, 0.30, 0.20, 0.25};
    private int copieRicevute = 0;
    private int copieVendute = 0;
    public double guadagnoGiornaliero = 0.0;


    public void setCopieRicevute(int copieRicevute){
        if (copieRicevute < 0){
            System.out.println("Non puo' esserci un valore negativo;");
            System.out.println("Verra' impostato un numero standard di 0");
            this.copieRicevute = 0;
        } else if (copieRicevute == 0){
            System.out.println("In data odierna non sono state consegnate dal fornitore.");
            this.copieRicevute = 0;
        } else {
            this.copieRicevute = copieRicevute;
        }
    }
    public int getCopieRicevute(){
        return copieRicevute;
    }
    public void setCopieVendute(int copieVendute){
        if (copieVendute < 0){
            System.out.println("Non puo' esserci un valore negativo;");
            System.out.println("Verra' impostato un numero standard di 0");
            this.copieVendute = 0;
        } else if(copieVendute == 0){
            System.out.println("In data odierna non sono state vendute copie di questo giornale.");
            this.copieVendute = 0;
        } else if(copieVendute>copieRicevute){
            System.out.println("Il valore appena inserito non è possibile");
            System.out.println("Verra' impostato un valore pari al numero di copie ricevute dal fornitore");
            this.copieVendute = copieRicevute;
        }
        else {
            this.copieVendute = copieVendute;
        }
    }
    public int getCopieVendute(){
        return copieVendute;
    }


    public void display(int i){
            System.out.println("Prezzo di vendita è: " + prezzoPubblicazione[i] + "        -- Valore di aggio e: " + aggioPubblicazione[i]);
            System.out.println("Numero di copie ricevute: " + getCopieRicevute() + "     --Numero di copie vendute è: " + getCopieVendute());
            System.out.println("Numero di copie da rendere al fornitore di zona è: " + (getCopieRicevute()-getCopieVendute()));
            System.out.println();
            guadagnoGiornaliero += getCopieVendute()*aggioPubblicazione[i];
            if (i == 4) {
                System.out.println();
                System.out.println("        ----------------------------------------------------------");
                System.out.println("              --------- Il guadagno totale è: " + guadagnoGiornaliero + " ---------");
            }
    }

}
