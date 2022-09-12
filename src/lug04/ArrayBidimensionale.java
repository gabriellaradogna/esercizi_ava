package lug04;

public class ArrayBidimensionale {

    public static void main(String[] args){
        int anni = 5, trimestri = 4;
        int [][] venditeAnnuali; // dichiaro array bidimensionale (due coppie di parentesi quadre)
        venditeAnnuali = new int [anni] [trimestri]; //creo l'array bidimensionale, inizialmente riempito con 5x4 0
        venditeAnnuali[0][0] = 1000; // nel 1° trimestre del 1° anno ho venduto per 1000 euro
        venditeAnnuali[0][1] = 1500; // nel 2° trimestre del 1° anno ho venduto per 1500 euro
        venditeAnnuali[0][2] = 1800; // nel 3° trimestre del 1° anno ho venduto per 1800 euro
        // non metto venditeAnnuali[0][3] perchè se ho fatto 0 euro non serve che lo aggiunga, parte di default da 0
        venditeAnnuali[1][0] = 1000; // 1° trim 2° anno
        venditeAnnuali[2][1] = 1100;
        venditeAnnuali[2][3] = 1900;
        venditeAnnuali[3][3] = 2000;

        // per stampare array bidimensionali è buona regola avvalersi di cicli for annidati
        for (int i=0; i<anni; i++) {
            System.out.println("Vendite nell'anno " + (i + 2017) + ":");

            for (int j=0; j<trimestri; j++) {
                System.out.println("   Trimestre " + (j+1) + ":" + venditeAnnuali[i][j]);
            }
            System.out.println();
        }
    }
}
