package exercicio5;

public class Funcao {
	public int valorPascal(int N, int M) {
        
        if (M == 0 || M == N) {
            return 1;
        }
        
        return valorPascal(N - 1, M - 1) + valorPascal(N - 1, M);
    }


}