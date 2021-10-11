package lv6;

class Data1234 {
	int result;
}

class Calc1234 {
	void plus(Data1234 data, int a, int b) {
		data.result = a + b;
	}

	void minus(Data1234 data, int a, int b) {
		data.result = a - b;
	}
}

public class Ex16_05Method_Revieww {

	public static void main(String[] args) {
		Data1234 data = new Data1234();
		Calc1234 calc = new Calc1234();

		// data 는 new Data() 의 주소가 들어있기때문에 가능하다.
		calc.plus(data, 10, 3);
		System.out.println(data.result);
		calc.minus(data, 10, 3);
		System.out.println(data.result);

	}

}
