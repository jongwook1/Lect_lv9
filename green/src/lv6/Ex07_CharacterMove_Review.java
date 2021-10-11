package lv6;
import java.util.Random;
import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */


class Move99 {
//	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
	int x;
	int p1 = 2;
	int WALL = 1;
	int SIZE = 10;
	int map[] = new int[SIZE];

}

public class Ex07_CharacterMove_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		Move99 m = new Move99();

		m.x = rn.nextInt(m.SIZE);
		m.map[m.x] = m.p1;

		for (int i = 0; i < 2; i++) {
			int rNum = rn.nextInt(m.SIZE);
			if (m.map[rNum] == 0) {
				m.map[rNum] = m.WALL;
			} else {
				i--;
			}
		}

		while (true) {
			for (int i = 0; i < m.map.length; i++) {
				System.out.print(m.map[i] + " ");
			}
			System.out.println("\n1.왼 2.오 3.격파");
			int sel = sc.nextInt();
			int xx = m.x;
			if (sel == 1) {
				xx--;
			} else if (sel == 2) {
				xx++;
			}
			if (xx >= 0 && xx < m.SIZE && m.map[xx] == 0) {
				m.map[m.x] = 0;
				m.x = xx;
				m.map[m.x] = m.p1;
			}

			else if (sel == 3) {
				if (m.x - 1 >= 0 && m.map[m.x - 1] == m.WALL) {
					m.map[m.x - 1] = 0;
				} else if (m.x + 1 < m.SIZE && m.map[m.x + 1] == m.WALL) {
					m.map[m.x + 1] = 0;

				}
			}
		}

	}

}
