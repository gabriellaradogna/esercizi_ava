package lug20;

import java.util.Arrays;
import java.util.List;

public class Lambda6 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Le", "espressioni", "lambda", "sono", "utili");

        strings.forEach(System.out::println);
        // il simbolo :: racchiude l'espressione lambda precedente (Lambda5)
        // il forEach() sa già di dover ripetere le istruzioni nel suo argomento per tutto strings
    }
}
