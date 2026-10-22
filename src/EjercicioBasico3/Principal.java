package EjercicioBasico3;

import java.util.Scanner;

public class Principal {
    public void main() {
        Calculos calculos = new Calculos();
        Scanner teclado = new Scanner(System.in);
        System.out.println("MCM y MCD de 3 números");
        System.out.println("Introduce el primer número: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = teclado.nextInt();
        System.out.println("Introduce el tercer número: ");
        int num3 = teclado.nextInt();
        int mcd = calculos.obtenerMCD(num1, num2, num3);
        int mcm = calculos.obtenerMCM(num1, num2, num3);
        System.out.println("El Máximo Común Divisor es: " + mcd);
        System.out.println("El Mínimo Común Múltiplo es: " + mcm);
    }
}