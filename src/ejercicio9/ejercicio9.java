package ejercicio9;

public class ejercicio9 {

    public boolean check(String sentence) {
        boolean[] letras = new boolean[26];

        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letras[c - 'a'] = true;
            }
        }

        for (boolean letra : letras) {
            if (!letra) {
                return false;
            }
        }

        return true;
    }
}