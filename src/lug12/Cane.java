package lug12;

public class Cane extends Pet {
    String[] prodotti = {"1. Cibo secco 5kg", "2. Cibo secco 1kg", "3. Cibo umido 500g", "4. Cibo umido 80g", "5. Frontline cane 5 pipette",
                         "6. Ciotola", "7. Gioco per pulizia denti", "8. Guinzaglio con collare", "9. Cuccia"};
    double[] prezzi = {33.00, 7.50, 4.00, 1.00, 18.50, 3.00, 4.00, 8.00, 99.00};

    public double mostraProdotti(){
        System.out.println("****** Articoli per cani ******");

        for (int i=0; i<prodotti.length; i++){
            System.out.println(prodotti[i] + ": " + prezzi[i] + "euro cadauno");
        }

        System.out.println();
        double totale = cassa(prodotti, prezzi);
        return totale;
    }
}
