package exam;

public class Ex06Value {
	
	public static void main(String[] args) {
		
		int [][] arr1 = {
				{1, 2, 3},
				{4, 5, 6,},
				{7, 8, 9},
				{10, 11, 12}
		};
		
		// 출력
		for(int i =0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//임시 배열 선언
		int[] temp = arr1[arr1.length - 1];
		// 변환
		for(int i = arr1.length - 1; i > 0; i--) {
			arr1[i] = arr1[i - 1];
		}
		
		arr1[0] = temp;
		
		System.out.println("시프트 //////////////////////////////////////");
		// 출력
		for(int i =0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
				System.out.println();
		}
		System.out.println("시프트 //////////////////////////////////////");
		
		int[] arr = {100, 240, 180, 200};

		
		System.out.println(maxValue(arr));
		System.out.println(miniValue(arr));
		
		//2차원 배열 선언
		int[][] arr3 = {
				{1, 2, 3},
				{4, 5, 6, 7},
				{8, 9, 10, 11, 12, 13}
		};
		
		System.out.println("2차원 배열출력");
		addOneArr(arr3, 10);
		
		
		System.out.println("=================================");
		// for - each
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=================================");
		// 요소의 갯수만큼 돈다.
		// 참조해서 값을 가져올때만 사용한다.
		for(int num : arr) {
			System.out.println(num);
		}
		
		
	}
	
	
	
	// 2차원 배열
	public static void addOneArr(int[][] arr, int add) {
		// 출력
		// 행
		for(int i = 0; i < arr.length; i++) {
			// 열
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

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
