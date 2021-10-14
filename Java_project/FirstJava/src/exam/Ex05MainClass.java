package exam;

public class Ex05MainClass {
	
	String name;
	String phone;
 	String major;
	String year;
	String email;
	String birth;
	String address;
	
	// 생일, 주소 없는 버전
	Ex05MainClass(String name, String phone, String major, String year, String email){
		this.name = name;
		this.phone = phone;
		this.major = major;
		this.year = year;
		this.email = email;
	}
	// 생일 주소 있는 버전
	Ex05MainClass(String name, String phone, String major, String year, String email, String birth, String address){
		this.name = name;
		this.phone = phone;
		this.major = major;
		this.year = year;
		this.email = email;
		this.birth = birth;
		this.address = address; 
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		exam.Ex05MainClass ex05MainClass = new Ex05MainClass("최종혁", "010-0000-0000", "IT학부", "4학년", "hyeok0806@gmail.com");
		exam.Ex05MainClass ex05MainClass2 = new Ex05MainClass("최종혁", "010-0000-0000", "IT학부", "4학년", "hyeok0806@gmail.com", "8월6일", "화성시");
		printAll(ex05MainClass);
		System.out.println();
		printAll(ex05MainClass2);
		
	}
	
	public static void printAll(exam.Ex05MainClass ex05MainClass) {
		System.out.print(ex05MainClass.name + " ");
		System.out.print(ex05MainClass.phone + " ");
		System.out.print(ex05MainClass.major + " ");
		System.out.print(ex05MainClass.year + " ");
		System.out.print(ex05MainClass.email + " ");				
		if(!(ex05MainClass.birth == null)) {
			System.out.print(ex05MainClass.birth + " ");
			System.out.print(ex05MainClass.address + " ");
		}
	}
	
		
			
		
	
}
