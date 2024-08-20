package exercicio4;

public class Funcao {//
	
	public void calcularPotencia(int base,int expoente,int i,int resultado) {
		if(i<(expoente)) {
			resultado*=base;
			calcularPotencia(base,expoente,i+1,resultado);
		}else System.out.println("Resultado:"+resultado);
	}

}