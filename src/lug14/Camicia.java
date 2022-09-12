package lug14;

import lug12.Abbigliamento;

public class Camicia extends Abbigliamento implements Restituibile{ // collego Camicia ad Abbigliamento
    // tutti i campi sono già definiti in Abbigliamento, ne aggiungo uno specifico per Camicia
    private char genere = 'U'; // 'M' =da uomo; 'F' = da donna; 'U' = unisex.

    // costruttore
    public Camicia(int elementoID, String descrizione, char codiceColore, double prezzo, char genere){
        super(elementoID, descrizione, codiceColore, prezzo); // invio questi argomenti al costruttore della superclasse
        // devo passare anche codiceColore perchè il costruttore di Abbigliamento lo attende, sebbene setCodiceColore sia abstract
        setCodiceColore(codiceColore);
        setGenere(genere);
    }

    public void setCodiceColore(char codiceColore){ // override del metodo in superclasse Abbigliamento

        switch (codiceColore){
            case 'B': // camicia blu
            case 'R': // camicia rossa
            case 'G': // camicia verde
                this.codiceColore = codiceColore; // this va direttamente alla superclasse Abbigliamento a rigo 7!
                break;
            default:
                this.codiceColore = 'X'; // valore non definito...
        }
    }
    public char getCodiceColore(){
        return codiceColore; // recupera il codiceColore da Abbigliamento riga 7!
    }

    public void setGenere(char genere){

        switch (genere){
            case 'M': // da uomo
            case 'F': // da donna
            case 'U': // unisex
                this.genere = genere; // passo il valore al campo di rigo 5
                break;
            default:
                this.genere = 'X';
        }
    }
    public char getGenere(){
        return genere;
    }

    // faccio override del metodo della superclasse perchè voglio stampare anche il genere, non presente in Abbigliamento
    // sfruttando i get implementati nella superclasse
    public void display(){
        System.out.println("ID della camicia: " + getElementoID());
        System.out.println("Descrizione: " + getDescrizione());
        System.out.println("Codice colore: " + getCodiceColore());
        System.out.println("Genere (Uomo/Donna/Unisex): " + getGenere()); // unico get non ereditato, rigo 48
        System.out.println("Prezzo: " + getPrezzo());
        System.out.println(restituisci());
    }

    public String restituisci(){ // implemento il metodo dichiarato dell'interfaccia
        return "La camicia" + getElementoID() + " può essere restituita entro 3 giorni.";
    }
}
