package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		/*
		 * # Up & Down ����[2�ܰ�]
		 * 1. com �� �������� 1~100���̸� �����Ѵ�.
		 * 2. me �� 1~100���̸� �Է��Ѵ�. 	 
		 * 3. com �� me �� ���ؼ� com ũ�� "ũ��" , com �������� "�۴�" ��Ʈ���� 
		 * 4. ������ ���߸� ������ ����ȴ�.
		 */
		
		//���� n�� 5���� �����ϸ� -> �ݺ��� ����
//		int n = 0;
//		while(n<10) {
//			if()
//			System.out.println("�ݺ���");
//			if(n<4) {
//				n = 11;
//			}
//			n++;
//		}
	
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int quiz = rn.nextInt(100)+1;
		System.out.println("����" + quiz);
		
		//boolean isRun = true;		
		int isRun = 1;
		while(isRun == 1) {
			System.out.println("���� :");
			int answer = sc.nextInt();
			
			if(quiz == answer) {
				System.out.println("������");
				//�ݺ��� ����
			//	isRun = false;
				isRun = 0;
			}
			else if(quiz > answer) {
				System.out.println("��");
			}else if(quiz < answer) {
				System.out.println("�ٿ�");
			}
		}		
	}
}
