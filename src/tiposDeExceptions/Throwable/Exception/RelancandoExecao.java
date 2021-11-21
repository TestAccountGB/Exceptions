package tiposDeExceptions.Throwable.Exception;

import java.io.File;
import java.io.IOException;

public class RelancandoExecao {
	public static void main(String[] args) throws IOException{
		// Temos 2 jeitos de relancar uma excecao, que depende do tipo da excecao se ela
		// � checked ou unchecked
		
		try {
			criarArquivo2();
		} catch (IOException e) {
			System.out.println("Tratamento Alternativo da Pessoa Que Chamou");
			e.printStackTrace();
		}
		
		criarArquivo(); //Como podemos ver ali embaixo ele joga a exececao pra gente, mas como o m�todo Main � o
		//Ultimo a receber, n�o � recomend�vel que bote o "throws" la em cima, porque � ruim deixar sem
		//Tratamento, estou fazendo isso, apenas pra mostrar que o m�todo main pode relancar o codigo e ficar sem
		//O tratamento.
		
		
		divisao(10, 2); //N�o precisamos tratar porque se trata de uma Unchecked/Runtime Exception, mas � sempre
		//Bom trata-la
		
	}
	
	
	
	
	

	// Checked Exception
	private static void criarArquivo() throws IOException {
		File file = new File("Arquivo.txt");

		System.out.println("?: " + file.createNewFile()); // Como podemos ver, clicando no m�todo, ele lan�a o m�todo
		// Pra a gente tratar, mas a gente pode relancar ele e quem ta chamando usar o
		// try e catch para tratar.

	}

	private static void criarArquivo2() throws IOException { // Precisamos usar o "throws" aqui para relancar
		// Ou pedemos relancar e ao mesmo tempo trata-la, a gente faz o nosso tratamento
		// e quem chamar pode fazer
		// O dele

		// Relancando e Tratando...
		try {
			File file2 = new File("");
			System.out.println("?: " + file2.createNewFile());
		} catch (IOException e) {
			System.out.println("Tratamento no M�todo");
			e.printStackTrace();
			throw e; // Relancando a variavel de referencia, nao precisamos usar o new, porque o java cria o objeto
			// Automaticamente. Fizemos nosso tratamento, mas deixamos a possibilidade da pessoa fazer o dela.
		}
	}
	
	//Unchecked Exeption
	
	private static void divisao(double num1, double num2) {
		if(num2 == 0) {
			throw new IllegalArgumentException("Mude o N�mero de num2");
		}
		System.out.println(num1/num2);
	}
}
