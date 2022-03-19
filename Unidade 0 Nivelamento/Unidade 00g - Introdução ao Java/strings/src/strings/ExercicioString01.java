package strings;
/*
Faça um programa que leia uma String e um caractere e mostre
 na tela quantas vezes esse caractere aparece na String
*/
public class ExercicioString01 {
	public static void main(String[] args) {
		String str = MyIO.readLine("Digite algo\n");
		char c = MyIO.readChar("Escolha a letra\n");
		int contador = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == c) {
				contador++;
			}
		}
		
		MyIO.println("A letra " + c + " apareceu " + contador + " vez(es).");
	}
}
