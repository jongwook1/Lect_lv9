package lv1;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		

		/*
		 * # �ִ밪 ���ϱ�[1�ܰ�]
		 * 1. ���� 3���� �Է¹޴´�.
		 * 2. �Է¹��� 3���� ���� ���Ͽ�,
		 * 3. ���� ū ��(MAX)�� ����Ѵ�.
		 */
				 
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("����1�Է�: ");
		a = sc.nextInt();
		System.out.println("����2�Է�: ");
		b = sc.nextInt();
		System.out.println("����3�Է�: ");
		c = sc.nextInt();
		
		int max = a;	//�񱳴���� ���� �� ������ �Ѱ� ������ �ʱ�ȭ
		
		if(max < b) {
			max = b;
		}
		if(max < c) {			//else �� ���� ���������Ƿ� �ȴ�
			max = c;
		}
	}

}
