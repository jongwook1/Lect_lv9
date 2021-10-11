package lv2;

import java.util.Random;
import java.util.Scanner;

public class Test5_lv2 {

	public static void main(String[] args) {
		// 시작 11:30
		// 종료 11:55
		// 소요 25분

		/*
		 * # 카카오 택시 1. 손님을 태워 목적지까지 이동하는 게임이다. 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다. 3.
		 * 메뉴는 아래와 같다. 1) 속도설정 : 1~3까지만 가능 2) 방향설정 : 동(1)서(2)남(3)북(4) 3) 이동하기 : 설정된 방향으로
		 * 설정된 속도만큼 이동 4. 거리 1칸 당 50원씩 추가되어 도착시 요금도 출력한다.
		 *
		 */

		Scanner sc = new Scanner(System.in);

		Random ran = new Random();

		int desX = ran.nextInt(20) - 10;
		int desY = ran.nextInt(20) - 10;
		int x = 0;
		int y = 0;
		int dir = 0;
		int speed = 0;
		int fee = 0;
		int move = 0;

		boolean run = true;

		while (run) {
			System.out.println("= 카카오 택시 =");
			System.out.println("이동칸수 =" + move);
			System.out.println("현재요금 " + fee + "원");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");

			System.out.println("1) 속도설정 : 1~3까지만 가능");
			System.out.println("2) 방향설정 : 동(1)서(2)남(3)북(4)");
			System.out.println("3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동");
			System.out.println("메뉴를 선택해주세요");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("속도를 선택해주세요 1) 1속도 2) 2속도 3) 3속도 ");
				sel = sc.nextInt();
				if (sel >= 1 && sel <= 4) {
					if (sel == 1) {
						speed = 1;
					} else if (sel == 2) {
						speed = 2;
					} else if (sel == 3) {
						speed = 3;
					}
				} else {
					System.out.println("설정할수없는값입니다.");
				}
			} else if (sel == 2) {
				System.out.println("방향설정을 설정해주세요  동(1)서(2)남(3)북(4)");
				sel = sc.nextInt();
				if (sel >= 1 && sel <= 4) {
					if (sel == 1) {
						dir = 1;
					} else if (sel == 2) {
						dir = 2;
					} else if (sel == 3) {
						dir = 3;
					} else if (sel == 4) {
						dir = 4;
					}
				} else {
					System.out.println("설정할수없는 값입니다.");
				}
			} else if (sel == 3) {
				if (dir >= 1 && dir <= 4) {
					if (dir == 1) { // x +
						x = x += speed;
					} else if (dir == 2) {// x -
						x = x -= speed;
					} else if (dir == 3) {// y-
						y = y -= speed;
					} else if (dir == 4) {// y+
						// y좌표가 +
						y = y += speed;
					}
					move += speed;
					fee += 50 * speed;
				}
			}
			if (desX == x && desY == y) {
				System.out.println("도착했습니다");

				System.out.println("요금은 " + fee + "원 입니다.");
				run = false;

			}

		}

	}

}
