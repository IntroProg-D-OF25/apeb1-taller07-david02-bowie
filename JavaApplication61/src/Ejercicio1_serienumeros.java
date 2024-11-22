/*
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 1/10, 2/11, 3/12, 4/13, 5/14, 6/15
 */
import java.util.Scanner;
public class Ejercicio1_serienumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite, contador = 1;
        System.out.print("Dame limite: ");
        limite = tcl.nextInt();
        while (contador <= limite) {
            System.out.println(contador +"/" + (contador+9) + ",");
            contador++;
        }
    }
}