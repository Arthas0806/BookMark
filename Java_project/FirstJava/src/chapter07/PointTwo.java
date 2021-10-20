package chapter07;

import java.io.Serializable; 		// 객체를 파일형식으로 저장할때 사용된다?

public class PointTwo implements Serializable{

	private int xPos;
	private int yPos;
	
	PointTwo(int x, int y){
		xPos = x;
		yPos = y;
	}

	@Override
	public String toString() {
		return "PointTwo [xPos=" + xPos + ", yPos=" + yPos + "]";
	}
}
