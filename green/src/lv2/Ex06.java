package lv2;

public class Ex06 {

	public static void main(String[] args) {
		// ���
		// ���ǹ� if, switch�� ���׿����� 
		// �ݺ��� while, for
		// ������� break, continue
		
		// switch-case
		// switch(���� ����)
		//{
		// case ������ : �����ҹ�;
		// case ������ : �����ҹ�;
		// case ������ : �����ҹ�;
		// case ������ : �����ҹ�;
		//}
		
		int grade = 2; // 1 vip, 2 ���, 3 �ǹ�
			//if-else  : ������ ���ǽ��� �켱�ȴ�(�켱���� �߻�)
		if(grade == 1) {
			System.out.println("vip");
		}
		else if(grade ==2) {
			System.out.println("�ǹ�");
		}
		else if (grade ==3) {
			System.out.println("���");
		}

		//switch-case : ����ó��
		switch(grade) {
		case 1 :
			System.out.println("vip ���úο�");
		case 2 :
			System.out.println("��� ���úο�");
			break;		//
		case 3 :
			System.out.println("�ǹ� ���úο�");		
		}
		
		//���׿�����
		// ���ǽ� ? true�϶� ��ȯ�ҹ��� : false�϶� ��ȯ�� ����

		int coin = 1; 		//1: ��  2: ��

		if(coin == 1) {
			System.out.println("��");
		}
		else {
			System.out.println("��");
		}
		
		
		
		String msg = coin == 1 ? "�ո�" : "�޸�";
			System.out.println(msg);
			
		
		
		
		
	}

}
