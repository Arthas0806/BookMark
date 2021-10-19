package chapter07;

public class HybridWaterCar extends HybridCar{
	int waterGuage;
	
	public HybridWaterCar(int gaolinegauge, int electronicGuage, int waterGuage) {
		super(gaolinegauge, electronicGuage); //2. 상위 클래스의 생성자 호출
		this.waterGuage = waterGuage;
	}
	
	public static void main(String[] args) {
		HybridWaterCar hdCar = new HybridWaterCar(10,  20 , 30); // 1. 생성자 호출
		System.out.println(car.door);
		System.out.println(HybridCar.door);
		System.out.println(HybridWaterCar.door);
		System.out.println(hdCar.gasolineguage);
		System.out.println(hdCar.electronicGuage);
		System.out.println(hdCar.waterGuage);
	}



}

class HybridCar extends car{

	int electronicGuage;
	
	HybridCar(int gasolineguage,int electronicGuage){
		super(gasolineguage); // 3. 사우이 클래스의 생성자 호출
		this.electronicGuage = electronicGuage;
		
	}
}


class car{
	
	static int door = 2;
	int gasolineguage;
	
	//car 클래스의 변수를 초기화 하는 생성자
	car(int gasolineguage){
		this.gasolineguage = gasolineguage;
	}
}
