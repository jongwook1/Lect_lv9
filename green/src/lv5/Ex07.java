package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/*
		 * # Ÿ�ڿ��� ����[2�ܰ�]
		 * 1. ������ ���´�.(shuffle)
		 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
		 * 3. �� ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ���
		 * ��)
		 * ���� : mys*l
		 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
		 * ���� : *sp
		 * �Է� : jsp
		 * ...
		 */
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		String[] words = { "java", "mysql", "jsp", "spring" };

		// ����
		for (int i = 0; i < 1000; i++) {
			int rN = ran.nextInt(words.length);
			String temp = words[0];
			words[0] = words[rN];
			words[rN] = temp;
		}
		// ��������εǴ��� Ȯ��
//		for(int i=0;i<words.length;i++) {
//			System.out.println(words[i]);
//		}

		// ������ ��ǥ�ְ� ���
		int i = 0;

		while (i < words.length) { // words.length->4;
			int cnt = 0;
			int check = 1;
			while (true) {
				if (cnt == 4) {
					break;
				}
				if (check == 1) {
					int rIdx = ran.nextInt(words[i].length());

					for (int j = 0; j < words[i].length(); j++) {
						if (rIdx == j) {
							System.out.print("*");
						} else {
							System.out.print(words[i].charAt(j));
						}
					}

					System.out.println("\n�Է�: ");
					String inputData = sc.next();
					if (words[i].equals(inputData)) { // �����Ͻ� i�������Ѽ� �ٸ��ܾ����
						System.out.println("����\n");
						i++;
						cnt++;

					} else { // ���� Ʋ���� �ٽ��Է�
						System.out.println("�����Դϴ�");
						check = -1;
						if (check == -1) {
							boolean run = true;
							while (run) {

								for (int j = 0; j < words[i].length(); j++) {
									if (rIdx == j) {
										System.out.print("*");
									} else {
										System.out.print(words[i].charAt(j));
									}
								}
								System.out.println("\n�Է�: ");
								inputData = sc.next();
								if (words[i].equals(inputData)) { // �����Ͻ� i�������Ѽ� �ٸ��ܾ����
									System.out.println("����\n");
									i++;
									cnt++;
									check = 1;
									run = false;
								}
							}

						}
					}
				}
			}
		}
	}
}
