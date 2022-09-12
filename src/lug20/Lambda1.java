package lug20;

import java.util.Arrays;
import java.util.List;

public class Lambda1 {

    public static void main(String[] args) {
        List strings = Arrays.asList("Le", "espressioni", "lambda", "sono", "utili");

        for(int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
        }
    }
}
