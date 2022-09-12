package giu29;

public class ByteTest {
    public static void main(String[] args) {
        byte b1 =1, b2=2, b3;
        b3 = (byte)(b1 + b2); // una operazione tra interi, per Java, è un tipo di int, devo fare il casting a byte
        int b4 = b1 + b2;
        System.out.println("b3 = " + b3 + "; b4 = " + b4);
    }
}
