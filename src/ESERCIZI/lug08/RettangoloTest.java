package ESERCIZI.lug08;

import ESERCIZI.lug08.Rettangolo;

public class RettangoloTest {

    public static void main(String[] args){
        Rettangolo myRettangolo1 = new Rettangolo();
        myRettangolo1.dimensioni(7,2);
        myRettangolo1.area();
        myRettangolo1.disegno();
        System.out.println();

        Rettangolo myRettangolo2 = new Rettangolo(5,3);
    }
}
