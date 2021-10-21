package subject;

import java.util.Scanner;

public class ContactMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contact con = new Contact("김 아무개", "010-0000-0000", "hyeok0806@email.com", "address", "Gruop", "8월 6일");
		
		
	
		while(true) {
			System.out.println("사원 관리 시스템....");
			System.out.println("1. 사원 정보 입력   2. 사원 정보 출력    3. 사원 정보 수정   4. 종료");
			String userChoice = sc.nextLine();
			int user = Integer.parseInt(userChoice);
			
			switch(user) {
			case 1:
				Insert(sc, con);
				break;
			case 2:
				con.printAll();
				break;
			case 3:
				Update(sc, con);
				break;
			case 4:
				return;
			default :
				System.out.println("1, 2, 3, 4 중에만 누르세요.");
				break;
			}
			
		}
	}

	public static void Insert(Scanner sc, Contact con) {
		
		System.out.println("이름을 적으시오.");
		con.setName(sc.nextLine());
		System.out.println("전화번호를 적으시오.");
		con.setPhone(sc.nextLine());
		System.out.println("이메일을 적으시오.");
		con.setEmail(sc.nextLine());
		System.out.println("주소를 적으시오.");
		con.setAddress(sc.nextLine());
		System.out.println("그룹을 적으세요.");
		con.setGroup(sc.nextLine());
		System.out.println("생일을 적으시오.");
		con.setBirth(sc.nextLine());
	}
	
	
	public static void Update(Scanner sc, Contact con) {
		
		System.out.println("이름을 적으시오.");
		con.setName(sc.nextLine());
		System.out.println("전화번호를 적으시오.");
		con.setPhone(sc.nextLine());
		System.out.println("이메일을 적으시오.");
		con.setEmail(sc.nextLine());
		System.out.println("주소를 적으시오.");
		con.setAddress(sc.nextLine());
		System.out.println("그룹을 적으세요.");
		con.setGroup(sc.nextLine());
		System.out.println("생일을 적으시오.");
		con.setBirth(sc.nextLine());
		
	}
	
	
	
}
