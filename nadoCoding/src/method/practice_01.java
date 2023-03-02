package method;

public class practice_01 {
	
	private static void sayHello() {
		System.out.println("하이요!");
	}
	
	public static void main(String[] args) {
		System.out.println("메소드 호출 전");
		
		sayHello();
		
		System.out.println("메소드 호출 후");
	}

}
