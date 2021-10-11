package lv5;

import java.util.Random;

public class Ex24_test {

	public static void main(String[] args) {
		// # 경마 게임
				// 5마리의 말이 랜덤으로 한번에 일정거리 이동가능하다 
				// 이동한거리의 합이 20이상이면 도착 
				// 등수 출력 
				// 조건) 단! 동시도착 예외처리
				
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
								System.out.print("[말]" + " ");
							}
							else {
								System.out.print("___" + " ");
							}
						}
					}
					if(cnt == 6) {
						break;
					}
					
					//horse 5마리에 랜덤값 입력.
					//horse가 일정거리 이동한 값을 total값에 입력.
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
//							 1. 기록가능한 case 와 기록이 불가한 case.
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
					
					
					//순위 및 hores[i][j] 출력
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
					//기존 좌표 초기화 후 현재 total값을 기준으로 새로 좌표 그리기.
//					horse = new int[5][20];
//					
//					for(int i = 0; i < total.length; i++) {
//						// 20 : x = 19
//						horse[i][total[i]-1] = HORSE;
//						}
								
				}




	}

}
