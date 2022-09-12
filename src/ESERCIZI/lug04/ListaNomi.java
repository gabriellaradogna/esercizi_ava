package ESERCIZI.lug04;

import java.util.ArrayList;

public class ListaNomi {

    public ArrayList listaDiNomi;

    public void setLista(){
        listaDiNomi = new ArrayList<>();
        listaDiNomi.add("Gabriella Radogna");
        listaDiNomi.add("Simone Ettorre");
        listaDiNomi.add("Marta Cunden");

        System.out.println("Elenco nomi: " + listaDiNomi);
        System.out.println("Dimensione ArrayList: " + listaDiNomi.size());
    }

    public void modificaLista(){
        listaDiNomi.remove("Gabriella Radogna");
        System.out.println(listaDiNomi);
        System.out.println(listaDiNomi.size());
        listaDiNomi.add(1, "Gabriella Radogna");
        System.out.println(listaDiNomi);
    }
}
