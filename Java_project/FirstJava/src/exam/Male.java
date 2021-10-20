package exam;

public class Male extends Person {
	
	private String job;					//  직업
	private String marry;				// 결혼여부

	
	
	public Male(String name, int personalNumber, int age, String job, String marry){
		super(name, personalNumber, age);
		this.job = job;
		this.marry = marry;
		
	}
	public Male() {
		
	}
	//③Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
	@Override
	
	public void hello(String name, int age){
		super.hello(name, age);
	}
	
	public void man(String job, String marry) {
		System.out.println("남자이고" + "직업은 " + job + " "+ marry);
	}
	
}
