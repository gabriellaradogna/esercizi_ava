package lug04;

import java.util.ArrayList; // import necessario per usare ArrayList

public class ArrayListEsempio {

    public static void main(String[] args) {
        ArrayList miaLista; // dichiaro l'istanza di ArrayList
        miaLista = new ArrayList<String>(); //creo l'istanza, destro < > va inserito il tipo di oggetti, Integer se int
        miaLista.add("Milano"); // inizio aggiunta elementi all'ArrayList
        miaLista.add("Torino");
        miaLista.add("Roma");
        miaLista.add("Napoli");
        miaLista.add("Bari");
        miaLista.add("Roma");
        miaLista.add("Palermo"); //fine aggiunta elementi all'ArrayList
        miaLista.remove(0); // rimuovo il primo elemento, cioè Milano
        miaLista.remove(miaLista.size()-1); // rimuovo l'ultimo elemento, cioè Palermo; size() (è un metodo, date le parentesi, che) mi da la lunghezza
        miaLista.remove("Roma"); // rimuovo il primo elemento "Roma" presente
        miaLista.add(miaLista.get(0)); // aggiungo/copio in coda "Torino", che avrà indice 0 avendo tolto prima "Milano"
        System.out.println(miaLista); // stampo l'ArrayList residuo dopo i vari remove()
        System.out.println("Posizione di Napoli in miaLista: " + miaLista.indexOf("Napoli"));

        // output
        //[Torino, Napoli, Bari, Roma, Torino]
        //Posizione di Napoli in miaLista: 1
    }
}
