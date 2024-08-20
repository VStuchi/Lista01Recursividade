package exercicio8;

import java.util.Scanner;

public class Funcao {
	
	public int sucessor(int x) {
		return x+1;
	}
	
	
	public int predecessor(int y) {
		return y-1;
	}
	
	public void somar(int x,int y) {
		if(y==0) {
			System.out.printf("A soma é igual a:%d",x);
			return;
		}
		 somar(sucessor(x),predecessor(y));
	}
	
	

}