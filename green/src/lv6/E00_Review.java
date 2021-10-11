package lv6;

class NumberMove2 {
	int num; // ㉠
	int a; // ㉡

	int method(int a) { // ㉣
		int num; // ㉢
		System.out.println(a); // 파라미터값으로 받은 a 즉 ㉣ 메인메소드에서 파라미터로 100
		System.out.println(this.a); // NumberMove2의 멤버변수 a 즉 ㉡
		a += 10;
		return a; // 100+10 이 되어서 리턴
	}

	void sample() {
		int a = method(100); // a는 method 메서드에서 110이 댐
		System.out.println(a);
		System.out.println(this.a); // 멤버변수는 변화없음
	}

}

public class E00_Review {

	public static void main(String[] args) {
		NumberMove2 n = new NumberMove2();
//		n.method(100);
		n.sample();
	}

}
