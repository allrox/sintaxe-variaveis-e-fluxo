import java.util.Scanner; //Importando a classe Scanner, para realizar a entrada de dados

public class AliquotaIR {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in); //instanciando e criando um objeto Scanner
		double salarioInformado;

		System.out.println("Analise de alíquota e dedução de IR ");
		//System.out.println("");

		System.out.println("Informe o salário: ");
		salarioInformado = ler.nextDouble();
		//double salario = 7000.0;
		double deducao;

		if (salarioInformado < 1903.98) {
			deducao = 0;
			System.out.println("Contribuinte classificado como isento.");
		} else if (salarioInformado <= 2826.65) {
			deducao = 142.80;
			System.out.println("Com base no salário de R$ " + salarioInformado + ","
					+ " sua alíquota é de 7,5% e você pode deduzir R$ " + deducao + " do IR.");
		} else if (salarioInformado <= 3751.05) {
			deducao = 354.80;
			System.out.println("Com base no salário de R$ " + salarioInformado + ","
					+ " sua alíquota é de 15%. e você pode deduzir R$ " + deducao + " do IR.");
		} else if (salarioInformado <= 4664.68) {
			deducao = 636.13;
			System.out.println("Com base no salário de R$ " + salarioInformado + ","
					+ " sua alíquota é de 22,5% e você pode deduzir R$ " + deducao + " do IR.");
		} else if (salarioInformado > 4664.68) {
			deducao = 869.36;
			System.out.println("Com base no salário de R$ " + salarioInformado + ","
					+ " sua alíquota é de 27,5% e você pode deduzir R$ " + deducao + " do IR.");
		}

	}
}