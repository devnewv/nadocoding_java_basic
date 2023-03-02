package method;

public class practice_05 {

	private static int power(int number) {
		return number * number;
	}
	
	private static int power(String strNumber) {
		int number = Integer.parseInt(strNumber);
		return number * number;
	}
	
	private static int power(int x, int y) {
		int result = 1;
		for(int i = 0; i < y; i++) {
			result *= x;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 메소드 오버로딩
		// 타입이 다르거나
		// 매개변수 개수가 다르거나
		System.out.println(power(4));
		System.out.println(power("4"));
		System.out.println(power(3, 3));
	}
}
