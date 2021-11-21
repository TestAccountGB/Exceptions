package tiposDeExceptions.Throwable.Exception.RuntimeException;

public class ArithmeticException {
	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		if (b != 0) {
			int c = a / b;
			System.out.println(c);
		}
		
		// Erro relacionado com números.
		// Aqui o erro foi tentar dividir por 0 ._.
	}
}