package lv6;
//매서드 기본구조 

//정의
//1) void 				==> 키워드
//2) setNums 			==> 이름
//3) (int a , int b )  ==> main에서 보내진값들을 저장하는변수(매개변수)
//4) {기능}             ==> 실행되는 영역 

//사용법
//test1.setNums(10, 20);
//1) test1     ==> 클래스변수명
//2) .setNums  ==> .함수이름
//3) (10, 20); ==> (전달할값);

class Test1234 {
	int num1;
	int num2;

	void setNums(int a, int b) {
		num1 = a;
		num2 = b;
	}

	void printNums() {
		System.out.println(num1 + " " + num2);
	}
}

public class Ex16_01Method_Review {

	public static void main(String[] args) {

		// 아래와같이 같을 저장해서 출력 할수도있지만.
		// 매서드를 만들어서 사용할수도있다.
		Test1234 t1 = new Test1234();
		t1.num1 = 10;
		t1.num2 = 20;
		System.out.println(t1.num1 + " " + t1.num2);

		Test1234 t2 = new Test1234();
		t2.setNums(10, 20);
		t2.printNums();

	}

}
