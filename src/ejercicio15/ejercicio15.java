/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

public class ejercicio15 {

    public static int findIt(int[] a) {
        int resultado = 0;

        for (int numero : a) {
            resultado ^= numero;
        }

        return resultado;
    }
}
