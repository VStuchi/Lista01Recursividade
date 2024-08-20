package exercicio1;

public class Funcao {

	public int hiperfatorial(int n) {
        
        if (n == 0) {
            return 1;
        } else {
           return potencia(n, n) * hiperfatorial(n - 1);
        }
    }

   
    private int potencia(int n, int m) {
        if (m == 0) {
            return 1;
        } else {
            return n * potencia(n, m - 1);
        }
    }

}

