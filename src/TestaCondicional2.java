
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais, critérios de admissão.");
		System.out.println("....................................................");
		System.out.println("");

//Entrada da Idade, quantidade e idade do acompanhante responsável, classificação etária do evento.
		int idade = 16;
		int acompanhante = 1;
		int idadeAcompanhante = 17;
		int classificacao = 18;
		
//		Teste booleano para julgar a classificação em true ou false.
boolean responsavelLegal = idadeAcompanhante >= classificacao;
		
//Teste lógico dos dados de entrada. Entrada livre para maiores de (classificação etária) ou menores acompanhados de representante conforme a classificação indicada.
		if (idade >= classificacao || (acompanhante >=1 && responsavelLegal)) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Entrada não permitida. Classificação " + classificacao + " anos.");
		}
	}
}
