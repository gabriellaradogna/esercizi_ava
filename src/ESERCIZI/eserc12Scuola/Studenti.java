package ESERCIZI.eserc12Scuola;

import java.util.ArrayList;

public class Studenti extends Persona{
    private int classe = 0;
    private char sezione = 'U';
    private int matricola;
    ArrayList<Integer> matricole = new ArrayList<>();

    public Studenti(int anno, String nome, String cognome, int classe, char sezione){
        super(anno, nome, cognome);
        setClasse(classe);
        setSezione(sezione);
        setMatricola();
    }

    public void setClasse(int classe){
        this.classe = classe;
    }
    public int getClasse(){
        return classe;
    }

    public void setSezione(char sezione){
        this.sezione = sezione;
    }
    public char getSezione(){
        return sezione;
    }

    public void setMatricola(){
        int mat = (int) Math.floor(Math.random()*999999 + 1);
        if(!matricole.contains(mat)){
            matricole.add(mat);
            this.matricola = mat;
        }
    }
    public String getMatricola(){
        return String.format("%06d", this.matricola);
    }
}
