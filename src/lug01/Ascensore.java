package lug01;

public class Ascensore {
    public boolean portaAperta = false; // porta chiusa "per sicurezza"
    public int pianoCorrente = 1; //la cabina parte da piano 1
    public final int PIANO_MIN = 1;
    public final int PIANO_MAX = 10;

    public void apriPorta() {
        System.out.println("Sto aprendo la porta.");
        portaAperta = true;
        System.out.println("La porta è aperta");
    }

    public void chiudiPorta() {
        System.out.println("Sto chiudendo la porta.");
        portaAperta = false;
        System.out.println("La porta è chiusa");
    }

    public void vaiSu() {
        System.out.println("Sto salendo di un piano.");
        pianoCorrente++;
        System.out.println("Piano: " + pianoCorrente);
    }

    public void vaiGiu() {
        System.out.println("Sto scendendo di un piano.");
        pianoCorrente--;
        System.out.println("Piano: " + pianoCorrente);
    }
}
