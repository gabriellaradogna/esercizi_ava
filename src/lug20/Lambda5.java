package lug20;

import java.util.Arrays;
import java.util.List;

public class Lambda5 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Le", "espressioni", "lambda", "sono", "utili");

        strings.forEach(s -> System.out.println(s));
        // strings di tipo String già dichiarato nel tag di List<String>
    }
}
