package lv1;

public class EX04_1 {

	public static void main(String[] args) {
		//�������� �̸� ��Ģ
		//1)ī��ǥ���
		//2)�밡����
		
		// ������ ����ؼ� �����ذ�
		
		// ������ 1000���ִ�. 200��¥�� ���� ���� ��, �ܵ� ���
		
		int money = 1000;
		int price = 200;
		int payback = money - price;
		
		System.out.println("�ܵ��� " + payback + "�� �Դϴ�.");
		

		// ����1) ������ 100���̴�. ������? (���� : ���� 10% ����)
				// ����2) ���������� 30, 50, 4�� �� �޾Ҵ�. �����?
				int n1 = 30;
				int n2 = 50;
				int n3 = 4;
				System.out.println((n1+n2+n3)/3);				
		
				// ����3) ���ΰ� 3�̰� ���ΰ� 6�� �ﰢ�� ���� ���
				int n4 = 3; 
				int n5 = 6;
				System.out.println((n4*n5)/2);
				
				// ����4) 100�ʸ� 1�� 40�ʷ� ���
				int n6 = 100;
				int n7 = 60;
				System.out.println((n6/n7) +"��"+ (n6%n7) + "��");
				// ����5) 800������ 500��¥�� ���� , 100��¥�� ����
				double d1 = 800;
				double d2 = 500;
				
				System.out.println(d1/d2 +"��");
				
				
				// ����5) 500��(1��), 100��(3��)
				
				//������ �� �Ѱ��� ���� ������ �� ����
				
				//����ü ���� (��Ʈ : ���� Ȱ��)
				int x = 10;
				int y = 20;
		//�߸��� �� 		x = y;
		//				y = x;
				int z;
				z = x;
				x = y;
				y = z;
				
				
				
				System.out.println(x);		//20
				System.out.println(y);		//10
		
		
	}

}
