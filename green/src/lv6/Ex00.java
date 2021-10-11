package lv6;
//변수의 Scope(지역 , 생명주기)
//ㄴ 변수는 자신이 선언된 지역{}을 벗어날수 없다.
class NumberMove{
	int num;			//㉠
	int a;				//㉢a
	
	int method(int a) {		//㉣a     //㉢ 과㉣는 다른놈
		int num;		//㉡					㉠과 ㉡는 다른놈
		System.out.println(a);
		System.out.println(this.a);
		a+=10;
		return a;
	}
	
	void sample() {
		int a =method(100);
		System.out.println(a);
		System.out.println(this.a);
	}
}



public class Ex00 {

	public static void main(String[] args) {
		NumberMove nm=new NumberMove();
//		nm.method(100);
		nm.sample();

	}

}
