package exercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		FuncaoFib fib=new FuncaoFib();
		System.out.println("Escreva a casa de Fibonacci que deseja: ");
		int n=sc.nextInt();
		
		
		int r=fib.fib(n);
		System.out.println(r);
		
		
	}
}