package strings;

public class ExercicioString03 {
	public static void main(String[] args) {
		
		String str = MyIO.readLine();
		int num = 0, tmp;
		
		for (int i = 0; i < str.length(); i++) {
			tmp = (int)(str.charAt(i) - 48);
			tmp *= (int)Math.pow(10, str.length() - i - 1);
			num += tmp;
		}
		
		System.out.println(num);
		
	}
}
