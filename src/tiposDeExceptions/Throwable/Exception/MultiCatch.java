package tiposDeExceptions.Throwable.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Vamos se dizer que eu quero pegar varias exececoes e trata-las do mesmo jeito, ai que vem o Multi-Catch, que ao
		//Inves de escrever o tratamento de uma por uma vo poder tratar todas de vez
		
		String erroGenerico = "Deu Erro Pora";
		
//		try {
//			teste(scan.nextInt());
//
//		} catch (IllegalArgumentException e) {
//			System.out.println(erroGenerico);
//		} catch (InputMismatchException e) {
//			System.out.println("Digite um Número Pora");
//		} catch (ArithmeticException e) {
//			System.out.println(erroGenerico);
//		}
		
		//Como podemos ver, eu repiti o tratamento em dois blocos. Com o Multi-Catch posso escrever em um
		
		try {
			teste(scan.nextInt());
			
		} catch(IllegalArgumentException | ArithmeticException e){
			System.out.println(erroGenerico);
		} catch(InputMismatchException e) {
			System.out.println("Digite um Número Pora");
		}
		
		//As excecoes que voce quer da o mesmo tratamento é so colocar UMA barra vertical.
		
//		try {
//			System.out.println("Oi");
//		} catch(ArrayIndexOutOfBoundsException | IndexOutOfBoundsException e) {
//			System.out.println("Foda");
//		}
		
		//A unica coisa que nao podemos fazer e botar uma excecao que seja sub-classe da outra.
		
		//As boas praticas dizem para voce deixar a excecao mais generica, ou seja, a "IndexOutOfBoundsException".
	}

	public static void teste(int num1) throws InputMismatchException {

		if (num1 > 100) {
			throw new IllegalArgumentException();
		}
		
		System.out.println(num1 / 0);
		
	}
	
	//Obs.: Em try que usam metodos, e quando quisermos dar o mesmo tratamento a varias excecoes desse metodo
	//Podemos usar "catch(Exception e)", se a gente usar isso em um try que nao quer tratar um metodo, ele vai puxar
	//Todas as excecoes possiveis, mas como a gente ta usando apenas para tratar um metodo, ele vai puxar todas as
	//Execoes do metodo, ou seja, podemos escrever do jeito que está abaixo:
	
//	try {
//		teste(scan.nextInt());
//		
//	} catch(InputMismatchException e) {
//		System.out.println("Digite um Número Pora");
//	} catch(Exception e){
//	System.out.println(erroGenerico);
//}
	
	//Obs.: Sempre deixe a excecao mais generica em baixo
}