package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex22_test {

	public static void main(String[] args) {
		// ����) ����ܾ� ���߱�
		// ����ܾ ���� * �� ǥ�õȴ�.
		// ����ܾ �Է¹ް� Ʋ�������� �������� �ѱ��ھ� ��������. (������ 5���� ����)
		// (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������.
		// ���� �������ų� ���߸� ����

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int score = 100;
		String word = "performanceTest";
		String meaning = "����";
		int size = word.length();
		int check[] = new int[size]; // ��Ʈ üũ�� ���ؼ� Ȯ���Ҽ��ִ�.

		while (true) {
			System.out.println("�� : " + meaning);
			System.out.print("���� : ");
			for (int i = 0; i < size; i++) {
				if (check[i] == 1) {
					System.out.print(word.charAt(i));
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			System.out.print("����ܾ �Է��ϼ��� >>> ");
			String me = scan.next();

			if (me.equals(word)) {
				System.out.println("�����Դϴ�.");
				System.out.println("���� : " + score);
				break;
			} 
			else {
				int rNum = -1;
				while (true) {
					rNum = ran.nextInt(size);
					if (check[rNum] == 0) {
						break;
					}
				}

				check[rNum] = 1;
				for (int i = 0; i < size; i++) {
					if (word.charAt(rNum) == word.charAt(i)) {
						check[i] = 1;
					}
				}
				score-=5;
			}
		}






	}

}
