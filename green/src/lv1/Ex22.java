package lv1;

public class Ex22 {

	public static void main(String[] args) {
		// ����1) 1~10���� �ݺ��� 5~9 ���
		// ����1) 5, 6, 7, 8, 9
		// ����2) 10~1���� �ݺ��� 6~3 �Ųٷ� ���
		// ����2) 6, 5, 4, 3
		// ����3) 1~10���� �ݺ��� ¦���� ���
		// ����3) 2, 4, 6, 8, 10
		
		/* ��2
		int num1 = 1;
		
		while(num1 <= 10){			
			num1++;
			if(num1 >= 5 && num1 <= 9) {
				System.out.println(+num1);
			}			
		}
		*/
		
		/* ��2
		int b = 10;
		
		while(b > 0) {
			if(b <= 6 && b >= 3) {
				System.out.println(+b);
			}
			b --;			
		}
		*/
		
		/*��3
		int c = 1;
		
		while(c <= 10 ) {
			if(c % 2 == 0) {
				System.out.println(+c);
			}
			c++;
		}
		*/
		
		
		
		//�⺻����2 
		// ����1) 1~5������ �� ���
		// ���� 1) 15
		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		// ����2) 1, 2, 7, 8, 9, 10
		// ����3) ����2�� ���ǿ� �´� ������ �� ���
		// ����3) 37
		// ����4) ����2�� ���ǿ� �´� ������ ���� ���
		// ����4) 6
		
		
		
		//��1
		int cnt = 0;
		int sum = 0;
		int a = 1;
		while(a <=5) {
			sum +=a;
			a++;
		}
		
		sum = 0;
		a =1;
		while(a <= 10) {
			if(a < 3 || a> 7) {
				System.out.println(a);
				sum += a;
				cnt ++;
			}
			a++;
		}
		//��3
		//���� 37
		System.out.println(+sum);
		
		
		//��4
		//���� 6
		System.out.println(+cnt);
		
		
		
		
		
		
		
		
		
		
	}
}