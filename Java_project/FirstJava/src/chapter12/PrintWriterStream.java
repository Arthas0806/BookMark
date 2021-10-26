package chapter12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterStream {

	public static void main(String[] args) throws IOException {
		
		PrintWriter out = new PrintWriter(new FileWriter("print.txt"));
		
		out.printf("제 이름은 %s 제 나이는 %d살입니다.", "최종혁", 29);
		out.println();
		
		out.print("축구를 좋아합니다.");
		out.println("골을 넣는것도 좋아합니다.");
		out.close();
		
	}
}
