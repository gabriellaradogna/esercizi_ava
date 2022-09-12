package lug14;

class Madre { // superclasse

    public int metodo(int i, int j){
        return i + j;
    }

}

class Figlia extends Madre { // sottoclasse

    public int metodo(int i, int j){ // override di metodo() di Madre
        return i - j;
    }

}

public class OverrideTest {

    public static void main(String[] args){
        Madre a = new Madre();
        Figlia b = new Figlia();
        Madre c = new Figlia();
        int d;
        d = a.metodo(5,7);
        System.out.println(d);
        d = b.metodo(5,7);
        System.out.println(d);
        d = c.metodo(5,7);
        System.out.println(d);
    }
}
