package lv3;

import java.util.Scanner;

public class aaaa {

	public static void main(String[] args) {
		// ���� 1) �Ʒ� �迭 a ���� ���� �Է��� ���� ���� b �� ���� 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// ��) 30 ==> b[] = {10,20,40,50,0};
		Scanner sc=new Scanner(System.in);
		System.out.println("���Է� ����");
		int input=sc.nextInt();
		int bidx=0;
		for(int i=0;i<5;i++) {
			if(a[i]!=input) {
				b[bidx]=a[i];
				bidx++;
			}
		}for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
		// ���� 2) �Ʒ� �迭���� ���� �Է��� ��ȣ �� �� �� ���� d �� ����
				int c[] = { 1001, 40, 1002, 65, 1003,  70 };
				int d[] = { 0,0,0,0,0,0 };
//				// ��) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};	
				
			
			System.out.println("�й����� ����");
			int input2=sc.nextInt();
			int didx = 0;
			for (int i = 0; i < 6; i ++) {
				if (input2 == c[i]) {
					d[didx] = c[i + 1];
					didx++;
				}
			}
		
		
		
		
	}

}
