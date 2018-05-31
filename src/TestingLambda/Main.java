package TestingLambda;

public class Main {

	public static void main(String args[]) {
		GreetingInterface goodMorning = (str) -> "Good Morning " + str + "!";
		MathInterface add = (a, b) -> a + b;
		MathInterface sub = (a, b) -> a - b;
		MathInterface mupli = (a, b) -> a * b;
		MathInterface subsub = new MathInterface() {
			@Override
			public Integer calculate(int a, int b) {
				return a + b + b;
			};
		};

		MathInterface divide = (a, b) -> {
			if (b == 0) {
				return 0;
			} else {
				return a / b;
			}
		};
		System.out.println(add.calculate(1, 2));
		System.out.println(sub.calculate(1, 2));
		System.out.println(mupli.calculate(2, 2));
		System.out.println(divide.calculate(2, 0));
		System.out.println(divide.calculate(2, 2));
		System.out.println(subsub.calculate(2, 2));
	}

}