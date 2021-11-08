package exam;

public class Ex08CalculatorMain {

	public static void main(String[] args) {
		long n1 = 987654;
		long n2 = 123456;

		Ex08Calculator cal = new Ex08Calculator();
		
		System.out.println(n1 + " + " + n2 + " = " + cal.add(n1, n2));
		System.out.println(n1 + " - " + n2 + " = " + cal.substract(n1, n2));
		System.out.println(n1 + " * " + n2 + " = " + cal.multiply(n1, n2));
		System.out.println(n1 + " / " + n2 + " = " + cal.divide(n1, n2));
	}
}
