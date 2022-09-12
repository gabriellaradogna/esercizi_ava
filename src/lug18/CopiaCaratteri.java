package lug18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiaCaratteri {

    public static void main(String[] args) {

        try{
            File inputFile = new File("src/lug18/flussocaratteri.txt");
            File outputFile = new File("src/lug18/copiacaratteri.txt"); // file creato da Java

            FileReader in = new FileReader(inputFile); // stream di caratteri in ingresso
            FileWriter out = new FileWriter(outputFile); // stream di caratteri in uscita

            // ciclo while per leggere la risorsa esterna come fosse un array di char
            while (in.ready()) { // ready() di FileReader ha tipo di ritorno boolean (finchè c'è qualcosa da leggere...)
                out.write(in.read());
            }

            in.close();
            out.close();

        } catch (IOException ioe){
            System.out.println("Problema dell'input/output, assicurati che la risorsa esterna sia presente!");
        }
    }
}
