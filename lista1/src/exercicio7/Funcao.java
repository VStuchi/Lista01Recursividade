package exercicio7;
public class Funcao {
	
	/*
	public void inverter(int vetor[],int vetorInvertido[],int i) {
		int posicaoVetor=0;
		if(vetor.length>i) {
			posicaoVetor=vetor[i];
			vetorInvertido[-(i+1)]=posicaoVetor;
			inverter(vetor,vetorInvertido,i+1);
		}
	}*/
	
	public void imprimir(int vetor[],int cont) {
		int tamanhoVetor=vetor.length;
		if(tamanhoVetor>cont) {
			
		System.out.print(vetor[tamanhoVetor-1-cont]+" ");
		imprimir(vetor,cont+1);
		
		
		}
	}
	

}