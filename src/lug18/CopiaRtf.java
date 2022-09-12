package lug18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiaRtf {

    public static void main(String[] args) {

        try {
            File inputFile = new File("src/lug18/ProvaCaratteri.rtf");
            File outputFile = new File("src/lug18/CopiaCaratteri.rtf");

            FileReader in = new FileReader(inputFile);
            FileWriter out = new FileWriter(outputFile);

            while (in.ready()){
                out.write(in.read());
            }

            in.close();
            out.close();

        } catch (IOException ioe){
            System.out.println("Problema dell'input/output, assicurati che la risorsa esterna sia presente!");
        }
    }
}
