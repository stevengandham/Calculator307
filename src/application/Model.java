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
		case "log":
			return java.lang.Math.log10(y);
		default:
			return 0;
		}
	}
}
