package strings;
/*
Fa�a um programa para ler uma palavra. Em seguida, mostre o n�mero de
caracteres da mesma e seu n�mero de caracteres mai�sculos
DIGITE FIM PARA ENCERRAR PROGRAMA
*/
public class ExercicioString05 {
	
	//M�todo que conta n�mero de mai�sculas
	public static int mostraNum(String s) {
		
		//Vari�vel que armazena n�mero de Mai�sculas
		int numUp = 0;
		//Ciclo para contar n�mero de caracteres Mai�sculos
		for (int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90 ) {
				numUp++;
			}
		}
		
		//Retorna ao programa principal o numero de mai�sculos
		return numUp;
	}
	
	//M�todo que elimina o ESPA�O (ASCII 32) da contagem de caracteres totais
	public static int tamanhoEntrada(String s) {
			
			
			int numEntrada = 0;
			
			for (int i = 0 ; i < s.length() ; i++) {
				if(s.charAt(i) == 32 ) {
					numEntrada--;
				}
			}
			
			
			return numEntrada;
		}
	
	//Programa principal
	public static void main(String[] args) {
		//Vari�veis
		String entrada = MyIO.readLine("Insira algo: ");
		int respM;
		int respTamanho = 0;
		
		MyIO.println("\n");
		
		//Enquanto entrada for diferente de "FIM" programa continua rodando
		while(!entrada.equals("FIM")) {
			//M�todos, o primeiro retira os espa�os da contagem de caracteres totais e o segundo conta os caracteres Mai�sculos
			respTamanho = tamanhoEntrada(entrada);
			respM = mostraNum(entrada);
			
			//Imprime na tela a resposta
			MyIO.println("N�mero de caracteres : " + (entrada.length() + respTamanho) + "\n" + "N�mero de caracteres MAI�SCULOS: " + respM);
			//Pede nova entrada 
			entrada = MyIO.readLine("Insira algo: ");
		}
		
		
	}
}
