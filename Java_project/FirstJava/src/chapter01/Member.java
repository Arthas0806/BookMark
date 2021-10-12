package chapter01;

public class Member {

	// 2. Member 클래스를 생성하고.
	// 메인 메소드를 만들고 자기 자신의 이름을 출력하는 메소드를 만들어 봅시다.
	public static void main(String[] args) {
		// static : 바이트 코드가 가상머신에서 실행하는 시점에 메소드 코드가 메모리에 로드된다.
		System.out.println("최종혁");
		// System 클래스 / out 참조변수 / println 메소드
		System.out.println("메소드 호출");
		sayName();
	}
	
	// 이름을 출력하는 메소드
	// 반환타입 메소드 이름(매개변수, ...)
	
	static void sayName() {
		System.out.println("최종혁");
	}
	
	// 인스턴스화 되기전이라 호출이 불가능해서 오류가 난다.
}
