package quiz;

public class n_05 {

	public static void main(String[] args) {
		//배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력
		//신발 사이즈는 250부터 295까지 5단위로 증가
		//신발 사이즈 수는 총 10가지
		//사이즈 250 (재고 있음)
		// ...
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 250 + (i * 5);
		}
		
		for(int size : arr) {
			System.out.println("사이즈 " + size + " (재고있음)");
		}
	}
}
