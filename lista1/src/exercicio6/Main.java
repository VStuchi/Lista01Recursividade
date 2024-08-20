package exercicio6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor:");
		int lenght=sc.nextInt();
		int[]vetor=new int[lenght];
		
	
		Funcao e=new Funcao();
		e.receber(0,vetor);
		
		
		
	}
}