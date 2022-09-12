package lug08;

import java.util.Scanner;

public class CamiciaCTest {

    public static void main(String[] args){
        CamiciaC miaCamicia = new CamiciaC(
                2022,
                "camicia sportiva",
                'P',
                33,
                5,
                35.15);

        miaCamicia.display(); // display invoca i metodi get per restituire i campi private di Camicia.java

        System.out.println("HO acquistato " + miaCamicia.getQuantita() + " camicie, al prezzo di " + miaCamicia.getPrezzo() +
                " l'una.");
    }
}
