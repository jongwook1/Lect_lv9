package lv4_review;

import java.util.Scanner;

public class L4_Ex01 {

	public static void main(String[] args) {
		/*
		 * # �����̵�[2�ܰ�]
		 * 1. ����2�� ĳ�����̴�.
		 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
		 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
		 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
		 * 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
		 * 5. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
		 */

		
		Scanner sc = new Scanner(System.in);
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};

		int x=-1;
		
		while(true) {
			for(int i=0;i<game.length;i++) {
			if(game[i]==0) {
				System.out.print("_ ");
			}
			else if(game[i]==1) {
				System.out.print("�� ");
			}
			else if(game[i]==2) {
				System.out.print("�� ");
				x=i;
			}
			}
			
			
			System.out.println("\n�̵��Ұ� ���� ����1)����. 2)������  3)����");
			int sel=sc.nextInt();
			
			if(sel==1&&x-1>=0&&game[x-1]!=1) {
			game[x]=0;
			game[x-1]=2;
				
			}else if(sel==2&&x+1<game.length&&game[x+1]!=1) {
				game[x]=0;
				game[x+1]=2;
				
			}else if(sel==3) {
				if(x-1>=0&&game[x-1]==1) {
					game[x-1]=0;
				}else if(x+1<game.length&&game[x+1]==1) {
					game[x+1]=0;
				}
			}
			
		}
	}

}
