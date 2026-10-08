/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio18;

public class ejercicio18 {

    public static String formatDuration(int seconds) {

        if (seconds == 0) {
            return "now";
        }

        int years = seconds / 31536000;
        seconds %= 31536000;

        int days = seconds / 86400;
        seconds %= 86400;

        int hours = seconds / 3600;
        seconds %= 3600;

        int minutes = seconds / 60;
        seconds %= 60;

        String[] partes = new String[5];
        int cantidad = 0;

        if (years > 0) {
            partes[cantidad++] = years + (years == 1 ? " year" : " years");
        }

        if (days > 0) {
            partes[cantidad++] = days + (days == 1 ? " day" : " days");
        }

        if (hours > 0) {
            partes[cantidad++] = hours + (hours == 1 ? " hour" : " hours");
        }

        if (minutes > 0) {
            partes[cantidad++] = minutes + (minutes == 1 ? " minute" : " minutes");
        }

        if (seconds > 0) {
            partes[cantidad++] = seconds + (seconds == 1 ? " second" : " seconds");
        }

        if (cantidad == 1) {
            return partes[0];
        }

        String resultado = "";

        for (int i = 0; i < cantidad; i++) {

            if (i == cantidad - 1) {
                resultado += " and " + partes[i];
            } else {
                if (i > 0) {
                    resultado += ", ";
                }

                resultado += partes[i];
            }
        }

        return resultado;
    }
}