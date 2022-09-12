package giu28;

public class CamiciaTest {

    // public: il metodo main DEVE essere public perchè avvia l'intero programma
    // static: (def parziale perchè cambia significato in base al contesto) il metodo è avviabile senza un'istanza della classe che lo contiene
    // void: il metodo non deve avere dei return
    // main: nome del metodo di avvio del programma
    // String[] args: array degli input
    public static void main(String[] args) {
        Camicia myCamicia; // dichiaro un'istanza (myCamicia) della classe Camicia
        myCamicia = new Camicia(); // creo l'istanza, cioè l'oggetto su cui posso operare
        myCamicia.mostraInformazioni(); // richiamo col punto un metodo dall'istanza di Camicia
    }
}
