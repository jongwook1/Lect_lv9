package lv6;
//������ Scope(���� , �����ֱ�)
//�� ������ �ڽ��� ����� ����{}�� ����� ����.
class NumberMove{
	int num;			//��
	int a;				//��a
	
	int method(int a) {		//��a     //�� ������ �ٸ���
		int num;		//��					���� ���� �ٸ���
		System.out.println(a);
		System.out.println(this.a);
		a+=10;
		return a;
	}
	
	void sample() {
		int a =method(100);
		System.out.println(a);
		System.out.println(this.a);
	}
}



public class Ex00 {

	public static void main(String[] args) {
		NumberMove nm=new NumberMove();
//		nm.method(100);
		nm.sample();

	}

}
