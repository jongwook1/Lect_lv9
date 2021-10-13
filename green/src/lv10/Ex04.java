package lv10;

// 상속 < 추상화 < 인터페이스
// "메소드" 강제성을 부여할 수 있게됨 (일반메소드는 상속시 강제성이 없음 (예시-AAA를 상속받은 클래스D 상속받은내용 주석처리해도 오류안뜨는거))

class AAA{
	int a;
	void methodAAA() {
		
	}
}
//추상 클래스
// 클래스명 앞에 abstract
abstract class BBB{
	int b;
	//강제할 메소드 앞에 abstract 키워드를 붙임
	void methodBBB() {
		
	}
	
	abstract void methodBBBB() ;		//추상 메소드는 정의부만 있어야 함
//	{
//		
//	}
}


//인터페이스
// interface 인터페이스명{}
// 인터페이스는 메소드의 군집
// 상수와 메소드만 정의할 수 있다

interface CCC{
	final int c=10;
	void methodCCC() ;
}

class D extends AAA{
	
//void methodA() {
//	super.methodAAA();
//}
}
// 추상 클래스를 상속받은 자식 클래스는
// 부모 정해놓은(강제하는) 메소드를 반드시 재정의 해야 한다.
class E extends BBB{

	@Override
	void methodBBBB() {
		// TODO Auto-generated method stub
		
	}
	
}
interface EE{
	void methodEE();
	void methodPrint();
	void methodinfo();
}


// 인터페이스에 대한 상속은 여러개를 할 수 있다. (다중상속의 효과)
class F implements CCC, EE{

	@Override
	public void methodCCC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodEE() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodPrint() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodinfo() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
