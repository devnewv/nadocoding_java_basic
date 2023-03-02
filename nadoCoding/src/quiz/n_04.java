package quiz;

import static java.lang.System.out;
import java.util.Scanner;

public class n_04 {

	public static void main(String[] args) {
		//주차요금 정산 프로그램
		//주차요금은 시간당 4000원(하루 최대 30000원)
		//경차 or 장애인 차량은 50%할인
		//결과 : 일반 차량 5시간 주차 시 20000원
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int pay = 4000 * hour;
		if(pay >= 30000) pay = 30000;

		int originalCar = pay;
		int smallCar = pay;
		int disabledCar = pay;
		
		out.println("일반 차량 " + hour + "시간 주차 시 " + originalCar + "원");
		out.println("경차 " + hour + "시간 주차 시 " + smallCar / 2 + "원");
		out.println("장애인 차량 " + hour + "시간 주차 시 " + disabledCar / 2 + "원");
	}
}
