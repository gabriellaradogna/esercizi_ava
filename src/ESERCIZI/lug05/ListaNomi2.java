package ESERCIZI.lug05;

import java.util.ArrayList;

public class ListaNomi2 {

    public ArrayList<String> listaDiNomi;
    public void impostaLista() {
        listaDiNomi = new ArrayList<String>();
        listaDiNomi.add("Clint Eastwood");
        listaDiNomi.add("Al Pacino");
        listaDiNomi.add("Kevin Costner");
        listaDiNomi.add("Mel Gibson");
        System.out.println("Dimensione dell'ArrayList: " + listaDiNomi.size());
    }

    public void mostraNomi() {
        for(String posizione : listaDiNomi){
            System.out.print(posizione + " ");
        }
    }
}
