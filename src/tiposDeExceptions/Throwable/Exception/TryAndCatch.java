package tiposDeExceptions.Throwable.Exception;

import java.io.File;
import java.io.IOException;

public class TryAndCatch {
	public static void main(String[] args) {
		
		criarArquivo();
		
		int[] array = new int[2];
		
		try {
			System.out.println(array[2]);
			System.out.println("Não deu Erro");//Se der erro ele vai ignorar as linhas abaixo do erro e pular pro bloco catch
			
		//} catch (Exception e) { //Aqui podemos ver que o erro é um de "ArrayIndexOutOfBoundsException", e as boas práticas
			//dizem que é bom especificar a exceção ao máximo, porque pode ter informações importantes, mas também podemos
			//Colocar exceções mais genericas como Exception, que é a classe pai de todas as exceções e usamos ela quando não 
			//Sabemos qual exceção colocar. 
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Deu erro porra");
			System.out.println("Index Inválido");//Em exceções é sempre bom explicar o porque do erro.
			e.printStackTrace();//Esse método tem em todas as exceções
		}
		
		//Mas qual é a vantagem de usar exceção? E que se der erro, você pode não apenas mostrar uma mensagem de erro, e sim
		//Um comando que trata o erro. E também um ponto muito importante é que o código continua mesmo se der erro.
		
		System.out.println("Comando após o Erro");
		
	}
	
	
	private static void criarArquivo() {
		//for(int i = 0; i< 30;i++) {
		File file = new File("C:\\Users\\Test\\Desktop\\Test" + /*(i) +*/ ".txt"); //Ele vai tentar criar um txt nomeado "Arquivo"
		//Tem como escolher um cominho para ele criar o arquivo e também tem como, 
		//usar um for para criar diversos arquivos
		
		try { //Ele vai tentar (try) executar a comando dentro do bloco
			
			System.out.println("? " + file.createNewFile()); //Se a gente apertar ctrl mais o clique esquerdo no método, vamos ver
			//que ele retorna um boolean, por isso podemos botar em um println para ver se criou ou não, caso dê erro no bloco try 
			//ele vai automaticamente pro bloco catch, que trata a exceção chamada "IOException", que podemos ver com o ctrl,
			//Que é lançada no metódo createNewFile com o comando "throws". 
			//Obs.: Se der falso é pq já tem um arquivo criado com esse nome.
			//Obs2.: Ele vai criar o arquivo na workspace na pasta do projeto.
			
		} catch (IOException e) { //Mas aonde está esse objeto "IOException"? A JVM vai criar automaticamente.
			e.printStackTrace();//Aqui puxamos o printStackTrace(), que explica o erro no console, que tem em todas as exceções,
			//ou seja, podemos puxar esse método em todos os comandos try...catch.
			
		}
	//}
	}
}




