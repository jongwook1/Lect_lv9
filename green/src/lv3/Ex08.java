package lv3;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// ����1)  �ε���(���ȣ)�� �Է��ϸ� �����
				int a[] = { 10,20,30,40,50 };
				// ��) 3 ==> 40
				Scanner sc= new Scanner(System.in);
				System.out.println("�ε��� ��ȣ�� �Է��ϼ���");
				int idx=sc.nextInt();
				if(idx>=0&&idx<=4) {
					System.out.println(a[idx]);
				}else {
					System.out.println("0~4�ǰ��� �Է����ּ���");
				}				
				
				// ����2) �Ʒ��迭�� ����ū�� ���
				// ��) 87
				int b[] = { 12,54,23,87,1 };
				int max =0;
				for(int i=0;i<5;i++) {
					if(b[i]>max) {
						max=b[i];
					}
				}System.out.println("b�迭�� �ִ밪: "+max);
								
				
				// ����3) �Ʒ� �迭�� Ȧ���� ���� ��� 
				int c[] = { 12,54,23,87,1 };
				int cnt =0;
				// ��) Ȧ���� ���� : 3
				for(int i=0;i<5;i++) {
					if(c[i]%2==1) {
						System.out.println("c�迭�� Ȧ����: "+c[i]);
						cnt++;
					}
				}System.out.println("c�迭 Ȧ���� ����: "+cnt);
				
				
				
				// ����4) �Ʒ��迭�� �Ųٷ� ���� 
				int d[] = { 1,2,3,4,5 };
				int e[] = { 0,0,0,0,0 };
				//��)  ={5,4,3,2,1};
				
		

	}

}
