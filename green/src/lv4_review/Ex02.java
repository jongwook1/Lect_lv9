package lv4_review;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
				/* # 숫자이동[2단계]
				 * 1. 숫자2는 캐릭터이다.
				 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
				 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
				 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
				 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
				 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
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
							 System.out.print("옷 ");
							 p=i;
						 }
					 }
//					 break;
					 System.out.println("1.왼 2.오 3.격파");
					 int sel=sc.nextInt();
					 if(sel==1&& p-1>0&&game[p-1]!=1) {
						 game[p]=0;						 
						 game[p-1]=2;					 
					 }
				 }
				 
				 
				 
				 
				 
	}

}
