package strings;
/* 
Faça um programa que leia uma string e mostre
 se ela é composta apenas por dígitos
*/
public class ExercicioString02 {
	public static void main(String[] args) {
		//Lendo a string
		String str = MyIO.readLine("Digite a string: ");
		//Variavel para resposta
		boolean resp = true;
		
		for (int i = 0 ; i < str.length() ; i++) {
			//Para cada posição de str verifica se o caractere é maior ou igual a zero ou menor ou igual a nove
			if((str.charAt(i) >= '0' && str.charAt(i) <= '9') == false) {
				resp = false;
				//Sai do ciclo se achar caractere diferente de um digito numerico
				break;
			}
		}
		
		if (resp == true) {
			MyIO.println("Composto apenas por dígitos\n");
		} else {
			MyIO.println("Não é composto apenas por dígitos\n");
		}
	}
}
