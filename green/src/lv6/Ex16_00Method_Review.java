package lv6;
//매서드 기본구조 

//정의
//1) void 				==> 키워드
//2) testPrint() 		==> 이름
//3) {기능}             ==> 실행되는 영역 

//사용법
//t1.testPrint();
//1) t1     ==> 클래스변수명
//2) .testPrint(); ==> .함수이름();
class Test123 {
	void testPrint() {
		System.out.println("!!");
	}

	void printSum() {
		int total = 0;
		for (int i = 1; i <= 5; i++) {
			total += i;
		}
		System.out.println(total);
	}

}

public class Ex16_00Method_Review {

	public static void main(String[] args) {
		Test123 test = new Test123();
		test.testPrint();
		test.printSum();
	}

}
