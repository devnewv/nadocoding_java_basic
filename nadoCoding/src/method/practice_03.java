package method;

public class practice_03 {

	private static String hotelPhoneNumber() {
		String phoneNumber = "010-1234-1234";
		return phoneNumber;
	}
	
	private static String hotelAddress() {
		String address = "부산시 해운대구";
		return address;
	}
	
	private static String hotelActivity() {
		String activity = "볼링, 탁구, 노래";
		return activity;
	}
	
	public static void main(String[] args) {
		System.out.println("호텔 전화번호 : " + hotelPhoneNumber());
		System.out.println("호텔 주소 : " + hotelAddress());
		System.out.println("호텔 액티비티 : " + hotelActivity());
	}
}
