package lv1;

public class Ex21 {

	public static void main(String[] args) {
		
		//��� : ���α׷��� ���� �帧�� ����
		//	�� ���ǹ�, �ݺ���, �������
		
		// ����� ����
		//	��Ű����(���ǽ�){ ���๮; }
		
		//�ݺ��� : while, for
//			while(true){
//		System.out.println("�ݺ���>>");
//	}	
		
		//	�ݺ��� ���� ����
		// 1 �ʱ�� 
		// 2 ���ǽ�
		// 3 ������
		
		//ex���� n�� 5���� �����ϸ� -> �ݺ��� ����
		int num = 0;					// �ʱ�� : �ݺ��� �ۿ��� ������ ����
		
		while(num < 5) {				//���ǽ� : �ʱ���� ������ ������ ����
			System.out.println(num);
			num ++;						// ������ : �ʱ���� ������ ��ȭ��Ŵ
			
		}
		
		System.out.println("num: " + num);	//5
		
		
		
	}

}
