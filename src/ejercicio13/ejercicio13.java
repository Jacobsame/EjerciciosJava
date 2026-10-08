/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

import java.util.Map;

public class ejercicio13 {

    public static int cakes(Map<String, Integer> recipe,
                            Map<String, Integer> available) {

        int minimo = Integer.MAX_VALUE;

        for (String ingrediente : recipe.keySet()) {

            int necesario = recipe.get(ingrediente);
            int disponible = available.getOrDefault(ingrediente, 0);

            int cantidad = disponible / necesario;

            if (cantidad < minimo) {
                minimo = cantidad;
            }
        }

        return minimo;
    }
}