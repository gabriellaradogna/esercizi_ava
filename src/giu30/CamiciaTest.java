package giu30;

public class CamiciaTest {

    public static void main(String[] args) {
        Camicia miaCamicia = new Camicia(); // prima istanda di Camicia
        Camicia tuaCamicia = new Camicia(); // seconda istanza di Camicia
        Camicia altraCamicia = new Camicia(); // terza istanza di Camicia
        miaCamicia = tuaCamicia; // spezza il riferimento logico per miaCamicia. punta sempre a tuaCamicia, e viceversa!
        miaCamicia.codiceColore = 'R';
        tuaCamicia.codiceColore = 'G';
        miaCamicia.camiciaID = 5;
        altraCamicia.camiciaID = miaCamicia.camiciaID; // camiciaId è uguale per altraCamicia e miaCamicia
        altraCamicia.camiciaID = 10;
        System.out.println("Colore camicia: " + miaCamicia.codiceColore); // un'istanza perde la propria identità
        System.out.println("ID camicia: " + miaCamicia.camiciaID); // stampo ancora 5
    }
}
