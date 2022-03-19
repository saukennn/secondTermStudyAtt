package strings;
/*
Faça um programa para ler uma palavra. Em seguida, mostre o número de
caracteres da mesma e seu número de caracteres maiúsculos
DIGITE FIM PARA ENCERRAR PROGRAMA
*/
public class ExercicioString05 {
	
	//Método que conta número de maiúsculas
	public static int mostraNum(String s) {
		
		//Variável que armazena número de Maiúsculas
		int numUp = 0;
		//Ciclo para contar número de caracteres Maiúsculos
		for (int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90 ) {
				numUp++;
			}
		}
		
		//Retorna ao programa principal o numero de maiúsculos
		return numUp;
	}
	
	//Método que elimina o ESPAÇO (ASCII 32) da contagem de caracteres totais
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
		//Variáveis
		String entrada = MyIO.readLine("Insira algo: ");
		int respM;
		int respTamanho = 0;
		
		MyIO.println("\n");
		
		//Enquanto entrada for diferente de "FIM" programa continua rodando
		while(!entrada.equals("FIM")) {
			//Métodos, o primeiro retira os espaços da contagem de caracteres totais e o segundo conta os caracteres Maiúsculos
			respTamanho = tamanhoEntrada(entrada);
			respM = mostraNum(entrada);
			
			//Imprime na tela a resposta
			MyIO.println("Número de caracteres : " + (entrada.length() + respTamanho) + "\n" + "Número de caracteres MAIÚSCULOS: " + respM);
			//Pede nova entrada 
			entrada = MyIO.readLine("Insira algo: ");
		}
		
		
	}
}
