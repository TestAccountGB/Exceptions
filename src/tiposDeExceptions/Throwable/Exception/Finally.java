package tiposDeExceptions.Throwable.Exception;

public class Finally {
	public static void main(String[] args) {

		// Vamos se dizer que eu crie um progama que ele abri um arquivo, lê ele e também escreve e no final ele 
		//Feche o arquivo. Mas imagine que dê um erro em ler o arquivo, ele vai conseguir fechar e vai continuar 
		//Aberto consumindo memoria. Para situações como essas existe o bloco Finally, que basicamente
		//Executa o codigo mesmo se der erro no meio do bloco Try..

		lerArquivo();

		System.out.println("\nCom Erro...\n");

		lerArquivoErro();
		
		System.out.println("\nCom Return...\n");
		
		lerArquivoReturn();
	}

	public static void lerArquivo() {
		try {
			System.out.println("Abrindo o Arquivo...");
			System.out.println("Lendo o Arquivo...");
			System.out.println("Escrevendo no Arquivo...");
			// System.out.println("Fechando o Arquivo...");
			
			//Podemos usar o comando de fechar o arquivo nos dois blocos (Try,Catch), Mas vamos estar escrevendo o 
			//Mesmo codigo duas vezes imagina se ele for grande?
			 //Consequentemente consumindo ainda mais memória
			
		} catch (Exception e) {
			System.out.println("Dentro do catch"); 
			// System.out.println("Fechando o Arquivo...");
			e.printStackTrace();
		} finally {
			System.out.println("Fechando o Arquivo...");
		}

	}

	public static void lerArquivoErro() {
		try {
			System.out.println("Abrindo o Arquivo...");
			System.out.println("Lendo o Arquivo...");
			System.out.println("Escrevendo no Arquivo...");
			
			//Podemos lancar uma execao dentro do bloco "try", para testar o bloco "catch".
			throw new Exception(); // Dando erro... Mesmo dando erro o bloco "finally" vai ser executado.
		} catch (Exception e) {
			System.out.println("Dentro do catch");
			e.printStackTrace();
		} finally {
			System.out.println("Fechando o Arquivo...");
		}
	}
	
	public static String lerArquivoReturn() {
		try {
			System.out.println("Abrindo o Arquivo...");
			System.out.println("Lendo o Arquivo...");
			System.out.println("Escrevendo no Arquivo...");
			return "Top"; //Mesmo com return o bloco "finally" vai ser executado.
		} catch (Exception e) {
			System.out.println("Dentro do catch");
			e.printStackTrace();
		} finally {
			System.out.println("Fechando o Arquivo...");
		}
		return null; //Precisamos usar um return aqui, porque a gente é obrigado a retornar algo e o bloco "try" nem
		//Sempre é executado por completo, por isso a gente precisa escrever aqui.
	}
}
