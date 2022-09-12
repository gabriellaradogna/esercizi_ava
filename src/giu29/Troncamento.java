package giu29;

public class Troncamento {

    public static void main(String[] args) {
        int num1 = 70; // num1 nasce a 32 bit
        int num2 = 80; // num2 nasce a 32 bit
        byte num3 = (byte)(num1 + num2); // num1 + num2, per matematica, è 150, valore fuori dal range del tipo byte (ecco perchè risultato è assurdo)
        System.out.print(num1 + " + " +  num2 + " = ");
        System.out.println(num3);

        short num4 = (short)(num1 + num2);
        System.out.print(num1 + " + " +  num2 + " = ");
        System.out.println(num4);
    }
}
