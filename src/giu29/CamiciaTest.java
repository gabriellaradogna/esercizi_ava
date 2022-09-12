package giu29;

public class CamiciaTest {


    public static void main(String[] args) {
        Camicia miaCamicia1 = new Camicia(); // dichiaro e creo un'istanza di Camicia
        Camicia miaCamicia2 = new Camicia(); // dichiaro e creo un'altra istanza di Camicia
        miaCamicia1.camiciaID= 2022; // modifico il campo camiciaID dell'istanza miaCamicia1
        miaCamicia1.camiciaID= 1990; // modifico il campo camiciaID dell'istanza miaCamicia2
        miaCamicia1.codiceColore = 'B'; // modifico il campo codiceColore dell'istanza miaCamicia1, ricordando che è char
        miaCamicia1.pezziInMagazzino = 29; // modifico il campo pezziInMagazzino dell'istanza miaCamicia1
        miaCamicia2.pezziInMagazzino = 4; // modifico il campo pezziInMagazzino dell'istanza miaCamicia2

        miaCamicia1.mostraInformazioni(); // stampo la scheda di miaCamicia1
        miaCamicia2.mostraInformazioni(); // stampo la scheda di miaCamicia2

        Camicia miaCamicia3 = new Camicia();
        miaCamicia3.mostraInformazioni(); // nuova istanza creata, le modifiche fatte ai campi delle altre istanze non hanno
        // effetti sulla Camicia originale
    }

}
