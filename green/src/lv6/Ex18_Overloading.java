package lv6;

//클래스
// 1) 멤버변수
// 2) 메서드

// 메서드 오버로딩 Overloading
// ㄴ같은 클래스 내에서, 같은 이름의 메서드를 여러개 정의할 수 있음
// ㄴ매개변수의 내용이 다르면 됨


class Overload {
	
	int a;		//멤버변수
	int b;		//멤버변수
	
	
	void myPrint(int i) {
		this.a=i;
		System.out.println(i);
	}

	void myPrint(char c) {		
		System.out.println(c);
	}

	void myPrint(String s) {
		System.out.println(s);
	}

	void myPrint(Boolean b) {
		System.out.println(b);
	}

	void myPrint(int i, int j) {
		System.out.println(i + "" + j);
	}
}

public class Ex18_Overloading {

	public static void main(String[] args) {

//		System.out.print();

		Overload ol = new Overload();

		ol.myPrint(1);
		ol.myPrint('c');
		ol.myPrint("str");
		ol.myPrint(false);
		ol.myPrint(1, 2);

	}

}
