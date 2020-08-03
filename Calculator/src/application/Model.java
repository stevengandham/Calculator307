package application;

public class Model {
	public double evaluate(double x, double y, String operator) {
		switch(operator) {
		case "+":
			return x + y;
		case "-":
			return x - y;
		case "*":
			return x * y;
		case "/":
			if (y == 0)
				return 0;
			return x / y;
			
		default:
			return 0;
		}
	}
}
