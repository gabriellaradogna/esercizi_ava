package giu29;

public class IncrementoDecremento {
    public static void main(String[] args) {
        // args[0] e args[1] sono input utente, salvato da Java come String
        // li converto in int con parseInt() dell'opportuna classe wrapper Integer
        int i = Integer.parseInt(args[0]); // 10 (dopo che lo ha lanciato la prima volta è andato in run -> edit configuration e ha messo 10 207)
        int j = Integer.parseInt(args[1]); // 207
        System.out.println(++i + " " + i++ + " " + i);
        System.out.println(--j + " " + j-- + " " + j);
    }
}
