package tiposDeExceptions.Throwable.Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {

	@SuppressWarnings("null")
	public static void readerComTry() {
		//Olha o tamanho dessa porinha, a gente tem usar Try e Catch para usa-lo e depois mais outro para fecha-lo, mas
		//Não tem como ser mais simples? Claro que tem amigo
		
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("text.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader == null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void readerComTryMelhorado() {
		//Para usar o TryWithResources só precisas abrir um parenteses no try e botar o nosso recurso lá.
		//Obs.: Só podemos botar recursos dentro dos parenteses se eles implementam a interface "Closeable",
		//Como o Scanner e o Reader
		
		try (Reader reader = new BufferedReader(new FileReader("text.txt"));) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Look the diference amigo, também funciona com o Scanner, ou seja, se for usar Scanner em um try e catch, usa
		//O TryWithResources, porque é sempre bom fechar o Scanner, eu sei que voce nao fecha seu vagabundo.
		
		//Ele executa o metodo "close" automaticamente, ou seja, ele fecha o recurso pra gente :D
		
		//Scanner:
		
		try(Scanner scan = new Scanner(System.in)){
			String oi = scan.next();
			System.out.println(oi);
		} catch(InputMismatchException e) {
			e.printStackTrace();
		}
	}
}