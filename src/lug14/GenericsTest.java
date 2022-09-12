package lug14;

public class GenericsTest {

    public static void main(String[] args){
        Bottiglia<Acqua> bottiglia1 = new Bottiglia<>(new Acqua());
        Bottiglia<Vino> bottiglia2 = new Bottiglia<>(new Vino());
        // N.B: Bottiglia contiene classi differenti, non istanze di una stessa ipotetica classe Bevande
        BraccioMeccanico braccio = new BraccioMeccanico();
        braccio.prendiBottiglia(bottiglia1); // prende una bottiglia di acqua
        braccio.prendiBottiglia(bottiglia2); // prende una bottiglia di vino
    }
}
