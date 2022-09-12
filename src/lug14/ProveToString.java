package lug14;

public class ProveToString {

    public static void main(String[] args){
        // tutti gli elementi inseriti nel println() ereditano toString() da Object
        System.out.println(new Object());
        System.out.println(new StringBuilder("Testo a piacere")); // anche gli StringBuilder sono convertiti in String!
        System.out.println(new First());
        System.out.println(new Second());
    }
}

class First{}

class Second{
    String stringa = "Questa classe fa un override di toString()";

    public String toString() {
        return stringa;
    }
}