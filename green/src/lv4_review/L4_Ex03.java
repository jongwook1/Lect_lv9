package lv4_review;

import java.util.Random;
import java.util.Scanner;

public class L4_Ex03 {

	public static void main(String[] args) {
		/*
		 * # ���� �߱� ����
		 * 1. me�� 1~9 ������ ���� 3���� ����
		 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
		 * 2. com�� me�� ���� ������ ���� ������ �ݺ�
		 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
		 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
		 * ��)
		 * ���� : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 */
		
			Scanner sc=new Scanner(System.in);	
		int[] com = {1, 7, 3};
		int[] me = new int[3];		
		
		int s=0;
		int b=0;
		
		while(true) {
			for(int i=0;i<3;i++) {
				System.out.print(com[i]+" ");				
			}
			System.out.println();
			for(int i=0;i<3;i++) {
				System.out.print(me[i]+" ");				
			}
			System.out.println("S: "+s+"  B: "+b);
			
			
			for(int i=0;i<3;i++) {
				System.out.println("���� �Է� ��");
				int n=sc.nextInt();
				int check=-1;
				for(int j=0;j<3;j++) {
					if(me[j]==n) {
						check=1;
					}
				}
				if(check==-1) {
					me[i]=n;
				}else {
					System.out.println("�ߺ����� �ȴ�");
					i--;
				}
			}
			
			for(int i=0;i<3;i++) {				
					for(int j=0;j<3;j++) {
						if(com[i]==me[j]) {
							if(i==j) {
								s++;
							}else {
								b++;
							}
						}
					}				
			}
			if(s==3) {
			break;
			}
		}
		

	}

}
