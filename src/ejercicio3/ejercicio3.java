import java.util.Arrays;

public class ejercicio3 {

    public static int sortDesc(final int num) {
        char[] digitos = String.valueOf(num).toCharArray();

        Arrays.sort(digitos);

        String resultado = "";

        for (int i = digitos.length - 1; i >= 0; i--) {
            resultado += digitos[i];
        }

        return Integer.parseInt(resultado);
    }
}