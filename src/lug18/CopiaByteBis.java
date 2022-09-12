package lug18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaByteBis {

    public static void main(String[] args) {

        try {
            // creo un'oggetto di tipo File contenitore del file da diplicare
            File inputFile = new File("src/lug18/flussobyte.txt");
            // creo un'oggetto di tipo File contenitore del file duplicato
            File outputFile = new File("src/lug18/copiafilebis.txt");

            FileInputStream in = new FileInputStream(inputFile);
            FileOutputStream out = new FileOutputStream(outputFile);

            while(in.available() != 0){
                out.write(in.read());
            }
            in.close();
            out.close();

        } catch (IOException ioe){
            System.out.println("Problema dell'input/output, assicurati che la risorsa esterna sia presente!");
        }
    }
}
