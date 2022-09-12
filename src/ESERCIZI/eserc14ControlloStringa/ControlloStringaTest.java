package ESERCIZI.eserc14ControlloStringa;

public class ControlloStringaTest {

    public static void main(String[] args) {

        try {
            String stringa = args[0];
            char carattere = args[1].charAt(0);
            int n = 0;

            if (args[1].length() > 1){
                System.out.println("Attenzione. Non hai inserito un carattere singolo.");
                System.exit(1);
            } else if (!Character.isLetter(carattere)){
                System.out.println("Attenzione. Il carattere inserito non è una lettera.");
                System.exit(1);
            } else if (stringa.length()<3){
                System.out.println("Attenzione la stringa inserita è troppo corta.");
                System.exit(1);
            }
            for (int lettera = 0; lettera < stringa.length(); lettera++) {
                if (stringa.charAt(lettera) == carattere) {
                    n++;
                }
            }
            System.out.println("Il carattere " + carattere + " è presente in '" + stringa + "' " + n + " volte");
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Attenzione. L'inserimento non è corretto");
        } catch (Exception exp){
            System.out.println("Ops... qualcosa è andato storto!");
        } finally {
            System.out.println("Grazie per aver utilizzato il mio programma !");
        }

    }

}
