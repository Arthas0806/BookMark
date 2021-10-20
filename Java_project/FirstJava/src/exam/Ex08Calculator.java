package exam;

public class Ex08Calculator implements Calculator {
	
	long number;
	double number2;
	
	@Override
	public long add(long n1, long n2) {
		number = n1 + n2;
		return number;
	}
	@Override
	public long substract(long n1, long n2) {
		number = n1 - n2;
		return number;
		
	}

	@Override
	public long multiply(long n1, long n2) {
		number = n1 * n2;
		return number;
	}

	@Override
	public double divide(double n1, double n2) {
		number2 = n1 + n2;
		return number2;
	}
}
