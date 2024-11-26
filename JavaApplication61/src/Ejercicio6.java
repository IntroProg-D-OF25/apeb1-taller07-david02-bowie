/*
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente:
 * - Cliente tipo 1: descuento del 10%
 * - Cliente tipo 2: descuento del 20%
 * - Otro tipo de cliente: sin descuento.
 *
 * Generar un proceso que permita ingresar 7 ventas. Por cada venta, preguntar los siguientes datos:
 * - Nombre del cliente
 * - Costo de la computadora
 * - Tipo de cliente
 *
 * Al final, presentar un reporte con el siguiente formato:
 * Cliente tipo 1, compra computadora con precio $100
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String reporte = "Reporte de Ventas:\n";
        int numeroVentas = 7;

        for (int i = 1; i <= numeroVentas; i++) {
            // Solicitar datos de la venta
            System.out.println("Venta #" + i);
            System.out.print("Nombre del cliente: ");
            String nombreCliente = tcl.nextLine();

            System.out.print("Costo de la computadora: ");
            double costoComputadora = tcl.nextDouble();

            System.out.print("Tipo de cliente (1, 2, otro): ");
            int tipoCliente = tcl.nextInt();
            tcl.nextLine(); // Consumir salto de línea sobrante

            // Calcular el descuento según el tipo de cliente
            double descuento = 0;
            if (tipoCliente == 1) {
                descuento = costoComputadora * 0.10;
            } else if (tipoCliente == 2) {
                descuento = costoComputadora * 0.20;
            }

            // Calcular precio final después del descuento
            double precioFinal = costoComputadora - descuento;

            // Acumular en el reporte
            reporte += String.format("%s, cliente tipo %d, compra computadora con precio final $%.2f\n",
                    nombreCliente, tipoCliente, precioFinal);
        }

        // Mostrar el reporte final
        System.out.println("\n" + reporte);
    }
}
