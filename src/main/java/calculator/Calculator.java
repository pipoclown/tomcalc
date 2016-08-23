package calculator;

public class Calculator {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(1, 1));
		System.out.println(c.subtract(1, 1));
		System.out.println(c.multiply(1, 1));
		System.out.println(c.divide(1, 1));
	}
	
	double add(int i, int j){
		return i + j;
	}
	
	double subtract(int i, int j){
		return i - j;
	}
	
	double multiply(int i, int j){
		return i * j;
	}
	
	double divide (int i, int j){
		return i / j;
	}
}