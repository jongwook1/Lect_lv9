package lv6;
//�ż��� �⺻���� 

//����
//1) void 				==> Ű����
//2) testPrint() 		==> �̸�
//3) {���}             ==> ����Ǵ� ���� 

//����
//t1.testPrint();
//1) t1     ==> Ŭ����������
//2) .testPrint(); ==> .�Լ��̸�();
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
