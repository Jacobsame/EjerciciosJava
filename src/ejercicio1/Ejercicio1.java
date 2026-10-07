/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author User
 */
public class Ejercicio1 {
    public class MorseCodeDecoder {

    public static String decode(String morseCode) {

        // Quitamos espacios al principio y al final
        morseCode = morseCode.trim();

        // Separamos las palabras usando 3 espacios
        String[] palabras = morseCode.split("   ");

        String resultado = "";

        // Recorremos cada palabra
        for (String palabra : palabras) {

            // Separamos cada letra usando un espacio
            String[] letras = palabra.split(" ");

            // Recorremos cada código Morse
            for (String letra : letras) {

                // Buscamos la letra correspondiente en la tabla Morse
                resultado += MorseCode.get(letra);
            }

            // Agregamos un espacio entre palabras
            resultado += " ";
        }

        // Quitamos el último espacio
        return resultado.trim();
    }
}
}
