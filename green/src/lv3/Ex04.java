package lv3;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// �ε��� 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };
		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1 ���� : 11��
		Scanner sc= new Scanner(System.in);
		
//
//		
//		for(int i =0; i<5;i++) {			
//			System.out.println("�ε��� ��ȣ�� �Է��ϼ���");
//			int inN =sc.nextInt();
//			//System.out.println(arr[i]);
//			System.out.println("�ε��� ��ȣ: "+inN+" ���� : " + arr[inN]);			
//		}		
//		
		System.out.println("��������� ���ϴ� �ε��� �Է� (0~4):");
		int idx = sc.nextInt();
		if(idx >= 0 && idx < 5) {
			System.out.println(arr[idx]);
		}

		
		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11 �ε��� : 1
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		
		System.out.println("�����Է�");
		int score = sc.nextInt();
		
		for(int i = 0; i<5; i++) {
			if(scores[i] == score) {
				System.out.println(i);
			}
		}
		
		

//		for(int i =0; i<5;i++) {			
//			
//			int inN =sc.nextInt();
//			
//			
//		}
		
		
		

		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003 ���� : 45��
		
		
	
		

	}

}
