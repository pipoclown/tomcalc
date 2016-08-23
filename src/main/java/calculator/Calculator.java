package calculator;

public class Calculator {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(1, 1));
	}
	
	int add(int i, int j){
		return i + j;
	}
	
	int subtract(int i, int j){
		return i - j;
	}
}
