
public class ForMultiplosDeTres {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {

			// i % x == 0 retorna verdadeiro SE um n�mero (i) dividido por x for igual a 0
			// sem resto na opera��o
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
