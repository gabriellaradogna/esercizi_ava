package lug08;

import java.util.Scanner;

public class CamiciaTest {

    public static void main(String[] args){
        Camicia miaCamicia = new Camicia();
        Scanner input = new Scanner(System.in);
        System.out.println("*** Modulo di ordinazione delle camicie ***");
        System.out.print("Digitare l'ID della camicia e inviare: ");
        miaCamicia.setCamiciaID(input.nextInt());
        input.nextLine(); // siccome il prossimo input è una String, devo processare l'invio fatto con nextInt() precedente
        System.out.print("Descrizione della camicia: ");
        miaCamicia.setDescrizione(input.nextLine());
        System.out.print("Digitare il codice colore: ");
        miaCamicia.setCodiceColore(input.nextLine().charAt(0)); //non esiste nextChar(), si prende il primo carattere della stringa
        System.out.print("Disponibilità in magazzino: ");
        miaCamicia.setDisponibili(input.nextInt());
        System.out.print("Articoli aquistati: ");
        miaCamicia.setQuantita(input.nextInt());
        System.out.print("Prezzo unitario: (virgola per i decimali) ");
        miaCamicia.setPrezzo(input.nextDouble());

        miaCamicia.display(); // display invoca i metodi get per restituire i campi private di Camicia.java

        System.out.println("Ho acquistato " + miaCamicia.getQuantita() + " camicie, al prezzo di " + miaCamicia.getPrezzo() +
                " l'una.");
    }
}
