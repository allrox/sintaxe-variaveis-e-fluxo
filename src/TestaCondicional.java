
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais, crit�rios de admiss�o.");
		int idade = 15;
		int acompanhantes = 0;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem-vindo");
			
		} else {
			if (acompanhantes >= 1) {
			System.out.println("Entrada permitida com acompanhante.");
			}	else {
				System.out.println("Entrada n�o permitida sem acompanhantes!");
			}
		}
	}
}
