package ESERCIZI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Equazioni2grado {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            System.out.print("Inserire il valore a dell'equazione: ax^2+bx+c=0 ");
            double a=input.nextDouble();
            System.out.print("Inserire il valore b dell'equazione: (" + a + ")"+"x^2"+"+b"+"x"+"+c"+"=0 ");
            double b=input.nextDouble();
            System.out.print("Inserire il valore c dell'equazione: (" + a + ")"+"x^2"+"+(" + b + ")"+"x"+"+c"+"=0 ");
            double c=input.nextDouble();
            System.out.println("(" + a + ")"+"x^2"+"+(" + b + ")"+"x"+"+(" + c + ")"+"=0");
            double d=(b*b)-4*(a*c);
            if (a==0){
                System.out.println("Il risultato dell'equazione di primo grado è: "+((-c)/b));
            }else {
                if (d<0){
                    d=-d;
                    System.out.println("L’equazione non è risolvibile nel campo dei numeri reali: \ns1=("+(-b)+" -i*"+d+"^(-2))/"+2*a+"\n"+"s2=("+(-b)+" +i*"+d+"^(-2))/"+2*a);
                } else if (d==0) {
                    System.out.println("L’equazione ha 2 soluzioni reali e coincidenti. Se si scompone si otterrà un quadrato di binomio: "+(-b/(2*a)));
                }else {
                    System.out.println("L’equazione ha 2 soluzioni reali e distinte: "+"\ns1= "+(-b+Math.sqrt(d))/(2*a)+"\ns2= "+(-b-Math.sqrt(d))/(2*a));
                }
            }
        }catch (InputMismatchException gc){
            System.out.println("Caro utente è pregato di inserire dei numeri e non delle lettere grazie!...");
        }catch (Exception exc){
            System.out.println("Errore!");
        }finally {
            System.out.println("Grazie per aver usato il mio algoritmo ;)");
        }
    }
}
