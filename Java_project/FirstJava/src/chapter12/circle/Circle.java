package chapter12.circle;

import java.io.Serializable;

public class Circle implements Serializable{

	//Serializble 인터페이스 구현은 -> 직열화의 대상 -> 객체 저장 -> 인스턴스 변수들을 저장

	int xPos;
	int yPos;
	double rad;
	
	public Circle(int xPos, int yPos, double rad) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.rad = rad;
	}
	
	public Circle(String string) {
		
	}

	public void showCircleInfo() {
		System.out.printf("[%d, %d] \n", xPos, yPos);
		System.out.println("rad ");
	}
	
}
