
public class AliquotaIR {

	public static void main(String[] args) {

		System.out.println("An�lise de al�quota e dedu��o de IR ");
		System.out.println("");

		double salario = 7000.0;
		double deducao;

		if (salario < 1903.98) {
			deducao = 0;
			System.out.println("Contribuinte classificado como isento.");
		} else if (salario <= 2826.65) {
			deducao = 142.80;
			System.out.println("Com base no sal�rio de R$ " + salario + ","
					+ " sua al�quota � de 7,5% e voc� pode deduzir R$ " + deducao + " do IR.");
		} else if (salario <= 3751.05) {
			deducao = 354.80;
			System.out.println("Com base no sal�rio de R$ " + salario + ","
					+ " sua al�quota � de 15%. e voc� pode deduzir R$ " + deducao + " do IR.");
		} else if (salario <= 4664.68) {
			deducao = 636.13;
			System.out.println("Com base no sal�rio de R$ " + salario + ","
					+ " sua al�quota � de 22,5% e voc� pode deduzir R$ " + deducao + " do IR.");
		} else if (salario > 4664.68) {
			deducao = 869.36;
			System.out.println("Com base no sal�rio de R$ " + salario + ","
					+ " sua al�quota � de 27,5% e voc� pode deduzir R$ " + deducao + " do IR.");
		}

	}
}