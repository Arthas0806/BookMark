package chapter10;

import java.util.Scanner;

public class ExceptionTest4 {
	public static void main(String[] args) {

		int[] arr = new int[3];
		Object o = new String("abc");
		String str = null;
		String number = "one";
		

		try {
			System.out.println(str.toUpperCase());			
		} catch(NullPointerException e) {
			System.out.println("예외 발생 !!");
			System.out.println(e.getMessage());
		}
		
		
		try {
			// String -> int 
			int temp = Integer.parseInt(number);
		} catch(NumberFormatException e) {
			System.out.println("예외 발생 !!");
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("프로그램을 종료합니다.");

	}
}
