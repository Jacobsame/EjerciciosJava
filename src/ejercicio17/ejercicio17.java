/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17;

public class ejercicio17 {

    public static long ipsBetween(String start, String end) {
        return convertirIP(end) - convertirIP(start);
    }

    private static long convertirIP(String ip) {
        String[] partes = ip.split("\\.");

        long resultado = 0;

        for (String parte : partes) {
            resultado = resultado * 256 + Integer.parseInt(parte);
        }

        return resultado;
    }
}