package lv6;

class NumberMove2 {
	int num; // ��
	int a; // ��

	int method(int a) { // ��
		int num; // ��
		System.out.println(a); // �Ķ���Ͱ����� ���� a �� �� ���θ޼ҵ忡�� �Ķ���ͷ� 100
		System.out.println(this.a); // NumberMove2�� ������� a �� ��
		a += 10;
		return a; // 100+10 �� �Ǿ ����
	}

	void sample() {
		int a = method(100); // a�� method �޼��忡�� 110�� ��
		System.out.println(a);
		System.out.println(this.a); // ��������� ��ȭ����
	}

}

public class E00_Review {

	public static void main(String[] args) {
		NumberMove2 n = new NumberMove2();
//		n.method(100);
		n.sample();
	}

}
