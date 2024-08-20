package exercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o numero que deseja para ser a base: ");
		int base=sc.nextInt();
		System.out.println("Digite o expoente: ");
		int expoente=sc.nextInt();
		
		
		Funcao fu=new Funcao();
		int resultado=1;
		fu.calcularPotencia(base, expoente, 0,resultado);
		
	}
}