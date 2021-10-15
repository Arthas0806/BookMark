package chapter06;

public class ScoreMain {
	public static void main(String[] args) {
		
		// ① Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
		Student[] score = new Student[10]; 
		int number = 0;
		//  Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다
		Student s1 = new Student("손흥민", 100, 100, 100);
		score[number] = s1;
		number++;
		Student s2 = new Student("이강인" , 90, 80, 70);
		score[number] = s2;
		number++;
		// ③ 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다
		
		for(int i = 0; i < number; i++) {
			System.out.println(score[i]);
		
		}
		
		// 데이터 입력 -> 배열에 저장
		// 데이터 검색 -> 배열의 요소(객체)에서 검색
		// 데이터 삭제 -> 배열의 요소 삭제
		
	}
}
