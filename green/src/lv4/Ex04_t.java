package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex04_t {

	public static void main(String[] args) {
		/*
		 * # ���� �߱� ����		
		 * 1. com�� 1~9 ������ ���� 3���� ����			//		me�� �ڽ����Է�
		 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
		 * 2. com�� me�� ���� ������ ���� ������ �ݺ�  //3strike ������ ����
		 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
		 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
		 * ��)
		 * ���� : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 */
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];			//null
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		boolean win =false;
		while(!win) {
			int s=0;
			int b=0;
			
			me =new int[3];//���ʱ�ȭ�ؾ� �ߺ��ȉ�  �ƴϸ� ����me =new int[3]������ nulló��
			
			//���
			for(int i=0;i<3;i++) {
				System.out.print(com[i]+ " ");
			}
			System.out.println();
			for(int i=0;i<3;i++) {
				System.out.print(me[i]+ " ");
			}
			System.out.println();
			
			//�Է�
			for(int i=0;i<3;i++) {
				System.out.printf("����%d: ", i+1);
				int num=sc.nextInt();
						
				int check=1;		
				for(int j=0;j<3;j++) {
					if(me[j]==num) {
						check=-1;
					}
				}
				if(check==1) {
					me[i]=num;
				}else {
					System.out.println("�ߺ��� �ԷºҰ�");
					i--;								//���������ؾȰ�
				}			
				
						
			}
			//�˻�
			for(int i=0;i<3;i++) {		//com �迭 ���� (����)
				for(int j=0;j<3;j++) {
					if(com[i]==me[j]) {
						if(i==j) {
							s++;
						}
						else {
							b++;
						}
						
						
					}
				}
			}
			System.out.println(s+ "s");
			System.out.println(b+ "b");
			
			
			
			//��������
			if(s==3) {
				System.out.println("���� Ŭ����");
				win =true;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
