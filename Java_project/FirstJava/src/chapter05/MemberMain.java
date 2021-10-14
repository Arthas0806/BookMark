package chapter05;

public class MemberMain {
	public static void main(String[] args) {
		// 회원의 정보를 저장하는 프로그램
		// 데이터를 저장할 수 있는 구조(클래스)를 만들었다!
		// Member 클래스로 인스턴스를 생성하면 데이터를 저장하는 것과 같다!
		Member member1 = new Member("최종혁", "010-0000-0000", "학생", 1, "hyeok0806Gmail.com", "1996.08.06", "화성시");
		// 객체의 정보(데이터들) 출력
		member1.showData();
		
		System.out.println("==============================");
		
		Member member2 = new Member("이강인",  "010-9999-9999", "축구", 4, "lee@naver.com");
		member2.showData();
	}
}
