package ejercicio8;


public class ejercicio8 {

    public int solution(int number) {
        int suma = 0;

        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }

        return suma;
    }
}