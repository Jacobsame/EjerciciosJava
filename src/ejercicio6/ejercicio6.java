public class ejercicio6 {

    public static String order(String words) {

        if (words.isEmpty()) {
            return "";
        }

        String[] palabras = words.split(" ");
        String[] resultado = new String[palabras.length];

        for (String palabra : palabras) {

            for (char c : palabra.toCharArray()) {

                if (Character.isDigit(c)) {
                    int posicion = Character.getNumericValue(c);

                    resultado[posicion - 1] = palabra;
                    break;
                }
            }
        }

        return String.join(" ", resultado);
    }
}