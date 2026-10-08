

public class ejercicio7 {

    public static int findEvenIndex(int[] arr) {

        int sumaTotal = 0;

        // Sumamos todos los elementos
        for (int numero : arr) {
            sumaTotal += numero;
        }

        int sumaIzquierda = 0;

        for (int i = 0; i < arr.length; i++) {

            // La suma derecha es el total menos
            // la suma izquierda y el elemento actual
            int sumaDerecha = sumaTotal - sumaIzquierda - arr[i];

            if (sumaIzquierda == sumaDerecha) {
                return i;
            }

            sumaIzquierda += arr[i];
        }

        return -1;
    }
}