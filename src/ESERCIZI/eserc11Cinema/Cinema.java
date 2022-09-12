package ESERCIZI.eserc11Cinema;

import java.util.ArrayList;

public class Cinema {
    int numeroBiglietti;
    public void generatorePosti() {
        ArrayList numeroPosto1;
        numeroPosto1 = new ArrayList<Integer>();
        ArrayList numeroPosto2;
        numeroPosto2 = new ArrayList<Integer>();
        ArrayList numeroPosto3;
        numeroPosto3 = new ArrayList<Integer>();
        int i = 0;
        while(i < numeroBiglietti) {
            int posto = (int)(Math.floor(Math.random() * 100 + 1));
            if(i%3 == 0) {
                if (numeroPosto1.indexOf(posto) < 0) {
                    numeroPosto1.add(posto);
                    i++;
                }
            } else if(i%3 == 1) {
                posto += 100;
                if (numeroPosto2.indexOf(posto) < 0) {
                    numeroPosto2.add(posto);
                    i++;
                }
            } else {
                posto += 200;
                if (numeroPosto3.indexOf(posto) < 0) {
                    numeroPosto3.add(posto);
                    i++;
                }
            }
        }

        System.out.println("Il numero di posti occupati nella sezione 1 sono: " + numeroPosto1.size());
        System.out.println("Il numero di posti occupati nella sezione 2 sono: " + numeroPosto2.size());
        System.out.println("Il numero di posti occupati nella sezione 3 sono: " + numeroPosto3.size());
        System.out.print("In totale, nella sala, sono stati occupati: " + (numeroPosto1.size() + numeroPosto2.size() + numeroPosto3.size()) + " posti");

        //System.out.println(numeroPosto1);
        //System.out.println(numeroPosto2);
        //System.out.println(numeroPosto3);
    }
}