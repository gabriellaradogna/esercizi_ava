package ESERCIZI.Giulia;



public class GenrericsTest {

    public static void main (String[] args) {

    BraccioMeccanico braccio = new BraccioMeccanico();
    Contenitore<Bottiglia> contenitore1 = new Contenitore<>(new Bottiglia());
    Contenitore<Bicchiere> contenitore2 = new Contenitore<>(new Bicchiere());
    Contenuto<Acqua> contenuto1 = new Contenuto<>(new Acqua());
    Contenuto<Succo> contenuto2 = new Contenuto<>(new Succo());

    braccio.predi(contenitore1, contenuto1);
    braccio.predi(contenitore1, contenuto2);
    braccio.predi(contenitore2, contenuto1);
    braccio.predi(contenitore2, contenuto2);




    }
}
