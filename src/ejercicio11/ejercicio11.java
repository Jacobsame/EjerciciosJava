/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

public class ejercicio11 {

    public static String expandedForm(int num) {
        String numero = String.valueOf(num);
        String resultado = "";

        for (int i = 0; i < numero.length(); i++) {
            char digito = numero.charAt(i);

            if (digito != '0') {
                int valor = (digito - '0') * (int) Math.pow(10, numero.length() - 1 - i);

                if (!resultado.isEmpty()) {
                    resultado += " + ";
                }

                resultado += valor;
            }
        }

        return resultado;
    }
}