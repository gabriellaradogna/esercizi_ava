package lug04;

public class ArgsTest {

    public static void main(String[] args) {
        System.out.println("Concatenazione: " + (args[0] + args[1]));
        int arg0 = Integer.parseInt(args[0]); // converto la String contenuta in args[0] in int
        int arg1 = Integer.parseInt(args[1]); // idem su args[1]
        System.out.println("Totale: " + (arg0 + arg1));
    }
}
