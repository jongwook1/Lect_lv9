package lv10;
//상속

//class 정의 -> 객체 생성(instance)
//모든 클래스는 최상위 클래스인 Object를 상속을 받는다 (Object가 부모)	: default //그외 자신이 만든 클래스는 지정이 필요
//부모가 가진 모든 멤버는 자식이 모두 물려받는다 

class Sample{
	
}

class AA{
	public int a;
	
	void print() {
		System.out.println("a: "+ this.a);
	}
}

class B extends AA{		// 클래스 A로부터 상속을 받은 클래스 B
	int b;
}

class C{
	int c;
}

//별도의 패키지를 만들어서 ->
//class C extend A{}

public class Ex03 {

	public static void main(String[] args) {
		Sample sample = new Sample();
		System.out.println(sample.toString());
		System.out.println(sample);

//		A a = new A();
//		a.a = 10;
		
		B b = new B();		//부모 클래스인 A가 먼저 생성됨
		b.b = 20;
//		b.a = 11;
		b.print();
		
		C c = new C();
		c.c = 30;
	}

}


