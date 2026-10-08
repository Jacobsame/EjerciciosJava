/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

public class ejercicio14 {

    public static int countBits(int n) {
        int contador = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                contador++;
            }

            n /= 2;
        }

        return contador;
    }
}