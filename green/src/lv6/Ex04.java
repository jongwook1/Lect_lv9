package lv6;

import java.util.Scanner;

class Ex{	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * System.out.println("=== " + green.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
		 */
		
		Scanner sc = new Scanner(System.in);
		Ex green = new Ex();
		green.name="GREEN";
		while (true) {
			System.out.println("=== " + green.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
			System.out.println("�޴��� �������ּ���");
			int sel = sc.nextInt();
			if (sel == 1) {
				for(int i=0;i<green.arScore.length;i++) {
					System.out.printf("%d�� : %d��\n",green.arHakbun[i],green.arScore[i]);
				}
			} else if (sel == 2) {
				int first = -1;
				int top = 0;
				for (int i = 0; i < green.arScore.length; i++) {
					if (green.arScore[i] > top) {
						top = green.arScore[i];
						first = i;
					}
				}
				System.out.println("1���л��� �й�: " + green.arHakbun[first] + " ����: " + top);

			} else if (sel == 3) {
				int last = -1;
				int min = 100;
				for (int i = 0; i < green.arScore.length; i++) {
					if (green.arScore[i] < min) {
						min = green.arScore[i];
						last = i;
					}
				}
				System.out.println("�õ��л��� �й�: " + green.arHakbun[last] + " ����: " + min);
			} else if (sel == 4) {
				System.out.println("�й��� �Է��ϼ���");
				int hak = sc.nextInt();
				int idx = -1;
				for (int i = 0; i < green.arScore.length; i++) {
					if (hak == green.arHakbun[i]) {
						idx = i;
					}
				}
				System.out.println("�й� " + hak + "�� ����: " + green.arScore[idx]);
			} else if (sel == 5) {
				System.out.println("�����ϰڽ��ϴ�");
				break;
			}

		}

	}

}
