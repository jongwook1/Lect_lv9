package lv1;

public class Ex14 {

	public static void main(String[] args) {
		// ����������
		// ������ �Ǵ� ����
		
		//1) a = a + 1
		//2) a += 1;	// -=, *=, /=
		
		//3) a++; (��������)			// �����ڰ� ���Ե� ���� ����� �� , ������ �����
		//4) ++a; (��������)			// �����ڰ� ���Ե� ���� ���۵Ǳ���  , ������ �����
		
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
