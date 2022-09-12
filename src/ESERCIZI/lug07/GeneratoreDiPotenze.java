package ESERCIZI.lug07;

public class GeneratoreDiPotenze {
    public double risultato = 0;
    public double esponente = 0;

    public void setBase(double base){
        risultato=Math.floor(Math.pow(base, esponente));
        System.out.println(risultato);
    }


}
