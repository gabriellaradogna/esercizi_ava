package ESERCIZI.eserc12Scuola;

public class Persona {
    private String nome = "-richiesto-";
    private String cognome = "-richiesto-";
    private int annoDiNascita = 0;

    public Persona(int annoDiNascita, String nome, String cognome){
        setNome(nome);
        setCognome(cognome);
        setAnnoDiNascita(annoDiNascita);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public String getCognome(){
        return cognome;
    }

    public void setAnnoDiNascita(int annoDiNascita){
        this.annoDiNascita = annoDiNascita;
    }
    public int getAnnoDiNascita(){
        return annoDiNascita;
    }

}
