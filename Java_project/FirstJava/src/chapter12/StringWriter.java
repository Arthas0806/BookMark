package chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter out = new BufferedWriter(new FileWriter("String.txt", true)); // true 이어서 기록된다.
		
		out.newLine();
		out.write("안녕하세요!!!");
		out.newLine(); // 한줄쓰고 밑으로내려가게 해준다.
		out.write("반갑습니다 ");
		out.newLine();
		out.write("date = 2021 - 10 - 26");
		out.newLine();
		
		out.close();
	}
}
