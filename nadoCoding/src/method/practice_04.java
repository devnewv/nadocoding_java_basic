package method;

public class practice_04 {

	private static int power(int number) {
		return number * number;
	}
	
	private static int powerExp(int x, int y) {
		int result = 1;
		for(int i = 0; i < y; i++) {
			result *= x;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(power(2));
		System.out.println(powerExp(2, 5));
	}
}
