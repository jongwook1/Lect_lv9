package lv3;

import java.util.Scanner;

public class Ex23_test {

	public static void main(String[] args) {
		/* 
		 * # ƽ����
		 * === ƽ���� ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [ ][ ][ ]
		 * [p1]�ε��� �Է� : 6
		 * === ƽ���� ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [O][ ][ ]
		 * [p1]�¸�
		 * 
		 */
		Scanner sc= new Scanner(System.in);
		int[] game = new int[9];


		int turn=1;
		
		while (true) {
			for (int i = 0; i < 9; i++) {
				if (game[i] == 1) {
					System.out.print("O ");
				} else if (game[i] == 2) {
					System.out.print("X ");
				} else {
					System.out.print(i + 1 + " ");
				}
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			System.out.println("��ǥ�Է� ����");
			int idx = sc.nextInt()-1;
			
			if(game[idx]!=0) {
				System.out.println("�̹��Էµ���ǥ��");
			}else {
				game[idx]=turn;
				if(turn==1) {				
					turn++;
				}else {				
					turn--;
				}
			}
			int who= turn==1 ? 2:1;
			
			//����
			for(int i=0;i<9;i+=3) {
				int cnt=0;
				for(int j=0;j<3;j++) {
					if(game[i+j]==who) {
						cnt++;
					}
				}
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
