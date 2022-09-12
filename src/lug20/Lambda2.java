package lug20;

import java.util.Arrays;
import java.util.List;

public class Lambda2 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Le", "espressioni", "lambda", "sono", "utili");

        for(String element : strings){ // per usare il for avanzato devo indicare <String> in List
            System.out.println(element);
        }
    }
}
