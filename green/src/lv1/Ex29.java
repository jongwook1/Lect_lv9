package lv1;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
			
		/*
		 * # �Ҽ�ã��[1�ܰ�]
		 * 1. �Ҽ���, 1�� �ڱ��ڽ����θ� �������� ��
		 * 2. ��) 2, 3, 5, 7, 11, 13, ..
		 * 3. ��Ʈ
		 * 1) �ش� ���ڸ� 1���� �ڱ��ڽű��� ������.
		 * 2) �������� 0�� ������ ī��Ʈ�� ����.
		 * 3) �� ī��Ʈ ���� 2�̸� �Ҽ��̴�.      tip;�����������Ƚ���� �������
		 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	�Ҽ�x
		 * 
		 * ���� �� ���� �Է¹޾�, �ش� ���ڰ� �Ҽ����� �ƴ��� �Ǻ��Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Ѱ��� �Է��ϼ���");
		int num = sc.nextInt();
		
		int div = 0;
		
		int i = 1; //1~num
		while(i <= num) {
			if(num % i == 0) {		//i % num ���� �����ʱ� ����!
				div ++;
			}			
			i ++;
		}
		if(div == 2) {
			System.out.println("�Ҽ��̴�");
		}else {
			System.out.println("�Ҽ��� �ƴϴ�");
		}
	}

}		
		
		
		
		
		
		
		
		
		
		
		
/*	�����Ѱ�
 * Scanner sc = new Scanner(System.in);	
	int n = 1;
	int cnt = 0;
	boolean isRun = true;
	
	System.out.println("���ڸ� �Է��ϼ���");
	int inputN = sc.nextInt();	
			
	while(n <= inputN) {
		int a = (inputN % n);
		//System.out.println("a"+a);
			if(a == 0) {
				//System.out.println(+inputN +"�� �Ҽ��̴�");
					cnt++;
			}else {
				//System.out.println("�Ҽ����ƴϴ�");
			}
		n++;
	}
	if(cnt == 2) {
		System.out.println(+inputN +"�� �Ҽ��̴�");
	}else {
		System.out.println(+inputN+"�� �Ҽ��� �ƴϴ�");
	}
	*/

