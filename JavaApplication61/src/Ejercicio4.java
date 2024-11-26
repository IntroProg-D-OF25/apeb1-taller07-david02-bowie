/*
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * - Nombre del jugador
 * - Posición en el campo de juego
 * - Edad
 * - Estatura
 *
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. 
 * Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 *
 * Ejemplo:
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * ...
 * Promedio de edades: 26.8
 * Promedio de estaturas: 1.87
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String reporte = "Listado de Jugadores\n";
        int contador = 0;
        double sumaEdades = 0;
        double sumaEstaturas = 0;
        String continuar;

        do {
            // Solicitar datos del jugador
            System.out.print("Nombre del jugador: ");
            String nombre = tcl.nextLine();

            System.out.print("Posición en el campo de juego: ");
            String posicion = tcl.nextLine();

            System.out.print("Edad: ");
            int edad = tcl.nextInt();

            System.out.print("Estatura (en metros): ");
            double estatura = tcl.nextDouble();

            tcl.nextLine(); // Consumir el salto de línea sobrante

            // Acumular datos del jugador en el reporte
            contador++;
            reporte += String.format("%d. %s -%s-, edad %d, estatura %.2f\n",
                    contador, nombre, posicion, edad, estatura);

            // Acumular para los promedios
            sumaEdades += edad;
            sumaEstaturas += estatura;

            // Preguntar si desea continuar
            System.out.print("¿Desea ingresar otro jugador? (s/n): ");
            continuar = tcl.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        // Calcular promedios
        double promedioEdades = sumaEdades / contador;
        double promedioEstaturas = sumaEstaturas / contador;

        // Agregar promedios al reporte
        reporte += String.format("Promedio de edades: %.1f\n", promedioEdades);
        reporte += String.format("Promedio de estaturas: %.2f\n", promedioEstaturas);
    }
}
