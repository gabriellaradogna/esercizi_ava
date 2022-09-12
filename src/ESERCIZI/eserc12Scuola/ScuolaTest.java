package ESERCIZI.eserc12Scuola;

import java.util.ArrayList;
import java.util.Scanner;

public class ScuolaTest {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean ancora = true;
        ArrayList<Studenti> studenti = new ArrayList<>();
        ArrayList<Docenti> docenti = new ArrayList<>();
        do {
            System.out.print("Digitare l'anno di nascita della persona che si vuole inserire e premere invio: ");
            int anno = input.nextInt();
            if (anno >= 1922 && anno <= 2022) {

                System.out.print("Vuoi inserire uno studente (S) o un docente (D)? ");
                String pers = input.next().toUpperCase();

                switch (pers) {
                    case "S":
                        System.out.println("-----------   LEGENDA   ----------");
                        System.out.println("     Classe: 1       Sezione: A");
                        System.out.println("             2                B");
                        System.out.println("             3                C");
                        System.out.println("             4                D");
                        System.out.println("             5                E");
                        System.out.println("                              F");
                        input.nextLine();
                        System.out.print("Digitare il nome e premere invio: ");
                        String nome = input.nextLine().toUpperCase();
                        System.out.print("Digitare il cognome e premere invio: ");
                        String cognome = input.nextLine().toUpperCase();
                        System.out.print("Digitare la classe e premere invio: ");
                        int classe = input.nextInt();
                        System.out.print("Digitare la sezione e premere invio: ");
                        char sezione = input.next().toUpperCase().charAt(0);
                        Studenti nuovoStudente = new Studenti(anno, nome, cognome, classe, sezione);
                        studenti.add(nuovoStudente);
                        break;

                    case "D":
                        System.out.println("-----------   LEGENDA   ----------");
                        System.out.println("        Materia: Italiano      ");
                        System.out.println("                 Matematica");
                        System.out.println("                 Storia");
                        System.out.println("                 Inglese");
                        System.out.println("                 Fiosofia");
                        System.out.println("                 Scienze");
                        input.nextLine();
                        System.out.print("Digitare il nome e premere invio: ");
                        String nom = input.nextLine().toUpperCase();
                        System.out.print("Digitare il cognome e premere invio: ");
                        String cognom = input.nextLine().toUpperCase();
                        System.out.print("Digitare la materia e premere invio: ");
                        String materia = input.nextLine().toUpperCase();
                        Docenti nuovoDocente = new Docenti(anno, nom, cognom, materia);
                        docenti.add(nuovoDocente);
                        break;

                    default:
                        System.out.println("Scusa, non ho capito...");
                }
            } else {
                System.out.println("Attenzione! Non è possibile inserire questa persona nell'elenco.");
            }
            System.out.print("Desideri aggiungere altre persone (S/N)? ");
            String altre = input.next().toUpperCase();

            if(!altre.equals("S")){
                ancora = false;
            }
        } while (ancora);

        System.out.println("---------------- ELENCO STUDENTI ----------------");
        for(int i=0; i<studenti.size(); i++){
            System.out.println(studenti.get(i).getNome() + " " + studenti.get(i).getCognome() + " - " +
                    studenti.get(i).getClasse() + studenti.get(i).getSezione() + " - Mat: " + studenti.get(i).getMatricola());
        }
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("------------- ELENCO DOCENTI -------------");
        for(int i=0; i<docenti.size(); i++){
            System.out.println(docenti.get(i).getNome() + " " + docenti.get(i).getCognome() + " - " + docenti.get(i).getMateria());
        }
        System.out.println("------------------------------------------");
    }
}
