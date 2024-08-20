package exercicio6;

import java.util.Scanner;

public class Funcao {
	Scanner sc=new Scanner(System.in);
	
	
	public void receber(int i,int [] vetor) {
		
		if(vetor.length<=i) {
			System.out.println("Recebido todos valores");
			
			int soma=0;
			int cont=0;
			int resultado=somar(soma,cont,vetor);
			System.out.println("A soma do vetores é:"+resultado);
			return;
		}
		
		
		System.out.println("Digite um numero: ");
		vetor[i]=sc.nextInt();
		i+=1;
		
		receber(i,vetor);	
	}
	
	public int somar(int soma,int cont,int []vetor) {
		
		int tamanhoVetor=vetor.length;
		if(tamanhoVetor>cont) {
			soma+=vetor[cont];
			cont+=1;
			return somar(soma,cont,vetor);
		}return soma;
		
	}
	
	

}