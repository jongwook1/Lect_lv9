package lv1;

public class Ex05 {

	public static void main(String[] args) {
		// �񱳿����� (�������� ������� ��ȯ)
		// > < >= <=
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		
		boolean result;
		result = num1 == num2;
		System.out.println("num1�� num2�� ������ :"+result);
		
		// ��������
		//1) and &&
		//2) or ||
		
		
		// num1�� num2�� ���ų�(or) num1�� �۴�
		System.out.println(num1 == num2 || num1 < num2);
		
		// num1�� num2�� ����(and) num1�� �۴�
		System.out.println(num1 == num2 && num1 < num2);
				
		
		
		// ��) 3�� ����̸鼭, ¦���̸� true ���
				int num = 12;
				System.out.println(num % 3 == 0 && num % 2 == 0);
				// ���� 1) ����				
				// 3������ ����� 60�� �̻��̸�, true
				// ��, ��� �� �����̶� 50�� �̸��̸�, false
				int kor = 100;
				int eng = 87;
				int math = 41;
				
				double avg = (kor + eng + math) / 3.0;
								
				System.out.println(avg >= 60 && kor >= 50 && eng >= 50 && math >= 50   );
				
				
			//���� 2) Ű�� 200cm �̻��̰ų�
			// �����԰� 200kg �̻��̸�, ����(true)
				int height = 180;
				int weight = 80;
				
				
		
		
	}

}
