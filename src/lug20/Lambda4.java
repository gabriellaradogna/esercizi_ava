package lug20;

import java.util.Arrays;
import java.util.List;

public class Lambda4 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Le", "espressioni", "lambda", "sono", "utili");

        strings.forEach((String s) -> System.out.println(s));
        // il simbolo -> sintetizza l'implementazione di accept() dell'interfaccia Consumer
    }
}
