
public class AliquotaIR {

	public static void main(String[] args) {

		System.out.println("Análise de alíquota e dedução de IR ");
		System.out.println("");

		double salario = 7000.0;
		double deducao;

		if (salario < 1903.98) {
			deducao = 0;
			System.out.println("Contribuinte classificado como isento.");
		} else if (salario <= 2826.65) {
			deducao = 142.80;
			System.out.println("Com base no salário de R$ " + salario + ","
					+ " sua alíquota é de 7,5% e você pode deduzir R$ " + deducao + " do IR.");
		} else if (salario <= 3751.05) {
			deducao = 354.80;
			System.out.println("Com base no salário de R$ " + salario + ","
					+ " sua alíquota é de 15%. e você pode deduzir R$ " + deducao + " do IR.");
		} else if (salario <= 4664.68) {
			deducao = 636.13;
			System.out.println("Com base no salário de R$ " + salario + ","
					+ " sua alíquota é de 22,5% e você pode deduzir R$ " + deducao + " do IR.");
		} else if (salario > 4664.68) {
			deducao = 869.36;
			System.out.println("Com base no salário de R$ " + salario + ","
					+ " sua alíquota é de 27,5% e você pode deduzir R$ " + deducao + " do IR.");
		}

	}
}