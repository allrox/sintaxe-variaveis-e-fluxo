
public class TesteVT {

	public static void main(String[] args) {
		System.out.println("-------------------------------------");
		System.out.println("|   Análise de solicitação de VR    | ");
		System.out.println("-------------------------------------");
		System.out.println("");
		double salario = 2300;
		double vt = 360;
		
		if (vt >= (salario * 0.06)) {
			System.out.println("De acordo com o limite legal de 6%, seu desconto de Vale Transporte é de R$ " + salario * 0.06);
		} else { 
			System.out.println("De acordo com o limite legal de 6%, seu desconto de Vale Transporte é de R$ " + vt);
		}
		
	}
}
