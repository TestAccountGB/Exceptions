package tiposDeExceptions.Throwable.Error;

//Aqui podemos ver que um erro de stack, � algo que vai empilhando e empilhando por isso se chama de stack, tipo um
//M�todo que chama outro m�todo e esse m�todo chama outro m�todo, e se caso ficar assim por muito tempo, pode
//Exceder a mem�ria alocada a JVM (Java Virtual Machine) e vai ocorrer um "Estouro de Pilha (StackOverFlow)".



public class StackOverFlowError {
	public static void main(String[] args) {
		
		stackOverFlow();
		//Como podemos ver ali no come�o "Exception in thread "main" java.lang.StackOverflowError", ele da um erro de Stack
	}
	public static void stackOverFlow() {
		stackOverFlow();
	}
	
//	public static void stackOverFlow1() {
//		stackOverFlow2();
//	}
//	public static void stackOverFlow2() {
//		stackOverFlow3();
//	}
//	public static void stackOverFlow3() {
//		stackOverFlow4();
//	}
//	public static void stackOverFlow4() {
//		stackOverFlow5();
//	}
//	public static void stackOverFlow5() {
//	}
//
// Isso daqui � uma pilha, um m�todo que chama outro m�todo.
}