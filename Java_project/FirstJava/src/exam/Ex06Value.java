package exam;

public class Ex06Value {
	
	public static void main(String[] args) {
		
		int[] arr = {100, 240, 180, 60, 150, 90, 30, 200};
		int[] arr2 = {100, 240, 90, 200};
		
		System.out.println(maxValue(arr2));
		System.out.println(miniValue(arr2));
	}
	
	public static int miniValue(int[] arr) {
		int minVal = arr[0]; // 처음값을 최소값으로 저장
		
		//각 요소의 값과 최소값들을 비교 후 새로운 값이 더 작을 때 최소값으로 저장
		// 전달받은 배열의 사이즈만큼 반복하면서 비교
		
		for(int i=0; i < arr.length - 1; i++) {

			if(arr[i] < minVal) {
				minVal = arr[i];
			}
		}

		return minVal;
	}
	public static int maxValue(int[] arr) {
		
		int maxVal = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
}
