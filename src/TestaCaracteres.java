
public class TestaCaracteres {

	public static void main(String[] args) {

//Utilizando vari�vel do tipo char para armazenar um caractere. Destaque para o uso de aspas simples! 		
		char letra = 'a';
		System.out.println(letra);

//Utilizando vari�vel do tipo char para armazenar um caractere atrav�s do seu respectivo n�mero na tabela		
		char valor = 66;
		System.out.println(valor);
		
//Utilizando type casting para for�ar a soma do caractere expresso na vari�vel valor a um n�mero inteiro 
		valor = (char) (valor + 250);
		System.out.println(valor);

//Combinando String + texto		
		String palavra = "Desenvolvido por FreelaEmCasa.";
		System.out.println("2020. Todos os direitos reservados. " + palavra);
				
	}
}
