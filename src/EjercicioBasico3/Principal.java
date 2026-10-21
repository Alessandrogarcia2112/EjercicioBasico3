package EjercicioBasico3;

import java.util.Scanner;

public class Principal {
    public void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("MCM y MCD de 3 números");
        System.out.println("Introduce el primer número: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = teclado.nextInt();
        System.out.println("Introduce el tercer número: ");
        int num3 = teclado.nextInt();

        int menor = num1;
        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;

        int mcd = 1;
        for (int i = 1; i <= menor; i++) {
            if (num1 % i == 0 && num2 % i == 0 && num3 % i == 0) {
                mcd = i;
            }
        }

        int mayor = num1;
        if (num2 > mayor) mayor = num2;
        if (num3 > mayor) mayor = num3;

        int mcm = mayor;
        while (mcm % num1 != 0 || mcm % num2 != 0 || mcm % num3 != 0) {
            mcm = mcm +1;
        }
        System.out.println("El Máximo Común Divisor es: " + mcd);
        System.out.println("El Mínimo Común Múltiplo es: " + mcm);
    }
}