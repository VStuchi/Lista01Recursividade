package exercicio5;

public class Main {
	public static void main(String[] args) {
			Funcao f = new Funcao();
	        int N = 5; 
	        int M = 2; 
	        int resultado = f.valorPascal(N, M);
	        System.out.println("Valor na posição (" + N + ", " + M + ") do Triângulo de Pascal: " + resultado);
	}

}