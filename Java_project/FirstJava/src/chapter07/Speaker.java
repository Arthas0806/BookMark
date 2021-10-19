package chapter07;

public class Speaker {
	
	private int volimeRate;
	
	public void showCurrentState() {
		System.out.println("볼륨크기 " + volimeRate);
	}
	
	public void setVolume(int vol) {
		volimeRate = vol;
	}
}
