package tiposDeExceptions.Throwable.Exception.RuntimeException;

public class ClassCastException {
	public static void main(String[] args) {
		
		Object i = Integer.valueOf(42);
		@SuppressWarnings("unused")
		String s = (String)i;
		
		//Cast em dados tipo classe, só podemos usar quando uma é subclasse de outra.
		//Vai dar erro, porque só poderiamos usar o cast aqui, se String fosse subclasse de Integer.
	}
}