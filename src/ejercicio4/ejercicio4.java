import java.util.HashMap;
import java.util.Map;

public class ejercicio4 {

    public static int duplicateCount(String text) {

        Map<Character, Integer> mapa = new HashMap<>();

        for (char c : text.toLowerCase().toCharArray()) {
            mapa.put(c, mapa.getOrDefault(c, 0) + 1);
        }

        int contador = 0;

        for (int cantidad : mapa.values()) {
            if (cantidad > 1) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("aabbcde"));
        System.out.println(duplicateCount("aabBcde"));
        System.out.println(duplicateCount("aA11"));
        System.out.println(duplicateCount("ABBA"));
    }
}