package EjercicioBasico3;

import java.util.Scanner;

public class Principal {
    public void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = teclado.nextInt();
        System.out.println("Introduce el tercer número: ");
        int num3 = teclado.nextInt();

        int a = num1;
        int b = num2;
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        int mcd12 = a;

        int x = mcd12;
        int y = num3;
        while (y != 0) {
            int resto = x % y;
            x = y;
            y = resto;
        }
        int mcdFinal = x;

        int mcm12 = (num1 * num2) / mcd12;

        int x2 = mcm12;
        int y2 = num3;
        while (y2 != 0) {
            int resto = x2 % y2;
            x2 = y2;
            y2 = resto;
        }
        int mcdMcm = x2;
        int mcmFinal = (mcm12 * num3) / mcdMcm;

        System.out.println("\n--- Resultados ---");
        System.out.println("El Máximo Común Divisor (MCD) es: " + mcdFinal);
        System.out.println("El Mínimo Común Múltiplo (MCM) es: " + mcmFinal);
    }
}