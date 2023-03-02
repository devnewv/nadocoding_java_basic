package quiz;

import static java.lang.System.out;
import java.util.Scanner;

public class n_03 {
	public static void main(String[] args) {
		//주민등록번호 출력
		//"901231-1234567" 인 경우 "901231-1"까지만 출력
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		out.println(str.substring(0, 8));
	}
}
