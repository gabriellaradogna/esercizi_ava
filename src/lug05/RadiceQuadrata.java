package lug05;

public class RadiceQuadrata {

    public static void main(String[] args) {

        // numero di cui voglio calcolare la radice quadrata
        float radice = Float.parseFloat(args[0]); // valore del primo tentativo
        float radiceQuadrata = radice; // copio il valore corrente di radice

        // devo verificare l'accuratezza
        while (radiceQuadrata*radiceQuadrata -radice > 0.001) {
            radiceQuadrata = (radiceQuadrata + radice/radiceQuadrata)/2; // formula di convergenza dall'algebra
            System.out.println("Prossimo tentativo con " + radiceQuadrata);
        }

        System.out.println("La radice quadrata di " + radice + " e' " + radiceQuadrata);
    }
}
