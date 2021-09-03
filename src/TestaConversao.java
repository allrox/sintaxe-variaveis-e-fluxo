
public class TestaConversao {

//O primeiro exemplo mostra a técnica de type casting, que solicita ao java a conversão do valor mais à direira. 	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
//variável para números de 64 bits, números longos.		
		long numeroGrande = 12312231235354123l;
		System.out.println(numeroGrande);
	
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);

//Resultado da mesma operação usando casting;
		System.out.println((int)total);
		
	}
}
