package lug05;

public class CicloForDueContatori {

    public static void main(String[] args) {

        for (String i = "|", t = "------"; i.length() < 7; i += "|", t = t.substring(1)) {
            // a ogni iterazione, aggiungo a i un "|" e tolto a t il primo "-"
            System.out.println(i + t);
        }
    }
}
