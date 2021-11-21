package tiposDeExceptions.Throwable.Exception;

import java.io.File;
import java.io.IOException;

public class TryAndCatch {
	public static void main(String[] args) {
		
		criarArquivo();
		
		int[] array = new int[2];
		
		try {
			System.out.println(array[2]);
			System.out.println("N�o deu Erro");//Se der erro ele vai ignorar as linhas abaixo do erro e pular pro bloco catch
			
		//} catch (Exception e) { //Aqui podemos ver que o erro � um de "ArrayIndexOutOfBoundsException", e as boas pr�ticas
			//dizem que � bom especificar a exce��o ao m�ximo, porque pode ter informa��es importantes, mas tamb�m podemos
			//Colocar exce��es mais genericas como Exception, que � a classe pai de todas as exce��es e usamos ela quando n�o 
			//Sabemos qual exce��o colocar. 
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Deu erro porra");
			System.out.println("Index Inv�lido");//Em exce��es � sempre bom explicar o porque do erro.
			e.printStackTrace();//Esse m�todo tem em todas as exce��es
		}
		
		//Mas qual � a vantagem de usar exce��o? E que se der erro, voc� pode n�o apenas mostrar uma mensagem de erro, e sim
		//Um comando que trata o erro. E tamb�m um ponto muito importante � que o c�digo continua mesmo se der erro.
		
		System.out.println("Comando ap�s o Erro");
		
	}
	
	
	private static void criarArquivo() {
		//for(int i = 0; i< 30;i++) {
		File file = new File("C:\\Users\\Test\\Desktop\\Test" + /*(i) +*/ ".txt"); //Ele vai tentar criar um txt nomeado "Arquivo"
		//Tem como escolher um cominho para ele criar o arquivo e tamb�m tem como, 
		//usar um for para criar diversos arquivos
		
		try { //Ele vai tentar (try) executar a comando dentro do bloco
			
			System.out.println("? " + file.createNewFile()); //Se a gente apertar ctrl mais o clique esquerdo no m�todo, vamos ver
			//que ele retorna um boolean, por isso podemos botar em um println para ver se criou ou n�o, caso d� erro no bloco try 
			//ele vai automaticamente pro bloco catch, que trata a exce��o chamada "IOException", que podemos ver com o ctrl,
			//Que � lan�ada no met�do createNewFile com o comando "throws". 
			//Obs.: Se der falso � pq j� tem um arquivo criado com esse nome.
			//Obs2.: Ele vai criar o arquivo na workspace na pasta do projeto.
			
		} catch (IOException e) { //Mas aonde est� esse objeto "IOException"? A JVM vai criar automaticamente.
			e.printStackTrace();//Aqui puxamos o printStackTrace(), que explica o erro no console, que tem em todas as exce��es,
			//ou seja, podemos puxar esse m�todo em todos os comandos try...catch.
			
		}
	//}
	}
}




