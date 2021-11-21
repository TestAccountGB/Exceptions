package tiposDeExceptions.Throwable.Exception.RuntimeException;

public class StringIndexOutOfBoundsException {
	public static void main(String[] args) {
		//Quando erramos o index em uma String;
		
		String oi = "oi";
		
		System.out.println(oi.charAt(0));
		System.out.println(oi.charAt(1));
		System.out.println(oi.charAt(2));
		
	}
}