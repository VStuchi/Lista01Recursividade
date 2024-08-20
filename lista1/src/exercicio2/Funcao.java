package exercicio2;

public class Funcao {
	
	public boolean ehPrimo(int numero) {
        
        if (numero < 2) {
            return false;
        }
        
        return ehPrimoRecursivo(numero, 2);
    }

    private boolean ehPrimoRecursivo(int numero, int divisor) {
      
        if (divisor > numero / 2) {
            return true;
        }
      
        if (numero % divisor == 0) {
            return false;
        }
     
        return ehPrimoRecursivo(numero, divisor + 1);
    }

}