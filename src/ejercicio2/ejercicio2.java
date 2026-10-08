
package ejercicio2;

public class ejercicio2 {
    public static long sumTwoSmallestNumbers(long[] numbers) {
        
        long menor = Long.MAX_VALUE;
        long segundoMenor = Long.MAX_VALUE;

        for (long numero : numbers) {

            if (numero < menor) {
                segundoMenor = menor;
                menor = numero;

            } else if (numero < segundoMenor) {
                segundoMenor = numero;
            }
        }

        return menor + segundoMenor;
    }
}