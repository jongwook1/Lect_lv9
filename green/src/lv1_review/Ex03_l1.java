package lv1_review;

public class Ex03_l1 {

	public static void main(String[] args) {
		// ��) 3�� ����̸鼭, ¦���̸� true ���
				int num = 12;
				System.out.println(num % 3 == 0 && num % 2 == 0);
				
				// ���� 1) ����
				// 3������ ����� 60�� �̻��̸�, true
				// ��, ��� �� �����̶� 50�� �̸��̸�, false
				int kor = 100;
				int eng = 87;
				int math = 41;
				
				System.out.println((kor+eng+math)/3>60);
				

		    // ���� 2) Ű�� 200cm�̻��̰ų� �����԰� 200kg �̻��̸�, ����(true)
				int h=200;
				int w=50;
				
				System.out.println(h>=200||w>=200);
				
	}

}
