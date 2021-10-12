package chapter02;

public class Member {

	// 1. String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
	// 2. int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
	// 3  double 타입의 키를 저장할 수 있는 변수 helght를 정의해봅시다.
	// 4. boolean 타입의 JAVA 책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다.
	// 5. 이름과 나이, 키, 책의 보유 여부를 출력해봅시다.
	
	// 클래스 정의
	//[접근제어자] [final] 클래스 이름{}
//	{
//     변수 정의
//	   메소드 정의
//	}
	// 인스턴스 변수는 자동 초기화
	private String name; // 사용자의 이름을 저장하는 변수
	int age; // 사용자의 나이를 저장하는 변수
	double height; // 사용자의 키
	boolean hasBook; // 자바 책 보유여부
	
	//회원의 데이터를 출력하는 메소드
	void printData() {

		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("책 보유상태: " + hasBook);
	}
	
	public static void main(String[] args) {
		
		long juminNumber = 9701011111111L;
		
		
		// Member 클래스로 인스턴스를 생성 -> 이름, 나이, 키, 책보유상태 저장할수 있는 메모리공간을 생성
		Member member = new Member();
		
		// 인스턴스의 변수를 참조해서 출력
//		System.out.println("이름: " + member.name);
//		System.out.println("나이: " + member.age);
//		System.out.println("키: " + member.height);
//		System.out.println("책 보유상태: " + member.hasBook);
		
		
		// 인스턴스 변수의 값을 변경
		member.name = "";
		member.age = 20;
		member.height = 185.9;
		member.hasBook = true;

		System.out.println("------------------------");
		System.out.println(" 인스턴스 변수의 값을 변경");
		System.out.println("------------------------");
		
//		System.out.println("이름: " + member.name);
//		System.out.println("나이: " + member.age);
//		System.out.println("키: " + member.height);
//		System.out.println("책 보유상태: " + member.hasBook);
		
		
	}
	
}
