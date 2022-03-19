package strings;

/*
Fa�a um metodo que leia uma string e mostre se ela � um pal�ndromo
*/

public class ExercicioString04 {
	
	public static boolean isPalindromo(String s) {
		boolean resp = true;
		
		for (int i = 0; i < s.length()/2; i++){
			if(s.charAt(i) != s.charAt(s.length() - i - 1)){
				resp = false;
				break;
			}
		}

		
		return resp;
	}
	
	
	public static void main(String[] args) {
			
			String str = MyIO.readLine("Insira palavra para a verifica��o\n");
			boolean resp;

			
			while(!str.equals("FIM")) {
				
				resp = isPalindromo(str);
				
				if(resp == true) {
					MyIO.println("SIM\n");
				} else {
					MyIO.println("NAO\n");
				}
				
				str = MyIO.readLine();
				
			}
			
			
				
			
		
	}	
}
