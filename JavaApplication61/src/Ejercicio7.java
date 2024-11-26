/*
 * Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1) + (1/2) - (1/3) + (1/4) - (1/5) + (1/6) - (1/7) + (1/8) - (1/9) + (1/10)
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        double sumatoria = 0;

        // Generar la sumatoria con los signos alternos
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {  // Si el índice es par (2, 4, 6, 8, 10), es positivo
                sumatoria += 1.0 / i;
            } else {  // Si el índice es impar (1, 3, 5, 7, 9), es negativo
                sumatoria -= 1.0 / i;
            }
        }

        // Imprimir el resultado
        System.out.println("La sumatoria es: " + sumatoria);
    }
}
