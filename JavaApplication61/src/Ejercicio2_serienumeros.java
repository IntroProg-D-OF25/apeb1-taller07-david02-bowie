/*Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
	5/10
	10/12
	15/14
	20/16
	25/18
	30/20
*/
import java.util.Scanner;
public class Ejercicio2_serienumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Cuántos números quieres que aparezcan?");
        int limite = tcl.nextInt();

        int numerador = 5;
        int denominador = 10;
        int contador = 1;

        while (contador <= limite) {
            System.out.print(numerador + "/" + denominador);
            if (contador < limite) {
                System.out.print(", "); // Para no poner coma después del último número
            }
            numerador = numerador + 5;
            denominador = denominador + 2;
            contador = contador + 1;
        }

        
    }
}
