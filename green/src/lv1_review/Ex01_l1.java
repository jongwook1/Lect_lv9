package lv1_review;

public class Ex01_l1 {

	public static void main(String[] args) {
		// ��) ������ 1000���ִ�. 200��¥�� ���� ���� ��, �ܵ� ���
		int ���� = 1000;
		int ���� = 200;
		int �ܵ� = ���� - ����;
		System.out.println("�ܵ� = " + �ܵ� + "��");

		// ����1) ������ 100���̴�. ������? (���� : ���� 10% ����)
		int ����=100;
		int ��������=100*12;
		int ���� =	��������/10	;
		int ���Ŀ���=��������-����;
		System.out.println("���� = "+���Ŀ���+"��");
		
		// ����2) ���������� 30, 50, 4�� �� �޾Ҵ�. �����?
		int a=30;
		int b=50;
		int c=4;
		int total=a+b+c;
		double avg=total/3.0;
		System.out.println("���: "+avg+"��");
		
		// ����3) ���ΰ� 3�̰� ���ΰ� 6�� �ﰢ�� ���� ���
		int x=3;
		int y=6;
		int ����=x*y/2;
		System.out.println("����: "+����);
		
		// ����4) 100�ʸ� 1�� 40�ʷ� ���
		int total1=100;
		int m=100/60;
		int s=100%60;
		System.out.println("100�ʸ� ���ʷ� �ϸ�"+m+"��"+s+"��");
		
		
		// ����5) 800������ 500��¥�� ���� , 100��¥�� ����
		// ����5) 500��(1��), 100��(3��)
		int money=800;
		int o=money%500;
		int p=(money%500)/100;
		System.out.println("500"+o+"��");
		System.out.println("100"+p+"��");
		
		
	}

}
