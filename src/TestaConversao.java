
public class TestaConversao {

//O primeiro exemplo mostra a t�cnica de type casting, que solicita ao java a convers�o do valor mais � direira. 	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
//vari�vel para n�meros de 64 bits, n�meros longos.		
		long numeroGrande = 12312231235354123l;
		System.out.println(numeroGrande);
	
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);

//Resultado da mesma opera��o usando casting;
		System.out.println((int)total);
		
	}
}
