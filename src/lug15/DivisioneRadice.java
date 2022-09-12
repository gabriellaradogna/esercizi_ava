package lug15;

public class DivisioneRadice {

    //throws predispone il metodo a trovare eccezioni
    public static double div(int a, int b) throws Exception{

        if(b == 0){
            throw new Exception("Impossibile dividere per zero"); // se succede, il metodo termina e passa al main()
        }
        if(a/b<0){
            throw new Exception("Il radicando non può essere negativo"); // se succede, il metodo termina e passa al main()
        }
        return Math.sqrt((float)a/b); // restituisco al caller (main()) la radice quadrata di a/b
    }
}
