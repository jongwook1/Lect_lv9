package lv3;

public class Ex23_1 {

	public static void main(String[] args) {
		// 삼항연산자
		
		//조건식 ? true일때 반환할값 :false일때 반환할값
		
		boolean turn =true;
		int who = turn ? 1 : 2;
		
		int a =10;
		int b =20;
		int max = a>b ? a : b;	//a<b ? b:a;
		System.out.println(max);
				
		
	}

}
