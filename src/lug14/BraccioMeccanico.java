package lug14;

public class BraccioMeccanico {

    // <?> rappresenta il paramentro T che BraccioMeccanico non vede
    public void prendiBottiglia(Bottiglia<?> bottiglia){
        System.out.println("Ho preso " + bottiglia.getContenuto()); // la frase si completerà con uno dei return di toString() di Acqua o Vino
    }
}
