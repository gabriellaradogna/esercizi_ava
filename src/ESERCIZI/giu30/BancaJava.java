package ESERCIZI.giu30;

public class BancaJava {
    public double saldo = 0.0;

    public void versare(double versamento) {

        saldo = saldo + versamento;
    }
    public void prelevare(double prelievo) {

        saldo = saldo - prelievo;
    }
    public void calcoloInteresse(int interesse) {

        saldo = (saldo + (saldo * interesse / 100));
    }
    public void display() {
        System.out.println("Il tuo saldo rimanente è: " + saldo + " €");
    }
}
