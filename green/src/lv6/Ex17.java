package lv6;

class Calculator {
	// 0. guide message(���)
	void message() {
		System.out.println("0. guide message");
	}

	// 1. ����
	int plus(int num1, int num2) {
		int sum = 0;
		return sum = num1 + num2;
	}

	// 2. ����
	int minus(int num1, int num2) {
		int m = 0;
		return m = num1 - num2;
	}

	// 3. ����
	int multi(int num1, int num2) {
		int t = 0;
		return t = num1 * num2;
	}

	// 4. ������
	double division(int num1, int num2) {
		int d = 0;
		return d = num1 / num2;
	}

	// 5. %
	double na(int num1, int num2) {
		int n = 0;
		return n = num1 % num2;
	}
}

public class Ex17 {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		cal.message();
		
		int a = 10;
		int b = 20;

		// 1.����
		System.out.println(cal.plus(a, b));

		// 2.����
		System.out.println(cal.minus(a, b));

		int c = 4;
		int d = 5;
		// 3.����
		System.out.println(cal.multi(c, d));

		// 4.������
		System.out.println(cal.division(c, d));

		// 5.������
		System.out.println(cal.na(c, d));

	}

}
