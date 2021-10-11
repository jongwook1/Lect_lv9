package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		/*
		 * # 카카오 택시 1. 손님을 태워 목적지까지 이동하는 게임이다. 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다. 3.
		 * 메뉴는 아래와 같다. 1) 속도설정 : 1~3까지만 가능 //ex 속도가 2면 2칸이동 2) 방향설정 : 동(1)서(2)남(3)북(4)
		 * 3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동 4. 거리 1칸 당 50원씩 추가되어 도착시 요금도 출력한다.
		 *
		 */

		Scanner scan = new Scanner(System.in);
		// 목적지(destination)
		Random ran = new Random();

		int desX = ran.nextInt(20) - 10;
		int desY = ran.nextInt(20) - 10;
		// 현재 위치
		int x = 0;
		int y = 0;
		// 방향(direction)
		int dir = 0; // 1동 2서 3남 4북
		// 속도
		int speed = 0;
		// 요금
		int fee = 0;
		int move = 0; // !!!!!
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

			// if(run == true) {
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if (sel == 1) {
				System.out.println("방향 입력(1동 2서 3남 4북):");
				// dir = scan.nextInt(); -> 예외처리 x
				int input = scan.nextInt();

				if (input >= 1 && input <= 4) {
					dir = input;
				} else {
					System.out.println("설정할 수없는 값입니다");
				}

			} else if (sel == 2) {
				// 1~3 speed
				int input = scan.nextInt();

				if (input >= 1 && input <= 3) {
					speed = input;
				} else {
					System.out.println("설정할수없는 값입니다");
				}

			} else if (sel == 3) {
				// dir : 4
				// speed : 3
				// 이동>>
				// 내 좌표 x 또는 y가 업데이트 되어야함

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
				// 도착 확인
			}
			if (desX == x && desY == y) {
				System.out.println("도착했습니다");

				System.out.println("요금은 " + fee + "원 입니다.");
				run = false;

			}

		}

	}

}
