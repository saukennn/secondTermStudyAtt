package strings;
/*
Faça um programa para ler uma palavra. Em seguida, mostre os números
de caracteres, letras, não letras, vogais e consoantes.
*/
public class ExercicioString07 {
	
	//Método para eliminar os espaços da contagem
	public static int isEspaco (String s) {
		int numEspaco = 0;
		
		for (int i = 0 ; i < s.length(); i++) {
			if(s.charAt(i) == 32) {
				numEspaco++;
			}
		}
			
		
		return numEspaco;
	}
	
	//Metodo que analisa entrada e retorna apenas a quantidade de dígitos que não são letras
		public static int isNletra (String s){
			int numDigitos = 0;
			
			for (int i = 0 ; i < s.length(); i++) {
				//Limite das letras em ASCII ficam entre (65 e 122)
				if(s.charAt(i) < 65 || s.charAt(i) > 122 ) {
					numDigitos++;
				}
			}
			
			return numDigitos;
		}
	
	//Metodo que analisa entrada e retorna apenas quantas letras foram inseridas
	public static int isLetra (String s){
		int numLetras = 0;
		
		for (int i = 0 ; i < s.length(); i++) {
			//Limite das letras em ASCII ficam entre (65 e 122)
			if(s.charAt(i) > 65 && s.charAt(i) <= 122 ) {
				numLetras++;
			}
		}
		
		return numLetras;
	}
	
	//Metodo que faz contagem do número de consoantes
	public static int isConsoante (String s){
		int numConsoantes = 0;
		
		for (int i = 0 ; i < s.length(); i++) {
			//Vogais na tabela ASCII em maiúsculas e minúsculas
			if(s.charAt(i) > 65 && s.charAt(i) <= 122 && s.charAt(i) != 65 || s.charAt(i) != 97 || s.charAt(i) != 69 || s.charAt(i) != 101 || s.charAt(i) != 73 || s.charAt(i) != 105 || s.charAt(i) != 79 || s.charAt(i) != 111 || s.charAt(i) != 85 || s.charAt(i) != 117) {
				numConsoantes++;
			}
		}
		
		return numConsoantes;
	}
	
	//Metodo faz contagem do número de vogais
	public static int isVogal (String s){
		int numVogais = 0;
		
		for (int i = 0 ; i < s.length(); i++) {
			//Vogais na tabela ASCII em maiúsculas e minúsculas
			if(s.charAt(i) == 65 || s.charAt(i) == 97 || s.charAt(i) == 69 || s.charAt(i) == 101 || s.charAt(i) == 73 || s.charAt(i) == 105 || s.charAt(i) == 79 || s.charAt(i) == 111 || s.charAt(i) == 85 || s.charAt(i) == 117) {
				numVogais++;
			}
		}
		
		return numVogais;
	}
	
	//Programa Principal
	public static void main(String[] args) {
		
		String entrada = MyIO.readLine("Insira uma palavra: ");
		
		MyIO.println("\n");
		
		int caracteresTotais = 0;
		int letrasTotais = 0;
		int naoLetrasTotais = 0;
		int vogais = 0;
		int consoantes = 0;
		int eliminaEspaços = 0;
		
		vogais = isVogal(entrada); // NUMERO DE VOGAIS
		consoantes = isConsoante(entrada); // NUMERO DE CONSOANTES
		caracteresTotais = (entrada.length() + eliminaEspaços); // NUMERO DE CARACTERES TOTAL 
		letrasTotais = isLetra(entrada); // NUMERO DE CARACTERES QUE SAO LETRAS
		naoLetrasTotais = isNletra(entrada + eliminaEspaços); //NUMERO DE CARACTERES QUE NAO SAO LETRAS
		eliminaEspaços = isEspaco(entrada); //ELIMINA OS ESPAÇOS DA CONTAGEM
		
		MyIO.println("-------------------QUANTIDADE-------------------\n");
		MyIO.println("VOGAIS: " + vogais + "\n" + "CONSOANTES: " + consoantes + "\n" + "TOTAL DE LETRAS: " + letrasTotais + "\n" + "TOTAL DE CARACTERES: " + caracteresTotais + "\n" + "CARACTERES QUE NÃO SÃO LETRAS : " + naoLetrasTotais );
		
		
		
	}
}
