package strings;

/*
Faca um programa para ler uma palavra. Em seguida, mostre a primeira
ocorrcncia da letra A
*/
public class ExercicioString06 {
	
	//Metodo que procura a recorrência de A
	public static int analisePos(String s) {
		int pos = 0;
		
		for (int i = 0 ; i < s.length(); i++) {
			if(s.charAt(i) == 65) {
				pos = i + 1;
				break;
			}
		}
		
		return pos;
	}
	
	
	//Programa Principal
	public static void main(String[] args) {
		
		//Variavel
		String entrada = MyIO.readLine("INSIRA UMA PALAVRA ------> ");
		int local = analisePos(entrada);
		
		MyIO.println("\nPrimeira Recorrencia de A: (" + local + ") vezes");
			
			
			

		
	}
}
