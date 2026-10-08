/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;
public class ejercicio12 {

    public String solution(int n) {
        int[] valores = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] romanos = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        String resultado = "";

        for (int i = 0; i < valores.length; i++) {

            while (n >= valores[i]) {
                resultado += romanos[i];
                n -= valores[i];
            }

        }

        return resultado;
    }
}