package tiposDeExceptions.Throwable.Exception;

import java.util.Scanner;
public class LancandoExcecoes {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while (true) {
			
			try {
				System.out.println("Escreva Dois Números: ");
				divisao(scan.nextDouble(), scan.nextDouble());
				
			} 
			
			catch (IllegalArgumentException e) { //Aqui a gente pega(catch) a execao que a gente jogou
				System.out.println(e.getMessage()); //E aqui mostramos apenas a mensagem escrita com um Print
//		    e.printStackTrace(); //Podemos mostrar o erro completo, mas fica mais bonito apenas com a mensagem :D
			}
		}
	}

	public static void divisao(double num1, double num2) {
		
		if (num2 == 0) {
			throw new IllegalArgumentException("Passe um Valor Diferente de 0 Para o Numero2");
			//Para lancar uma excecao usamos o throw new e o nome da excecao
			//Mas por que "IllegalArgumentException"? porque o erro só acontece se o usúario passar um
			//Argumento(Argument) errado (illegal), ou seja, IllegalArgumentException.
		}
		
		System.out.println(num1 / num2);
		
	}
}