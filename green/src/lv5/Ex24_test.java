package lv5;

import java.util.Random;

public class Ex24_test {

	public static void main(String[] args) {
		// # �渶 ����
				// 5������ ���� �������� �ѹ��� �����Ÿ� �̵������ϴ� 
				// �̵��ѰŸ��� ���� 20�̻��̸� ���� 
				// ��� ��� 
				// ����) ��! ���õ��� ����ó��
				
				int horse[][] = new int[5][20];
				Random ran = new Random();
				int max = 20;
				int rank[] = new int[5];
				int total[] = new int[5];
				final int HORSE = 7;
				
				int cnt = 1;
				
				boolean run = true;
				while(run) {
					boolean record = true;
					
					//print board.
					for(int i = 0; i < 5; i++) {
						System.out.println();
						for(int j = 0; j < 20; j++) {
							if(horse[i][j] == HORSE) {
								System.out.print("[��]" + " ");
							}
							else {
								System.out.print("___" + " ");
							}
						}
					}
					if(cnt == 6) {
						break;
					}
					
					//horse 5������ ������ �Է�.
					//horse�� �����Ÿ� �̵��� ���� total���� �Է�.
					for(int i = 0; i < 5; i++) {
						int r = ran.nextInt(4);
						if(total[i] + r < max) {
							if(total[i] != 0) {
								horse[i][total[i]-1] = 0;							
							}
							total[i] += r;
							if(total[i] != 0) {
								horse[i][total[i]-1] = HORSE;											
							}
						}
						else if(total[i] + r >= max && rank[i] == 0) {
//							 1. ��ϰ����� case �� ����� �Ұ��� case.
							if(record == true) {
								horse[i][total[i]-1] = 0;
								total[i] = 20;
								rank[i] = cnt++; // 0
								horse[i][total[i]-1] = HORSE;									
								record = false;
							}
							else {
								i = i-1;
							}
							
						}
						
						
						
					
//						System.out.println();
//						for(int j = 0; j < 20; j++) { // ?
//						}
					}
					
					System.out.println();
					
					
					//���� �� hores[i][j] ���
					for(int i = 0; i < rank.length; i++) {
//						System.out.print(total[i] + " ");
						System.out.print(rank[i] + " ");
					}
					System.out.println();

//					for(int i = 0; i < 5; i++) {
//						System.out.println();
//						for(int j = 0; j < 20; j++) {
//							System.out.print(horse[i][j]);					
//						}
//					}
//					System.out.println();
					
					
					//print game.
					//���� ��ǥ �ʱ�ȭ �� ���� total���� �������� ���� ��ǥ �׸���.
//					horse = new int[5][20];
//					
//					for(int i = 0; i < total.length; i++) {
//						// 20 : x = 19
//						horse[i][total[i]-1] = HORSE;
//						}
								
				}




	}

}
