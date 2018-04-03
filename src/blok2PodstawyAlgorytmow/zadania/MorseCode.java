package blok2PodstawyAlgorytmow.zadania;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {

    //MorseCode.decode(".... . -.--   .--- ..- -.. .")
    // "HEY JUDE"
    //MorseCode.encode("HEY JUDE")
    // ".... . -.--   .--- ..- -.. ."
    private static char[] signs = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?'};

    private static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};

    public static void main(String[] args) {

        MorseCode.decode(".... . -.--   .--- ..- -.. .");
        MorseCode.encode("HEY JUDE");

    }

    public static String decode(String input) {
        Map<String, Character> map = new HashMap<>();
        for (int i = 0; i < signs.length-1; i++) {
            map.put(morse[i],signs[i]);
        }
        String[] array = input.split(" ");
        Character[] temp = new Character[array.length];
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(!array[i].equals("")){
                temp[i]=map.get(array[i]);
                sb.append(temp[i]);
            }
            else{
                sb.append(" ");
                i++;
            }
        }
        return sb.toString();
    }

    public static String encode(String input) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < signs.length-1; i++) {
            map.put(String.valueOf(signs[i]),morse[i]);
        }
        String[] array = input.toLowerCase().split("");
        String[] temp = new String[array.length];

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(!array[i].equals(" ")){
                temp[i]=map.get(array[i]);
                sb.append(temp);
            }
            else{
                sb.append(" ");
                i++;
            }
        }
        return sb.toString();

    }
}
