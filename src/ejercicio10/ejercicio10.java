package ejercicio10;

public class ejercicio10 {

    public static String[] dirReduc(String[] arr) {
        String[] pila = new String[arr.length];
        int tamaño = 0;

        for (String direccion : arr) {

            if (tamaño > 0 && sonOpuestas(pila[tamaño - 1], direccion)) {
                tamaño--;
            } else {
                pila[tamaño] = direccion;
                tamaño++;
            }
        }

        String[] resultado = new String[tamaño];

        for (int i = 0; i < tamaño; i++) {
            resultado[i] = pila[i];
        }

        return resultado;
    }

    private static boolean sonOpuestas(String a, String b) {
        return (a.equals("NORTH") && b.equals("SOUTH")) ||
               (a.equals("SOUTH") && b.equals("NORTH")) ||
               (a.equals("EAST") && b.equals("WEST")) ||
               (a.equals("WEST") && b.equals("EAST"));
    }
}