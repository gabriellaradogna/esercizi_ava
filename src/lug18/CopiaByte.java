package lug18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaByte {

    public static void main(String[] args) throws IOException {

        try {
            // istanza di una classe predisposta a ricevere flussi di byte (un flusso di byte nell'insieme mi realizza un file)
            FileInputStream in = new FileInputStream(new File("src/lug18/flussobyte.txt")); // IntelliJ vuole il path
            // istanza di una classe predisposta a emettere flussi di byte
            FileOutputStream out = new FileOutputStream(new File("src/lug18/copiabyte.txt")); // copiabyte.txt creato da Java

            // la risora esterna viene letta come un "array di byte" dove leggo un byte dopo l'altro
            while(in.available() != 0){ // finchè ha altri byte da leggere...
                out.write(in.read()); //...scrive il byte che legge nel file che ha creato a rigo 16
            }
            in.close(); // chiudo lo stream in ingresso
            out.close(); // chiudo lo stream in uscita
        } catch (IOException ioe){
            System.out.println("Problema dell'input/output, assicurati che la risorsa esterna sia presente!");
        }

    }
}
