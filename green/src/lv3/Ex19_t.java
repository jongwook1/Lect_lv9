package lv3;

import java.util.Scanner;

public class Ex19_t {

	public static void main(String[] args) {
		/*
		 * # �����̵�[1�ܰ�]
		 * 1. ����2�� ĳ�����̴�.
		 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
		 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
		 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
		 * 4. {0, 0, 2, 0, 0, 0, 0};  ==> ���� ==> {0, 2, 0, 0, 0, 0, 0};
		 * 
		 */		
		Scanner sc= new Scanner(System.in);
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = -1;			//�ε��� ����(��ǥ)		
		
		while(true) {
		for(int i=0; i<7; i++) {
			
			if(game[i] == 2) {
				player = i;		//������ġ ����
			}
//			System.out.print(game[i]);
			if(game[i]==2) {
				System.out.print("�� ");
			}else {
				System.out.print("_ ");
			}
		}
		System.out.println("\n1.����  2.������ 3.����");
		int sel=sc.nextInt();
		if(sel==1 &&player-1>=0) {			
			game[player]=0;
			game[player-1]=2;
		}
		else if(sel==2 && player+1<7) {
			game[player]=0;
			game[player+1]=2;			
		}
		else if(sel==3) {
			System.out.println("�ý��� ����");
			break;
		}
		}		
	}
}
