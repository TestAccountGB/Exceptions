package tiposDeExceptions.Throwable.Exception.RuntimeException;

public class NullPointerException {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		//Exceção ocorre quando a gente tenta chamar algo de um objeto vazio
		
		Object o = null;
		
		System.out.println(o.toString());
		
	}
}