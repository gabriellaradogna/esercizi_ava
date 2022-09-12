package ESERCIZI.lug08;

public class Rettangolo {
    private int base = 0;
    private int altezza = 0;

    public Rettangolo(){}

    public void dimensioni(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    public void area(){
        System.out.println("Le dimensioni del rettangolo sono: ");
        System.out.println("Base: " + base + "   Altezza: " + altezza);
        System.out.println("La relativa area vale: " + (base*altezza));
    }
    public void disegno(){
        for(int i=0; i<altezza; i++){
            for(int j=0; j<base; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public Rettangolo(int base, int altezza){
        dimensioni(base, altezza);
        area();
        disegno();
    }

}
