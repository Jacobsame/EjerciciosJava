/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio20;

public class ejercicio20 {

    public static long[] productFib(long prod) {

        long a = 0;
        long b = 1;

        while (a * b < prod) {
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }

        return new long[]{a, b, a * b == prod ? 1 : 0};
    }
}