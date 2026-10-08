/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

public class ejercicio19 {

    public static String incrementString(String str) {

        int i = str.length() - 1;

        // Buscar dónde comienza la parte numérica
        while (i >= 0 && Character.isDigit(str.charAt(i))) {
            i--;
        }

        // No termina en número
        if (i == str.length() - 1) {
            return str + "1";
        }

        String texto = str.substring(0, i + 1);
        String numero = str.substring(i + 1);

        // Incrementar el número como texto
        char[] digitos = numero.toCharArray();

        int posicion = digitos.length - 1;

        while (posicion >= 0 && digitos[posicion] == '9') {
            digitos[posicion] = '0';
            posicion--;
        }

        if (posicion >= 0) {
            digitos[posicion]++;
        } else {
            // Todos eran 9, por ejemplo "999" -> "1000"
            numero = "1" + new String(digitos);
            return texto + numero;
        }

        return texto + new String(digitos);
    }
}