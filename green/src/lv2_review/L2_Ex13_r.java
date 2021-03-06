package lv2_review;

import java.util.Random;
import java.util.Scanner;

public class L2_Ex13_r {

	public static void main(String[] args) {
		/*
		 * # 카카오 택시
		 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
		 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
		 * 3. 메뉴는 아래와 같다.
		 * 		1) 속도설정 : 1~3까지만 가능
		 * 		2) 방향설정 : 동(1)서(2)남(3)북(4)
		 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
		 * 4. 거리 1칸 당 50원씩 추가되어 도착시 요금도 출력한다.
		 *
		 */

		Scanner sc = new Scanner(System.in);
		Random rn=new Random();
		// 목적지(destination)
		int desX = rn.nextInt(20)-10;
		int desY = rn.nextInt(20)-10;
		
		// 현재 위치
		int x = 0;
		int y = 0;
		
		// 방향(direction)
		int dir = 0;
		
		// 속도
		int speed = 0;
		
		// 요금
		int fee = 0;
		int move=0;
		boolean run = true;
		while(run) {
			
			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");
			
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("방향입력해주세요");
				dir=sc.nextInt();
			}
			else if(sel == 2) {
				System.out.println("속도 입력해주세요");
				speed=sc.nextInt();
			}
			else if(sel == 3) {
				if(dir==1) {
					x+=speed;
				}else if(dir==2){
					x-=speed;
				
				}else if(dir==3){
					y-=speed;
				
				}else if(dir==4){
					y+=speed;
				}
			}
			move+=speed;
			
			if(desX==x&&desY==y) {
				fee=move*50;
				System.out.println("목적지도착!");
				System.out.println("요금은: "+fee+"원");
				
				run=false;
				
			}
			
		}
		

	}

}
