package chapter06;

public class GradePrint {

	public static void main(String[] args) {
		
		int korean = 0;
		int math = 0;
		int english = 0;
		
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
		
			
		System.out.println("학생당(국수영) 총점 =================================");
		for(int[] arr : scoreArray) {
			int sum = 0;
			for(int num : arr) {
				sum += num;
			}
			
			System.out.print(sum + " \t");
		}

		System.out.println("\n학생당(국수영) 평균 =================================");
		for(int[] arr : scoreArray) {
			int sum = 0;
			for(int num : arr) {
				sum += num;
			}
			int average = sum / 3;
			System.out.print(average + " \t");
		}

		// 과목당 점수 구하기
		for(int i = 0; i < scoreArray.length; i++) {
			korean += scoreArray[i][0];
		}
		
		for(int i = 0; i < scoreArray.length; i++) {
			math += scoreArray[i][1];
		}
		
		for(int i = 0; i < scoreArray.length; i++) {
			english += scoreArray[i][2];
		}
		
		
		System.out.println("\n과목당 총점=========================================================");
		
		System.out.println("국어 : " + korean + "\n수학 : " + math + "\n영어 : " + english);
		
		System.out.println("과목당 평균 =================================");
		
		System.out.println("국어 : " + korean/10 + "\n수학 : " + math/10 + "\n영어 : " + english/10);
		
		
		
	}
	
	
	
	
	
	
	
}
