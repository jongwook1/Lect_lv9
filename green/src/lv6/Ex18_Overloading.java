package lv6;

//Ŭ����
// 1) �������
// 2) �޼���

// �޼��� �����ε� Overloading
// ������ Ŭ���� ������, ���� �̸��� �޼��带 ������ ������ �� ����
// ���Ű������� ������ �ٸ��� ��


class Overload {
	
	int a;		//�������
	int b;		//�������
	
	
	void myPrint(int i) {
		this.a=i;
		System.out.println(i);
	}

	void myPrint(char c) {		
		System.out.println(c);
	}

	void myPrint(String s) {
		System.out.println(s);
	}

	void myPrint(Boolean b) {
		System.out.println(b);
	}

	void myPrint(int i, int j) {
		System.out.println(i + "" + j);
	}
}

public class Ex18_Overloading {

	public static void main(String[] args) {

//		System.out.print();

		Overload ol = new Overload();

		ol.myPrint(1);
		ol.myPrint('c');
		ol.myPrint("str");
		ol.myPrint(false);
		ol.myPrint(1, 2);

	}

}
