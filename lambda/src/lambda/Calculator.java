package lambda;

public class Calculator {

	public int operation(int a, int b, Calculate calculate) {
		return calculate.arithmaticOperations(a, b);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.operation(10, 20, (int x, int y) -> x + y));
		System.out.println(calculator.operation(10, 20, (int x, int y) -> x - y));
		System.out.println(calculator.operation(10, 20, (int x, int y) -> x * y));
	}

}
