package ejercicio5;

public class ejercicio5 {

    public static int persistence(long num) {
        int contador = 0;

        while (num >= 10) {
            long producto = 1;

            while (num > 0) {
                producto *= num % 10;
                num /= 10;
            }

            num = producto;
            contador++;
        }

        return contador;
    }
}