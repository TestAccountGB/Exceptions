package tiposDeExceptions.Throwable.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeMultiplasExcecoes {
	private static int[] array = new int[2];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Imagine que a gente tenha um método que possa causar varias excecoes, como
		// uma excecao de Index, ou uma
		// De argumento invalido.
		
		//A vantagem de usar excecao ao inves
		
		while (true) {
			try {
				colocarValorEmArray();
				System.out.println("Sucesso!");
			} catch (ArrayIndexOutOfBoundsException e) {//Tratamento caso o usuario digite um index inválido.
				System.out.println("Index Inválido");
				
			} catch (IllegalArgumentException e) { //Tratamento caso o usuario digite um número maior que 100.
				System.out.println(e.getMessage());
				
			} catch (InputMismatchException e) { //Tratamento caso o usuario digite algo que nao seja um numero.
				System.out.println("ERRO 404! Você Não Colocou um Número");
				System.out.println("Tente Novamente...");
				scan.next(); //Botamos um scanner aqui, porque se nao o codigo fica em loop, ai quando botamos o scanner
				//Aqui, esse valor que ficava em loop e jogado dentro desse scanner vazio, reiniciando o codigo normal.
				
			} finally {
				System.out.println("Teste Bloco Finally ._.\n");//Como podemos ver, o bloco finally é executado em todas as
				//Situacoes
			}
		}
		
		//Obs.: Se tivermos varias execoes filhas da mesma classe, temos que botar as mais especificas primeiro, e
		//So final botar as mais genericas como: RuntimeException e Exception.
		
		//Como podemos ver, fizemos diversos tratamentos em um só try e catch

	}

	public static void colocarValorEmArray() throws ArrayIndexOutOfBoundsException, InputMismatchException{ 
		//Nao precisa usar o throws "IllegalArgumentException" porque a gente joga ele dentro do metodo.
		
		System.out.println("Coloque o Index: ");
		int index = scan.nextInt();
		
		System.out.println("Coloque o Valor (Menor que 101): ");
		int num1 = scan.nextInt();
			
		if (num1 > 100) {
			throw new IllegalArgumentException("Coloque um Número Menor Que 100\n"); //O IllegalArgumentException,
			//A gente mesmo joga ele, quando acharmos necessario.
		}
		
		array[index] = num1;
		System.out.println("Index Colocado: " + index + ", Valor Colocado: " + num1 + "\n");
	}
}

//Imagina fazer um codigo desse usando if e else? Ia ficar gigante, para isso que tem as excecoes
