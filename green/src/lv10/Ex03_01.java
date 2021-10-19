package lv10;
// 상속 < 추상화 < 인터페이스
// ㄴ"메소드"에 대한 상속 강제성의 정도
// ㄴ 자식클래스에서 부모가

//<상속>
// 부모-자식
// ㄴ 부모가 우선 생성
// ㄴ 그다음 자식 생성가능
// ㄴ 부모가 가진 모든 것을 -> 자식이 물려 받음

// 모든 클래스는 최상위 오브젝트인 Object라는 클래스를 기본으로 상속받는다
class A9{
	int a;
	void methodA() {}
	
	
	// 최상위 Object 클래스로부터 물려받은 메소드를 -> 재정의 할 수 있음
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

// 상속 관계를 정의하는 방법
// class 자식클래스명 extends 부모클래스명{}
// 자식은 부모가 가진 모든 멤버를 사용할 수 있게 됨
class B9 extends A9{
	int a;
	int b;
	
	public B9() {
		this.a = 99;
		super.a = 100; 		// 부모의 멤버(자식 메서드에서 이름이 겹치지 않는 경우, super. 생략 가능)
		super.methodA(); 	//부모의 메소드
	}
	
	void methodB() {}
	
	
}


class C9{
	int c;
	
	public C9(int c) {
		this.c =  c;		
	}
}

class D9 extends C9{
	int d;
	
	public D9(int c) {		//물려받은 부모C 가 기본생성자를 허용X -> 부모의 생성자가 필요로 하는 인자를 받아야
		super(c);			// 부모 먼저 생성 한 후,
							// 자식 생성 가능
	}

}

// 추상클래스
// abstract class 클래스명{}
// ㄴ메소드에 대하여 !!!선택적!!!으로 강제성을 부여할 수 O
// ㄴ 강제할 메소드 앞에 abstract 키워드를 붙여주고, 바디부분={}은 없이 선언부만있게
abstract class E9{
	int e;
	abstract void methodE() ;		//메소드의 선언부만 남김 body는 작성 X -> {}X
}

// 추상클래스를 상속받는 자식 클래스는 
// 반드시 부모가 정한 추상메소드를
// 오버라딩(재정의) 해야만 함
class FF9 extends E9{

	@Override
	void methodE() {
		// TODO Auto-generated method stub
		
	}
}

// 인터페이스
// interface 인터페이스명{}
// ㄴ !!!모든 메소드에 대하여 강제성!!!을 부여O
// ㄴ 상수와 메소드를 멤버로 가질 수 있음

interface G9{
	final int g = 1;
	void methodG();		//강제하는 메소드는 모두 선언부만 있어야한다. 즉 인터페이스는 모든 메소드가 강제되므로 모든 메소드는 선언부만있어야함
	void methodTest();
}

// 인터페이스 상속을 받을 때에는 
// implements 키워드를 사용
class H9 implements G9{

	@Override
	public void methodG() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodTest() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex03_01 {

	public static void main(String[] args) {
		
		A9 a = new A9();
		a.a = 1;
		
		B9 b = new B9();
		b.b = 2;

	}

}
