package lv1_review;

public class Ex05_l1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		if(a == b) {
			System.out.println("���� O");
		}
		
		if(a != b) {
			System.out.println("���� X");
		}
		
		// ���� 1) ���, 0, ���� ���
		int num1 = -10;
		if(num1>0) {
			System.out.println("���");
		}		
		if(num1==0) {
			System.out.println("0");
		}
		if(num1<0) {
			System.out.println("����");
		}
		// ���� 2) 4�� ��� ���
		int num2 = 12;
		if(num2%4==0) {
			System.out.println(num2);
		}
		
				
		// ���� 3) �հ�, ���հ� ���
		int score = 87;	
		if(score>=60) {
			System.out.println("��");
		}if(score<60) {
			System.out.println("��");
		}
		

	}

}
