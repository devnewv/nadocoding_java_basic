package method;

public class practice_02 {

	private static void power(int number) {
		int result = number * number;
		System.out.println(number + "의 2승 : " + result);
	}
	
	private static void powerExp(int x, int y) {
		int result = 1;
		for(int i = 0; i < y; i++) {
			result *= x;
		}
		System.out.println(x + "의 " + y + "승 : " + result);
	}
	
	public static void main(String[] args) {
		power(2);
		powerExp(2, 3);
		powerExp(4, 4);
	}
}
