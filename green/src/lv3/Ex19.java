package lv3;

import java.util.Scanner;

public class Ex19 {

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
	//	int[] game2 = {0, 0, 0, 0, 0, 0, 0};
		int player = -1;
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player = i;			//2�ε���
			}System.out.println(game[i]);
			
			
		}for(int i=0; i<7; i++) {
			int sel=sc.nextInt();
			
			if(sel==1) {
				System.out.println(game[i]);
				
				//System.out.println(game[i]);
			}
			
		}
		System.out.println("1.����  2.������");
		int sel=sc.nextInt();

		
		
		
	}

}
