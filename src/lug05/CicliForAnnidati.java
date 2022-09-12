package lug05;

public class CicliForAnnidati {

    public static void main(String[] args) {
        int altezza = 4, larghezza = 10;

        for(int contaRighe = 0; contaRighe < altezza; contaRighe++) {

            for(int contaColonne = 0; contaColonne < larghezza; contaColonne++) {
                System.out.print("G");
            }

            System.out.println();
        }
    }
}
