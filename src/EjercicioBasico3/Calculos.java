package EjercicioBasico3;

public class Calculos {
    public int obtenerMCD(int num1, int num2, int num3) {
        int menor = num1;
        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;

        int mcd = 1;
        for (int i = 1; i <= menor; i++) {
            if (num1 % i == 0 && num2 % i == 0 && num3 % i == 0) {
                mcd = i;
            }
        }
        return mcd;
    }

    public int obtenerMCM(int num1, int num2, int num3) {
        int mayor = num1;
        if (num2 > mayor) mayor = num2;
        if (num3 > mayor) mayor = num3;

        int mcm = mayor;
        while (mcm % num1 != 0 || mcm % num2 != 0 || mcm % num3 != 0) {
            mcm = mcm + 1;
        }
        return mcm;
    }
}
