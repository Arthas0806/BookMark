package chapter09;

import java.util.StringTokenizer;


public class TokenizeString {
	
	public static void main(String[] args) {
		// 문자열 원본
		String str = "010-9963-2302";
		String[] strMsg = new String[3];
		
		StringTokenizer st = new StringTokenizer(str, "-");
		
		int i = 0;
		// 반복문을 이용해서 전체 토큰 참조
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			System.out.println(temp);
			strMsg[i++] = temp;
		}
		
		System.out.println("-----------------------");
		for(String s : strMsg) {
			System.out.print(s);
		}
	}
}
