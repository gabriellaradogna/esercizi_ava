package ESERCIZI.giu30;

import ESERCIZI.giu30.BancaJava;

public class BancaJavaTest {

    public static void main(String[] args) {
        BancaJava contoJava = new BancaJava();
        BancaJava depositoJava = new BancaJava();

        contoJava.versare(1000);
        contoJava.prelevare(500);
        contoJava.prelevare(150);
        contoJava.display();

        depositoJava.saldo= 1000;
        depositoJava.calcoloInteresse(10);
        depositoJava.display();
    }
}
