package chapter06;

public class GradePrint {

	public static void main(String[] args) {
		
		
		int[][] scoreArray = new int[10][3];
		
		for(int i= 0; i < scoreArray.length; i++) {
			for(int j = 0; j < scoreArray[i].length; j++) {
				
				//랜덤한 숫자 저장
				int score = (int)(Math.random() * 101);   // 0.001 ~ 0.999 * 100 은 결국 100점이 안나오기 때문에 101을 준다 
				// 배열에 랜점한 숫자를 저장
				scoreArray[i][j] = score;
			}
		}
		System.out.println("점수 =================================");
		// 점수를 나열
		for(int[] arr : scoreArray) {
			for(int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
		System.out.println("평균 =================================");
		// 평균 점수
		for(int[] arr : scoreArray) {
			int sum = 0;
			for(int num : arr) {
				sum += num;
			}
			int average = sum / 3;
			System.out.print(average + " \t");
		}
		
	}
	
	
	
	
}
