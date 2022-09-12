package ESERCIZI.eserc11Edicola;

import java.util.ArrayList;
import java.util.Scanner;

public class EdicolaTest {

    public static void main(String[] args){
       Edicola miaEdicola = new Edicola();
       Scanner input = new Scanner(System.in);

       ArrayList listaGiornali;
       listaGiornali = new ArrayList<String>();
          listaGiornali.add("Corriere Della Sera");
          listaGiornali.add("la Repubblica");
          listaGiornali.add("Il Sole 24 Ore");
          listaGiornali.add("Il Messaggero");
          listaGiornali.add("il Fatto Quotidiano");

       for(int i=0; i< listaGiornali.size(); i++) {
          System.out.println("--------------------------------   LEGENDA   -----------------------------------");
          System.out.println("--Pubblicazioni: Corriere Della Sera   --Prezzi Vendita: 1.50   --Aggio: 0.20");
          System.out.println("                 la Repubblica                           1.75            0.35");
          System.out.println("                 Il Sole 24 Ore                          2.00            0.30");
          System.out.println("                 Il Messaggero                           1.80            0.20");
          System.out.println("                 il Fatto Quotidiano                     1.60            0.25");
          System.out.println("---------------------------------------------------------------------------------");

          System.out.println("-- Benvenut* nella sezione dedicata al giornale: '" + listaGiornali.get(i) + "' --");
          System.out.print("Digitare il numero di copie ricevute dal fornitore: ");
          miaEdicola.setCopieRicevute(input.nextInt());
          System.out.print("Digitare il numero di copie vendute ai clienti: ");
          miaEdicola.setCopieVendute(input.nextInt());
          System.out.println();
          System.out.println("--- Il resoconto odierno del giornale '" +listaGiornali.get(i) + "' è --- ");
          miaEdicola.display(i);
       }

    }
}
