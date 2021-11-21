package tiposDeExceptions.Throwable.Exception.RuntimeException;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		
		int[] array = new int[2];
		
		System.out.println(array[2]);
		
		//Erro de quando a gente tenta pegar algum valor pelo index de um objeto, mas digitamos um index invalido
	}
}
