package lv4;

import java.util.Scanner;

public class Ex30_t_omok {

	public static void main(String[] args) {
		// ������ 10*10 �˻�� �ټ����ؾ���							//�������ε��� ���� �˻�

		Scanner sc = new Scanner(System.in);
		
//		int[][] omok = {
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//		};
		int p1Y = 0;
		int p1X = 0;
		int p2Y = 0;
		int p2X = 0;

		
		final int SIZE = 10;
		
		int omok[][]=new int [SIZE][SIZE];
				
		int win = 0;
		int turn=1;
		
		while(true) {
			//���
			for(int i=0;i<SIZE;i++) {
				for(int j=0;j<SIZE;j++) {
					if(omok[i][j]==1) {
						System.out.print("[O] ");
					}
					else if(omok[i][j]==2){
						System.out.print("[X] ");
					}else {
						System.out.print(i+""+j+"  ");
					}
				}
				System.out.println();
			}
			//end
			if(win !=0) {
				System.out.printf("p%d �¸�!",win);
				break;
			}

			//input
			System.out.printf("p%d Y: ", turn);
			int y=sc.nextInt();
			System.out.printf("p%d X: ", turn);
			int x=sc.nextInt();
			
			if(y>=0 && y<SIZE && x>=0 && x<SIZE && omok[y][x]==0) {				//omok[y][x]==0 �켱���������ϱ�
				omok[y][x]=turn;
				// -
				for(int i=0; i<SIZE;i++) {
					for(int j=0;j<SIZE-4;j++) {	//j<=SIZE-5 ����
						int cnt=0;
						if(omok[i][j]==turn) {				//���� �������������
															//����� int cnt=0;�־��
							for(int k=0;k<5;k++) {			//5�����鼭 5ȸ ���ι��� �˻�	//�����˻繮
								if(omok[i][j+k]==turn) cnt++;
							}
						}
						if(cnt==5) win =turn;
					}
				}
				
				
				// |
				for(int i=0; i<SIZE;i++) {
					for(int j=0;j<SIZE-4;j++) {
						int cnt=0;
						if(omok[j][i]==turn) {			//�� ���� ��ٲ�
							for(int k=0;k<5;k++) {
								if(omok[j+k][i]==turn) cnt++;
							}
						}
						if(cnt ==5)	win =turn;
						
					}
				}
				//  \
				
				for(int i=0; i<SIZE-4;i++) {
					for(int j=0;j<SIZE-4;j++) {
						int cnt =0;
						if(omok[i][j]==turn) {
							for(int k=0;k<5;k++) {		// ������ĢȮ���ϸ鼭
								if(omok[i+k][j+k]==turn) cnt++;
							}
						}
						if(cnt ==5) win = turn;
					}
				}
				
				//		/
				for (int i = 0; i < SIZE - 4; i++) {
					for (int j = 4; j < SIZE ; j++) {
						int cnt=0;
						if(omok[i][j]==turn) {
							for(int k=0;k<5;k++) {		//������ĢȮ���ϸ鼭
								if(omok[i+k][j-k]==turn)cnt++;
							}
						}						
							if(cnt==5)win=turn;
					}
				}
				
				
				
				
				
				
				turn=turn==1?2:1;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
