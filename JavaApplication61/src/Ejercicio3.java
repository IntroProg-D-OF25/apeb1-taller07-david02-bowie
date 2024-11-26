/*
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. 
 * Por cada empleado se debe solicitar el nombre, número de días trabajados y costo del día trabajo. 
 * Calcular el valor a cancelar por la empresa para cada empleado. 
 * Presentar un reporte como el siguiente:
 *
 * Nombre 1	10	$2.5	$25
 * Nombre 2	11	$2	$22
 * Nombre 3	9	$3	$27
 * Nombre 4	5	$4	$20
 * Nombre 5	12	$2	$24
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 1;
        int numeroEmpleados = 5;

        System.out.println("REPORTE DE EMPLEADOS");
        System.out.println("Nombre\tDías\tCosto Día\tTotal");

        while (contador <= numeroEmpleados) {
            System.out.println("Empleado " + contador + ":");

            // Pedir nombre del empleado
            System.out.print("Nombre: ");
            String nombre = tcl.next();

            // Pedir número de días trabajados
            System.out.print("Número de días trabajados: ");
            int diasTrabajados = tcl.nextInt();

            // Pedir costo por día trabajado
            System.out.print("Costo por día: ");
            double costoDia = tcl.nextDouble();

            // Calcular total a pagar
            double totalPagar = diasTrabajados * costoDia;

            // Mostrar reporte del empleado
            System.out.println(nombre + "\t" + diasTrabajados + "\t$" + costoDia + "\t$" + totalPagar);

            contador++;
        }
    }
}
