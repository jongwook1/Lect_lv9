package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * # Ÿ�ڿ��� ����[1�ܰ�]
		 * 1. ������ ���´�.(shuffle)
		 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
		 * ��)
		 * ���� : mysql
		 * �Է� : mydb
		 * ���� : mysql
		 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
		 * ���� : jsp
		 */
		
		String[] words = { "java", "mysql", "jsp", "spring" };

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		// ����
//		ver.1
//		int i=0;
//		
//		while(i<1000) {
//			int r=ran.nextInt(words.length);
//			
//			String temp=words[0];
//			words[0]=words[r];
//			words[r]=temp;
//			i++;
//		}
		// ����
//      ver.2
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(words.length);
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
//		for(int j=0;j<words.length;j++) {
//			System.out.println(words[j]);
//		}

		// ���� ����
		int cnt = 0;

		while (true) {
			System.out.println("����: " + words[cnt]);
			System.out.println("�Է�: ");
			String inputData = sc.next();
			if (words[cnt].equals(inputData)) {
				cnt++;
			}
			;

			if (cnt == 4) {
				System.out.println("��� �������Ƿ� �����մϴ�");
				break;
			}
		}
	}
}
