package lv4;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		/*
		 * # 사다리 게임
		 * 1. 인덱스 0~4를 하나선택한다. 
		 * 2. 숫자 0 을 만나면 그냥 아래로 내려간다.
		 * 3. 숫자 1 을 만나면 오른쪽으로 이동후 내려간다.
		 * 4. 숫자 2 를 만나면 완쪽으로 이동후 내려간다.
		 * 5. 오늘의 메뉴 출력 
		 */

		Scanner sc = new Scanner(System.in);
		String menu[] = {"떡라면" , "돈까스" ,"짜장면" , "쫄면" , "된장찌개"};
		int ladder[][]= {					//12  가 한쌍으로 가로 
				{0,0,0,0,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{1,2,0,0,0},
				{0,1,2,0,0},
				{1,2,0,0,0},
				{0,0,0,1,2},
				{0,0,0,0,0}};
		
		int x = 0; int y = 0;
		while (true) {
//			for (int i = 0; i < 9; i++) {
//				for (int j = 0; j < 5; j++) {
//					System.out.print(ladder[i][j] + " ");
//				}
//			}					
			System.out.println("\n0~4숫자중 입력하세요");
			int sel=sc.nextInt();
			if(sel==0) {
				y=0;
			}
			for ( x = 0; x < 9; x++) {
				for ( y = 0; y < 5; y++) {					
					
						if(ladder[x][y]==0) {
						 x++;
						}else if(ladder[x][y]==1) {
							y++;x++;
						}else if(ladder[x][y]==2) {
							x++;y--;
						}
					
//					else if(sel==1) {
//						j=1;
//					}
//					else if(sel==2) {
//						j=2;
//					}
//					else if(sel==3) {
//						j=3;
//					}
//					else if(sel==4) {
//						j=4;
//					}
				}
			}
			for (x = 0; x < 9; x++) {
				for (y = 0; y < 5; y++) {
					if(x==8&&y==0) {
						System.out.println(menu[y]);
					}
					else if(x==8&&y==1) {
						System.out.println(menu[y]);
					}
					else if(x==8&&y==2) {
						System.out.println(menu[y]);
					}
					else if(x==8&&y==3) {
						System.out.println(menu[y]);
					}
					else if(x==8&&y==4) {
						System.out.println(menu[y]);
					}
				}
			}
			
			
			
		}
		
		
		
		
		

	}

}
