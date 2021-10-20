package chapter06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreManager2 {
	// 배열을 가지고 있고.
	// 배열의 주요 요소를 추가, 검색, 삭제 기능
	
	
	// 2021.10.20 : 배열을 ArrayList로 변경
	
	public static final Scanner sc = new Scanner(System.in);
	private List<Student> score;
	
	public ScoreManager2(int size) {
		score = new ArrayList<Student>(size);
	}
	
	public ScoreManager2() {
		this(10);
	}
	
	// 전체 데이터 출력 : 배열의 입력된 모든 데이터를 출력
	public void showAllData(){
		System.out.println("학생 점수 리스트");
		System.out.println("---------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");
		
		for(Student s : score) {
			System.out.println(s);
		}
		System.out.println("---------------------------------------------");
	}
	// 데이터 추가  : 배열의 요소로 추가 -> Student 타입의 참조값
	public void insertScore (Student s) {
		score.add(s);
		
	}
	
	// 데이터 삭제 : 이름 기준으로 삭제 -> 배열에 요소에 손흥민 정보를 지운다! -> 손흥민 객체를 참조하는 값이 없으면 데이터가
	
	public void deleteScore() {
		
		System.out.println("삭제할 학생의 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		int index = serchIndex(name);
		
		if(index > -1) {
			score.remove(index);
			System.out.println("데이터가 삭제되었습니다.");
		}else {
			System.out.println("검색하신 이름의 데이터가 존재하지 않습니다.");
		}
	}
	
	// 이름으로 배열의 INDEX 찾아 index 값을 반환하는 메소드
	private int serchIndex(String name) {
		
		int index = -1;
		
		for(int i = 0; i < score.size(); i++) {
			if(score.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void searchData() {
		
		System.out.println("검색할 학생의 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		// -1 또는 배열 범위 안의 정수 0 ~ N-1
		int index = serchIndex(name);
		
		if(index > -1) {
			System.out.println(score.get(index));
		}else {
			System.out.println("검색하신 이름의 데이터가 없습니다.");
		}
		
	}
	// 학생 정보를 저장하고 배열에 저장하는 메소드
	public void insertStudent() {
		
		System.out.println("학생 성적 데이터를 입력합니다.");
		System.out.println("이름>> ");
		String name = sc.nextLine();
		System.out.println("국어점수>> ");
		int korean = Integer.parseInt(sc.nextLine());
		System.out.println("영어점수>> ");
		int english = Integer.parseInt(sc.nextLine());
		System.out.println("수학점수>> ");
		int math = Integer.parseInt(sc.nextLine());
		// Student 객체 생성 -> 배열에 저장
		insertScore(new Student(name, korean, english, math));
		System.out.println("성적 데이터가 입력되엇습니다.");
	}
}
