package ESERCIZI.lug14;

public class BraccioTest {

    public static void main(String[] args) {
        Contenitori<Boccale> boccale = new Contenitori<>(new Boccale());
        Contenitori<Calice> calice = new Contenitori<>(new Calice());
        Bevande<Birra> birra = new Bevande<>(new Birra());
        Bevande<Vino> vino = new Bevande<>(new Vino());
        Braccio braccio = new Braccio();
        braccio.prendiContenitoreEBevanda(boccale, birra);
        braccio.prendiContenitoreEBevanda(calice, vino);
    }
}
