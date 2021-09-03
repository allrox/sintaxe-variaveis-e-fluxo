
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais, critérios de admissão.");
		int idade = 15;
		int acompanhantes = 0;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem-vindo");
			
		} else {
			if (acompanhantes >= 1) {
			System.out.println("Entrada permitida com acompanhante.");
			}	else {
				System.out.println("Entrada não permitida sem acompanhantes!");
			}
		}
	}
}
