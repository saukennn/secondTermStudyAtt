package strings;
/* 
Fa�a um programa que leia uma string e mostre
 se ela � composta apenas por d�gitos
*/
public class ExercicioString02 {
	public static void main(String[] args) {
		//Lendo a string
		String str = MyIO.readLine("Digite a string: ");
		//Variavel para resposta
		boolean resp = true;
		
		for (int i = 0 ; i < str.length() ; i++) {
			//Para cada posi��o de str verifica se o caractere � maior ou igual a zero ou menor ou igual a nove
			if((str.charAt(i) >= '0' && str.charAt(i) <= '9') == false) {
				resp = false;
				//Sai do ciclo se achar caractere diferente de um digito numerico
				break;
			}
		}
		
		if (resp == true) {
			MyIO.println("Composto apenas por d�gitos\n");
		} else {
			MyIO.println("N�o � composto apenas por d�gitos\n");
		}
	}
}
