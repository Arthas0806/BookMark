package subject;

import java.util.Scanner;

public class ContactMain {
	public static void main(String[] args) {
		Contact contact = new Contact("최종혁", "010 - 0000 - 0000", "cardview0806@gmail.com", "화성", "없음", "8월 6일");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("전화번호부(이름 : 번호 / 이메일 / 주소 / 그룹 / 생일)");
		System.out.println(contact.getName() + " : "+ contact.getPhone() + " / " + contact.getEmail() + " / " + contact.getAddress() + " / " + contact.getGroup() + " / " + contact.getBirth());
		
		System.out.println("이름");
		
		
		
	}
	
	
}
