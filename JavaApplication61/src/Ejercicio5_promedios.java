/*
 * Generar un programa Java que permita ingresar 4 estudiantes; 
 * por cada uno de ellos ingresar el nombre del estudiante, el promedio de ciclo.
 * Presentar el siguiente reporte
 * Estudiante 1	10	Aprobado
 * Estudiante 2	6.9	Reprobado
 * Estudiante 3	7	Aprobado
 * Estudiante 4	5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 */
import java.util.Scanner;
public class Ejercicio5_promedios {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombreEst, estado;
        double promedio, contador= 1;
        while (contador <=4){
            System.out.print("Dame nombre y promedio: ");
            nombreEst = tcl.next();
            promedio = tcl.nextDouble();
            estado = (promedio >= 7) ? "Aprobado" : "Reprobado"; //ahorra el tiempo de hacer if y el else
            System.out.println("Nombre\tPromedio\tEstado");
            System.out.println(nombreEst + "\t" + promedio + "\t" + estado);
            contador++;            
        }
    }
}