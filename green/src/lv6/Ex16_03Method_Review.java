package lv6;

class Test12345 {
	void setValue(int a) {
		// ���� a�� main a�� �̸��� ���Ƶ� �ƹ� �������.
		a = 100;
	}
}

public class Ex16_03Method_Review {

	public static void main(String[] args) {
		int a = 56;
		Test12345 t1 = new Test12345();

		// �ż���� ���� �����ϴ°��̱� ������ main���� a�� ������ ����
		t1.setValue(a);
		System.out.println(a);

		System.out.println("-------------------");

		// �Ʒ� ������ ���� ��Ȳ�̴�.
		int b = 20;
		int c = b;
		c = 100;
		System.out.println(b);

	}

}
