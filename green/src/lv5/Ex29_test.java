package lv5;

import java.util.Scanner;

public class Ex29_test {

	public static void main(String[] args) {
		int game[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,0}
				};
		int yx [][] = new int[10000][2];
		//문제1) 0 이 플레이어이다 
		// 1) left 2)right 3)up 4)down 5)되감기
		//번호를 입력받고 해당위치로 이동 ==> 이동할때 값을 서로 교환한다. 
		// 예) 1 ==> 
		/*
		    {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,0,15}		
		 */
		
		//문제2) 심화  ==> 한칸한칸이동할때마다 yx 에 배열에 이동한경로를 저장했다가 
		// 5번입력시 ==> 왔던길로 되돌아가기 한다. 
Scanner scan = new Scanner(System.in);
		
		
		
		int py = 0;
		int px = 0;
		int cnt = 0;
		while(true) {
			for(int i=0;i<game.length;i++) {
				for(int j=0;j<game[i].length;j++) {
					if(game[i][j] == 0) {
						System.out.print("옷\t");
						py = i;
						px = j;
						yx[cnt][0] = py;
						yx[cnt][1] = px;
					}
					else {
						System.out.print(game[i][j]+"\t");
					}
				}
				System.out.println("\n");
			}
			System.out.println();
			System.out.println("1. cnt = "+cnt);
			
			for(int i=0;i<cnt;i++) {
				System.out.println(i+". "+yx[i][0]+":"+yx[i][1]);
			}
			
			System.out.println("8 위 2 아래 4 좌 6 우  5 되감기 :  ");
			int move = scan.nextInt();

			int yy = py;
			int xx = px;
			if(move == 8) { 
				yy = yy - 1;
				cnt += 1;
			}
			else if(move == 2) { 
				yy = yy + 1;
				cnt += 1;
			}
			else if(move == 4) { 
				xx = xx - 1;
				cnt += 1;
			}
			else if(move == 6) { 
				xx = xx + 1;
				cnt += 1;
			}
			else if(move == 5) {
				if(cnt == 0) {
					System.out.println("더이상 되감기가 안됩니다.");
					continue;
				}
				yy = yx[cnt-1][0];
				xx = yx[cnt-1][1];
				cnt -= 1;
			}
			else {
				continue;
			}		
			if(xx < 0 || xx >= game.length) {
				cnt -= 1;
				continue;				
			}
			if(yy < 0 || yy >= game.length) {
				cnt -= 1;
				continue;
			}
			
			game[py][px] = game[yy][xx];
			py = yy;
			px = xx;
			game[py][px] = 0;
		}

	}

}
