	package quiz;

import java.util.Scanner;

public class n_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//키가 120cm 이상인 경우에만 탑승가능
		//삼항 연산자
		//결과 : 키가 115cm이므로 탑승 불가능합니다.
		//키가 120cm이므로 탑승 가능합니다.
		
		int height = sc.nextInt();
		String str = (height >= 120) ? "가능" : "불가능";
		
		System.out.println("키가 " + height + "cm이므로 탑승 " + str +"합니다.");
	}
}
