package lug14;

public class Bottiglia<T> {
    private T contenuto; // paramentro generico dell'oggetto contenuto

    // costruttore
    public Bottiglia(T t){ // il costruttore riceve un oggetto qualsiasi purchè presente nel package
        contenuto = t;
    }

    public T getContenuto(){
        return contenuto;
    }
}
