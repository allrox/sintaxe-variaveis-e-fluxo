
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais, crit�rios de admiss�o.");
		System.out.println("....................................................");
		System.out.println("");

//Entrada da Idade, quantidade e idade do acompanhante respons�vel, classifica��o et�ria do evento.
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

//Teste l�gico dos dados de entrada. Entrada livre para maiores de (classifica��o et�ria) ou menores acompanhados de representante conforme a classifica��o indicada.
		if (idade >= classificacao || (acompanhado && responsavelLegal)) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Entrada n�o permitida. Classifica��o " + classificacao + " anos.");
		}
	}
}
