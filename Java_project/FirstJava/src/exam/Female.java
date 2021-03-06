package exam;
//2.Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다.

//①각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.

//②각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.


//3.main()메소드를 정의해봅시다.

//①Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다.

//②생성된 인스턴스들을 이용해서 메소드를 호출해봅시다.
public class Female extends Person {
	
	private String job;					//  직업
	private String marry;				// 결혼여부

	
	
	public Female(String name, int personalNumber, int age, String job, String marry){
		super(name, personalNumber, age);
		this.job = job;
		this.marry = marry;
	}
	
	public Female() {
		
	}
	
	
	//③Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
	@Override
	public void hello(String name, int age){
		super.hello(name, age);
	}
	
	public void woman(String job, String marry) {
		System.out.println("여자이고 " + "직업은 " + job + " " + marry);
	}
	
	
	

}
