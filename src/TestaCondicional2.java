
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais, crit�rios de admiss�o.");
		System.out.println("....................................................");
		System.out.println("");

//Entrada da Idade, quantidade e idade do acompanhante respons�vel, classifica��o et�ria do evento.
		int idade = 16;
		int acompanhante = 1;
		int idadeAcompanhante = 17;
		int classificacao = 18;
		
//		Teste booleano para julgar a classifica��o em true ou false.
boolean responsavelLegal = idadeAcompanhante >= classificacao;
		
//Teste l�gico dos dados de entrada. Entrada livre para maiores de (classifica��o et�ria) ou menores acompanhados de representante conforme a classifica��o indicada.
		if (idade >= classificacao || (acompanhante >=1 && responsavelLegal)) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Entrada n�o permitida. Classifica��o " + classificacao + " anos.");
		}
	}
}
