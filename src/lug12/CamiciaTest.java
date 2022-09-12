package lug12;

import java.util.Scanner;

public class CamiciaTest {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digitare l'ID della camicia e inviare: ");
        int id = input.nextInt();
        System.out.print("Scrivere la descrizione della camicia e inviare: ");
        input.nextLine(); //processo l'invio non recepito dal nextInt() precedente
        String de = input.nextLine();
        System.out.println("Colori disponibili: R=rosso, B=blu, G=verde");
        System.out.print("Scegli il colore e inviare: ");
        char cc = input.next().charAt(0); //per salvare un char devo prelevare il primo carattere della stringa
        System.out.println("Genere: M=uomo, F=donna, U=unisex");
        System.out.print("Scegliere il genere e inviare: ");
        char ge = input.next().charAt(0);
        System.out.print("Digitare il prezzo e inviare (virgola per i decimali): ");
        double pr = input.nextDouble();
        Camicia miaCamicia= new Camicia(id, de, cc, pr, ge); // l'ordine degli argomenti deve essere quello atteso
        miaCamicia.display(); // invoco il metodo display() dell'istanza
    }
}
