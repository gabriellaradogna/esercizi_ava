package lug20;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda3 { // NB: non sto aggiungendo implements Consumers

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Le", "espressioni", "lambda", "sono", "utili");

        strings.forEach(new Consumer<String>() { // Consumer è l'interfaccia Generics delle Lambda!
            public void accept(String s) { // accept() è dichiarato in Consumer, va implementato
                System.out.println(s);
            }
        });
    }
}
