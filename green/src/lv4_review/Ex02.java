package lv4_review;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
				/* # �����̵�[2�ܰ�]
				 * 1. ����2�� ĳ�����̴�.
				 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
				 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
				 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
				 * 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
				 * 5. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
				 */
				Scanner sc=new Scanner(System.in);
				 int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
				 
				 int p=-1;
				 while(true) {
					 for(int i=0;i<game.length;i++) {
						 if(game[i]==0) {
							 System.out.print("__ ");
						 }
						 else if(game[i]==1) {
							 System.out.print("| ");
						 }
						 else if(game[i]==2) {
							 System.out.print("�� ");
							 p=i;
						 }
					 }
//					 break;
					 System.out.println("1.�� 2.�� 3.����");
					 int sel=sc.nextInt();
					 if(sel==1&& p-1>0&&game[p-1]!=1) {
						 game[p]=0;						 
						 game[p-1]=2;					 
					 }
				 }
				 
				 
				 
				 
				 
	}

}
