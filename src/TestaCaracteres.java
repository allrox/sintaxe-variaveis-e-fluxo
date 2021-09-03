
public class TestaCaracteres {

	public static void main(String[] args) {

//Utilizando variável do tipo char para armazenar um caractere. Destaque para o uso de aspas simples! 		
		char letra = 'a';
		System.out.println(letra);

//Utilizando variável do tipo char para armazenar um caractere através do seu respectivo número na tabela		
		char valor = 66;
		System.out.println(valor);
		
//Utilizando type casting para forçar a soma do caractere expresso na variável valor a um número inteiro 
		valor = (char) (valor + 250);
		System.out.println(valor);

//Combinando String + texto		
		String palavra = "Desenvolvido por FreelaEmCasa.";
		System.out.println("2020. Todos os direitos reservados. " + palavra);
				
	}
}
