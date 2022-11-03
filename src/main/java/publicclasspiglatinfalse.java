public class PigLatin {
    public static String traducirPig (String cadena){
        String empiezaVocal="^[aeiou]{1}.*";
        String dosConsonantes= "^[aeiou]{2}.*";
        
            if (cadena.matches(empiezaVocal)){
                cadena += "yay";
            }//if1
            else if (cadena.matches(dosConsonantes)){
                cadena = cadena.substring(2) + cadena.substring(0,2) + "ay";
            }
            else{
                cadena = cadena.substring(1) + cadena.substring(0,1)+ "ay";
            }
            return cadena;
    }//traducir Pig
public class publicclasspiglatinfalse {
    public static void main(String[] args) {
        
    }//main
}//piglatinfalse
