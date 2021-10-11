package lv6;

import java.util.Random;
import java.util.Scanner;

class Memory{
	int front[] = {1,1,2,2,3,3,4,4,5,5};
	int back[]=new int [10];
	int cnt=0;
}


public class Ex08_memory {

	public static void main(String[] args) {
		/*
		 * # 기억력 게임 : 클래스 + 변수
		 * 1. front 배열 카드 10장을 섞는다.
		 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
		 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
		 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		Memory m = new Memory();

		// 셔플
		int i = 0;
		while (i < 1000) {
			int r = ran.nextInt(10);
			int temp = m.front[0];
			m.front[0] = m.front[r];
			m.front[r] = temp;
			i++;
		}

		m.cnt = 0;
		while (true) {
			System.out.print("카드번호 ");
			for (int j = 0; j < m.front.length; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
			System.out.print("카드의값 ");
			for (int j = 0; j < m.front.length; j++) {
				System.out.print(m.front[j] + " ");
			}
			System.out.println();
			System.out.print("게임카드: ");
			for (int j = 0; j < m.front.length; j++) {
				System.out.print(m.back[j] + " ");
			}
			if (m.cnt == 5) {
				System.out.println("모두 맞췄으므로 종료합니다");
				break;
			}

			System.out.println("\n카드번호 입력1 ");
			int idx1 = sc.nextInt() - 1;
			System.out.println("카드번호 입력2");
			int idx2 = sc.nextInt() - 1;

			if (idx1 == idx2 || idx1 < 0 || idx1 >= 10 || idx2 < 0 || idx2 >= 10) {
				System.out.println("카드번호 확인해주세요");
			} else {
				if (m.front[idx1] == m.front[idx2] && m.back[idx1] == 0) {
					System.out.println("정답");
					m.back[idx1] = m.front[idx1];
					m.back[idx2] = m.front[idx2];
					m.cnt++;
				}
			}

		}

	}

}
