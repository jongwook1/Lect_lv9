package lv6;
class Calculation999{
	double num1;
	double num2;
	double result;	
	
	// �ż���� ��� ���������̶� �������� ǥ�õ� �������� �ߺ��̵Ǿ ���� �ٸ� �����̴�.
	// double a, double b  �� 4���̳� ��������� �����ٸ������̴�. 
	void plus(double a, double b) {
		result = a + b;
	}
	void minus(double a , double b) {
		result = a - b;
	}

	void multiply(double a , double b) {
		result = a * b;
	}
	void division(double a , double b) {
		result = a / b;
	}
	void printResult() {
		System.out.println(result);
	}
}
public class Ex16_02Method_Review {

	public static void main(String[] args) {
		Calculation999 cal =new Calculation999();
		double a = 10;
		double b = 3;
		cal.plus(a, b);
		cal.printResult();
		
		cal.minus(a, b);
		cal.printResult();
		
		cal.multiply(a, b);
		cal.printResult();
		
		cal.division(a, b);
		cal.printResult();

	}

}
