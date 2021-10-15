package chapter06;

public class Student {
	
	private String name;
	private int korean;
	private int english;
	private int math;
	
	
	
	public Student(String name, int korean, int english, int math) {
		// 눈에 보이지는 않지만 object 클래스를 상속받고 있다 그러나 object클래스의 생성자는 비어있다.
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	public Student() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getSum() {	
		return this.korean + this.english + this.math;
	}
	
	public float getAverage() {
		return getSum() / 3.0f;
	}

	@Override
	public String toString() {
		return name + "\t" + korean + "\t" + english + "\t" + math + "\t" + getSum() + "\t" + getAverage();
	}
	
	
	
		
		
		
	
	
}
