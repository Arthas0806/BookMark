package chapter13;

public class ThreadTest2 {

	public static void main(String[] args) {
		
		// Runnable 타입의 객체를 생성하고 -> 해당 객체를 이용하여 Thread 객체를 생성
		AdderThread adderThread1 = new AdderThread(1, 50);
		AdderThread adderThread2 = new AdderThread(51, 100);
		
		Thread t1 = new Thread(adderThread1);
		Thread t2 = new Thread(adderThread1);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1 ~ 100 까지의 합 : " + (adderThread1.getNum() + adderThread2.getNum()));
		
	}
}