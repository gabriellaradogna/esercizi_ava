package lug05;

public class CicliWhileAnnidati {

    public static void main(String[] args){
        String nome = args[0]; // immettiamo la parola da indovinare, sapendo soltanto la sua lunghezza
        String indovina = "";
        int numeroTentativi = 0;

        while (!indovina.equals(nome.toLowerCase())) { // finchè indovina è diverso dal nome in minuscolo
            indovina = ""; // prima operazione: resettare indovina

            while (indovina.length() < nome.length()) { // finchè indovina e nome hanno lunghezze differenti

                //scelgo un codice ASCII corrispondente a una lettera minuscola e lo converto in char
                char carattere = (char)(Math.random()*26 + 97); // al codice 97 corrisponde la 'a'
                indovina += carattere; // concateno il carattere casuale alla String indovina che sto componendo
            }
            numeroTentativi++;
        }

        System.out.println(indovina); // stampo indovina per dimostrare che Java ha trovato la parola
        System.out.println(nome + " trovato dopo " + numeroTentativi + " tentativi!");
    }
}
