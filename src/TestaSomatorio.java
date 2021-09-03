
public class TestaSomatorio {

	public static void main(String[] args) {
		
		int contador = 0;
		int total = 0;
		
		while (contador <=10) {	
			
			// total += equivale a (total + ele mesmo + o próximo argumento)
			total += contador;
			
			// contador ++ equivale a (contador + 1)
			contador ++;
			
			System.out.println("total: " + total + " contador: " + contador);
			
		}
		
	}
}
