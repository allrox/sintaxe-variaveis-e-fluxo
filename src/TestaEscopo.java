
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais, critérios de admissão.");
		System.out.println("....................................................");
		System.out.println("");

//Entrada da Idade, quantidade e idade do acompanhante responsável, classificação etária do evento.
		int idade = 17;
		int idadeAcompanhante = 0;
		int classificacao = 17;
		boolean responsavelLegal = idadeAcompanhante >= classificacao;
		boolean acompanhado;

		if (idadeAcompanhante > 0) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

//Teste lógico dos dados de entrada. Entrada livre para maiores de (classificação etária) ou menores acompanhados de representante conforme a classificação indicada.
		if (idade >= classificacao || (acompanhado && responsavelLegal)) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Entrada não permitida. Classificação " + classificacao + " anos.");
		}
	}
}
