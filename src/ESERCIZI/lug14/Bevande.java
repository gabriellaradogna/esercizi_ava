package ESERCIZI.lug14;

public class Bevande<T> {

    private T bevanda;

    public Bevande(T t){
        bevanda = t;
    }

    public T getBevanda(){
        return bevanda;
    }
}

