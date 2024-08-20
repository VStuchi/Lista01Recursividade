package exercicio3;

public class FuncaoFib {
	
	int fib=0;
	public int fib(int n) {
		if(n==1) {
			return 1;
				 }
		else if(n==0) {
			return 0;}
		else {
			fib=fib(n-2)+fib(n-1);
			return fib;
		}
		
		
		
		}

}