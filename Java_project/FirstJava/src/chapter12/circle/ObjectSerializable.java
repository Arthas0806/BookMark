package chapter12.circle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//인스턴스 저장을 위한 스트림
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));
				
		// 인스턴스 저장
		out.writeObject(new Circle(1, 1, 2.4));
		out.writeObject(new Circle(2, 2, 4.8));
		out.writeObject(new Circle("문자열"));
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("one");
		arr.add("two");
		arr.add("three");
		
		out.writeObject(arr);
		
		out.close();
		
		// 저장된 파일을 이용해서 인스턴스를 생성 -> 복원
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));
		
		// 복원 : 인스턴스 생성하고 반환
		Circle c1 = (Circle) in.readObject(); // ClassNotFoundException -> 경로에 존재하지 않으면 이게 일어나서 처리
		Circle c2 = (Circle) in.readObject();
		
		String str = (String) in.readObject();
		
		ArrayList<String> arr1 = (ArrayList) in.readObject();
		
		for(String s : arr1) {
			System.out.println(s);
		}
		
		in.close();
		
		c1.showCircleInfo();
		c2.showCircleInfo();
		System.out.println(str);
		
		
	}
}
