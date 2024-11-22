/**
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 5/10, 10/12, 15/14, 20/16, 25/18, 30/20
 * 
 */
import java.util.Scanner;
public class Ejercicio2_serienumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite , contador = 5 ;
        System.out.print("Dame limite: ");
        limite = tcl.nextInt();
        while (contador <= limite) {
            System.out.println(contador +"/" + (contador-5) + ",");
            contador = contador +5;
        }
    }
}