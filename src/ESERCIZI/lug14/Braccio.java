package ESERCIZI.lug14;

public class Braccio {

   public void prendiContenitoreEBevanda(Contenitori<?> contenitore, Bevande<?> bevanda){
        System.out.println("Ho preso " + contenitore.getContenitore() + " di " + bevanda.getBevanda());
    }

}
