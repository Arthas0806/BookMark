package chapter02;

public class PerdonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Person 클래스의 인스턴스 생성
		Person p = new Person();
		
//		p.memberName = "유영진";
		p.setMemberName("최종혁");
		p.setPhoneNumber("010 - 7777 - 7777");
		p.setJuminNumber(9912121111111L);
		
		System.out.println("이름: " + p.getMemberName());
		System.out.println("전화번호: " + p.getPhoneNumber());
		System.out.println("주민번호: " + p.getJuminNumber());
		
		
		System.out.println("-------------------------");
		p.printData();
	}

}
