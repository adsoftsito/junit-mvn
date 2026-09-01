/*
 *
 */

public class Factorial {
    // 
    public static long calcular(int n) {
        // 
        long resultado = 1;
        if (n < 0)
	   resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }
}
