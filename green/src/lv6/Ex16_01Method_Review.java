package lv6;
//�ż��� �⺻���� 

//����
//1) void 				==> Ű����
//2) setNums 			==> �̸�
//3) (int a , int b )  ==> main���� ������������ �����ϴº���(�Ű�����)
//4) {���}             ==> ����Ǵ� ���� 

//����
//test1.setNums(10, 20);
//1) test1     ==> Ŭ����������
//2) .setNums  ==> .�Լ��̸�
//3) (10, 20); ==> (�����Ұ�);

class Test1234 {
	int num1;
	int num2;

	void setNums(int a, int b) {
		num1 = a;
		num2 = b;
	}

	void printNums() {
		System.out.println(num1 + " " + num2);
	}
}

public class Ex16_01Method_Review {

	public static void main(String[] args) {

		// �Ʒ��Ͱ��� ���� �����ؼ� ��� �Ҽ���������.
		// �ż��带 ���� ����Ҽ����ִ�.
		Test1234 t1 = new Test1234();
		t1.num1 = 10;
		t1.num2 = 20;
		System.out.println(t1.num1 + " " + t1.num2);

		Test1234 t2 = new Test1234();
		t2.setNums(10, 20);
		t2.printNums();

	}

}
