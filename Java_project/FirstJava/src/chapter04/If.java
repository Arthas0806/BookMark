package chapter04;

import java.util.Calendar;
import java.util.Scanner;

public class If {
	
	static final int NEW_YEAR = Calendar.getInstance().get(Calendar.YEAR);
	
	
//	① 독감예방 접종이 가능한지 여부를 확인하는 메소드를 정의합니다.
//	- 매개변수로 태어난 해(년도)를 전달받습니다.
//	- 15세 미만의 경우와 65세 이상의 경우 “무료예방접종이 가능합니다.” 메시지가 콘솔에 출력하도록 합니다.
//	- 위에서 정의한 조건의 범위가 아닌 나머지의 경우 “무료접종 대상이 아닙니다.”라고 출력하도록 합니다.
	
	public void vaccine(int year) {
		
		int age = NEW_YEAR - year - 1;
		boolean checkup = age < 15 || age >= 65;
		boolean checkup2 = !(age >= 15 && age < 65);
		
		if(checkup2) {
			System.out.println("백신 무료예방접종이 가능합니다.");
		}else {
			System.out.println("백신 무료접종 대상이 아닙니다.");
		}
		
	}
	

	
	
	
	
//	② 건강검진 대상 여부를 판별하고 어떤 검진이 가능한지 확인하는 메소드를 정의합니다.
//	- 매개변수로 태어난 해(년도)를 전달받습니다.
//	- 대한민국 성인( 20세 )의 경우 무료로 2년마다 건강검진을 받을 수 있습니다.
//	- 짝수 해에 태어난 사람은 올해가 짝수년이라면 검사 대상이 됩니다.
//	- 40 이상의 경우는 암 검사도 무료로 검사를 할 수 있습니다.
	
	public void checkup(int year) {
		
		int age = NEW_YEAR - year - 1;
		boolean check = year % 2 == NEW_YEAR % 2;
		
		if(age >= 20 && check) {
			System.out.println("나이 : " + age + " 무료로 검사할수있습니다.");
			if(age >= 40) {
				System.out.println("암 검사까지 무료로 검사할수있습니다.");	
			}
		}else {
			System.out.println("나이 : " + age + " 무료로 검사대상이 아닙니다.");
		}
		
	}
	
	public static void main(String[] args) {
		If test = new If();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사용자의 생년월일을 입력하세요.");
		int year = Integer.parseInt(scanner.nextLine());
		
		test.vaccine(year);
		test.checkup(year);
	}
	
	
}



