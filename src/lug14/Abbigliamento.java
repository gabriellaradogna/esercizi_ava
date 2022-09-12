package lug14;

public abstract class Abbigliamento {
    //campi
    private int elementoID = 0;
    private String descrizione = "-richiesta-";
    protected char codiceColore = 'U'; // protected: accessibie soltanto da classi in gerarchia
    private double prezzo = 0.0;

    // costruttore
    public Abbigliamento(int elementoID, String descrizione, char codiceColore, double prezzo){
        setElementoID(elementoID); // vedi rigo 27
        setDescrizione(descrizione);
        setCodiceColore(codiceColore);
        setPrezzo(prezzo);
    }

    // incapsulato perchè sarà invocato dall'esterno della classe
    public void display(){
        System.out.println("ID elemento: " + getElementoID()); // vedi rigo 30
        System.out.println("Descrizione: " + getDescrizione());
        System.out.println("Codice colore: " + getCodiceColore());
        System.out.println("Prezzo: " + getPrezzo());
    }

    // metodi set e get
    public void setElementoID(int elementoID){ // vedi rigo 12
        this.elementoID = elementoID; // this permette di riferirci al campo omonimo della variabile locale
    }
    public int getElementoID(){ // vedi rigo 20
        return elementoID;
    }

    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }
    public String getDescrizione(){
        return descrizione;
    }

    public abstract void setCodiceColore(char codiceColore); // abstract: soltanto dichiarato e non implementato
    // non implementato qui perchè i colori dipendono dal tipo di capo di abbigliamento
    // comunque dichiarato perchè DEVE essere implementato dalle sottoclassi

    public abstract char getCodiceColore(); // abstract perchè è bene implementare get e set corrispondenti insieme

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }
    public double getPrezzo(){
        return prezzo;
    }
}
