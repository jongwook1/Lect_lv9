package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// ����) ����ܾ� ���߱�
		// ����ܾ ���� * �� ǥ�õȴ�.
		// ����ܾ �Է¹ް� Ʋ�������� �������� �ѱ��ھ� ��������. (������ 5���� ����)
		// (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������.
		// ���� �������ų� ���߸� ����
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int score = 100;
		String word = "performance";
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
			System.out.println("����ܾ �Է��ϼ��� >>> ");
			String me = sc.next();
			if (me.equals(word)) {
				System.out.println("�����Դϴ�");
				System.out.println(score);
				break;
			}
			
			else {
				int rN = -1; // �������ڸ� �ε����� while���ۿ����� ����ϱ����� ���⼭ ����
				while (true) {
					rN = ran.nextInt(size);	
					
					if (check[rN] == 0) {	//�������� �ߺ��Ǵ°� ����(+ö�ڹ������Ͷ� �ȳ�����)  
						break;
					}
					
				}

				check[rN] = 1;

				for (int i = 0; i < size; i++) {
					if (word.charAt(rN) == word.charAt(i)) { // (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������.
						check[i] = 1;						
					}
				}				
				score -= 5;

			}

		}

	}

}
