package test;

public class notMain {

	public static void main(String args[]) {
		B goodMorning = (str) -> "Good Morning " + str + "!";
		A add = (a, b) -> a + b;
		A sub = (a, b) -> a - b;
		A mupli = (a, b) -> a * b;
		A subsub = new A() {
			@Override
			public Integer calculate(int a, int b) {
				return a + b + b;
			};
		};

		A divide = (a, b) -> {
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