package lv1;

import java.util.Scanner;

public class Ex27_br31 {

	public static void main(String[] args) {
		/*
		 * # ����Ų���31
		 * 1. p1�� p2�� �����ư��鼭 1~3�� �Է��Ѵ�.
		 * 2. br�� p1�� p2�� �Է°��� �����ؼ� �����Ѵ�.
		 * 3. br�� 31�� ������ ������ ����ȴ�.
		 * 4. �¸��ڸ� ����Ѵ�.
		 * 
		 * ��) 
		 * 1�� : p1(2)	br(2)
		 * 2�� : p2(1)	br(3)
		 * 3�� : p1(3)	br(6)
		 * ...
		 */
		int p1 = 0;
		int p2 = 0;
		int br = 0;
		int turn = 0;

		Scanner sc = new Scanner(System.in);

		boolean isRun = true;
		while (isRun) {
			System.out.println("br : " + br);
			int answer = 0;
			// turn�� ���� �Է�
			if (turn % 2 == 0) { // turn �� �Ἥ p1�� ¦���� ����
				// p1
				System.out.println("p1�� ���ڸ� �Է����ּ���");
				answer = sc.nextInt();
				//�ǾƷ� turn++; �� �����Ͽ� �ִ´�� p1 p2���� �־��
				// �Ʒ��������� �ι�° else ���� br += answer;�� ���⿡ �ִ´ٰ� �ϸ� 1~3�̿��� ���ڵ� ī��Ʈ �ǹǷ� Ʋ��
			} else { // turn �� �Ἥ p2�� Ȧ���� ����
				System.out.println("p2�� ���ڸ� �Է����ּ���"); // p2
				answer = sc.nextInt();
				// �Ʒ��������� �ι�° else ���� br += answer;�� ���⿡ �ִ´ٰ� �ϸ� 1~3�̿��� ���ڵ� ī��Ʈ �ǹǷ� Ʋ��
				//�ǾƷ� turn++; �� �����Ͽ� �ִ´�� p1 p2���� �־��
			}
			if (answer <= 0 || answer > 3) {
				System.out.println("1~3������ �Է����ּ���");
				turn--; // turn ++; �� ����
			} else {
				br += answer; /// ���Ӽ��ڰ� �����ؼ� ������ !!!!!!!!!�̺κ��� ������!!!!!!
				// ����
				if (br >= 31) {
					if (turn % 2 == 0) {
						System.out.println("p2�� �¸��ߴ�");
					} else {
						System.out.println("p1�� �¸��ߴ�");
					}
					isRun = false;
				}
			}
			turn++;

		}

	}
}			
			
			
/*			
			System.out.println("p1�� ���ڸ��Է����ּ���");
			int rp1 = sc.nextInt();
			turn = 1;
			
				System.out.println(rp1);
				if(rp1 > 3) {
					System.out.println("1~3������ �Է����ּ���");
					System.out.println("p1�� ���ڸ� �ٽ��Է����ּ���");
					rp1 = sc.nextInt();
					turn = 1;
				}
			System.out.println("p2�� ���ڸ��Է����ּ���");
			int rp2 = sc.nextInt();
			turn = 2;
			
				System.out.println(rp2);
				if(rp2 > 3) {
					System.out.println("1~3������ �Է����ּ���");
					System.out.println("p2�� ���ڸ� �ٽ��Է����ּ���");
					rp2 = sc.nextInt();
					turn = 2;
				}
			br = rp1 + rp2;
		}	
if(turn == 1) {
	System.out.println("p1���� �¸��߽��ϴ�");
}else {
	System.out.println("p2���� �¸��߽��ϴ�.");
}
*/

