
import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la palabra para traducirla");
        String word = scanner.next();
        char primeraLetra = word.charAt(0);//estrae la primera letra.

        String Traduccion = word;
        int wordLength = 0;
        String Letra1 = Character.toString(primeraLetra);
        if ("aeiouAEIOU".contains(Letra1)) {//primera es la vocal.
            Traduccion = Traduccion + "way";
            System.out.println(Traduccion);
        }//if1
        else {//es consonante
            wordLength= word.length();
            Traduccion = word.substring (1, wordLength);
            Traduccion = Traduccion + primeraLetra + "ay";
            System.out.println(Traduccion);
        }//else
    }//Main
}//PigLatin
