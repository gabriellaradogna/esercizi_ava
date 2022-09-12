package lug01;

public class AscensoreTest {

    public static void main(String[] args) {
        //Ascensore mioAscensore = new Ascensore(); // creo istanza di Ascensore
        //ifAscensore mioAscensore = new ifAscensore();
        ifAnnidatiAscensore mioAscensore = new ifAnnidatiAscensore();
        mioAscensore.apriPorta();
        mioAscensore.chiudiPorta();
        mioAscensore.vaiGiu();
        mioAscensore.vaiSu();
        mioAscensore.vaiSu();
        mioAscensore.vaiSu();
        mioAscensore.apriPorta();
        mioAscensore.chiudiPorta();
        mioAscensore.vaiGiu();
        mioAscensore.apriPorta();
        mioAscensore.vaiGiu();
        mioAscensore.apriPorta();
    }
}
