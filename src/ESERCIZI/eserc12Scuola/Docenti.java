package ESERCIZI.eserc12Scuola;

public class Docenti extends Persona{
    private String materia = "-richiesta-";

    public Docenti(int annoDiNascita, String nome, String cognome, String materia) {
        super(annoDiNascita, nome, cognome);
        setMateria(materia);
    }

    public void setMateria(String materia){
        this.materia = materia;
    }
    public String getMateria(){
        return materia;
    }

}
