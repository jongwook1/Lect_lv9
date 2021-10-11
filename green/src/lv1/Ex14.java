package lv1;

public class Ex14 {

	public static void main(String[] args) {
		// 증감연산자
		// ㄴ증가 또는 감소
		
		//1) a = a + 1
		//2) a += 1;	// -=, *=, /=
		
		//3) a++; (후위연산)			// 연산자가 포함된 식이 종료된 후 , 연산이 적용됨
		//4) ++a; (전위연산)			// 연산자가 포함된 식이 시작되기전  , 연산이 적용됨
		
		int a = 10;
		int b = 20;
		int c;
		
		c = a ++ + b;
		System.out.println("c : " + c);		// c = a + b; a++
		System.out.println("a : " + a);		// 11
		c = ++ a + b;
		System.out.println("c : " + c);		// a += 1; c = a +b;
		System.out.println("a : " + a);		// 12
		
		
		
		
		
		
	}

}
