package exam;


//1.Person 이라는 클래스를 정의해봅시다.
public class Person {

//	①이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
	private String name;
	private int personalNumber;
	private int age;
	
	Person(String name, int personalNumber, int age){
		this.name = name;
		this.personalNumber = personalNumber;
		this.age = age;
	}
	
	Person(){
		
	}
	
//	②인사하는 메소드를 정의해봅시다. - “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
	public void hello(String name, int age){
		System.out.println("안녕하세요 저는 " + name + "입니다. " + age + "살 입니다.");
	}
}


