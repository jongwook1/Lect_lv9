package lv4;

import java.util.Scanner;

public class Ex22_hint {

	public static void main(String[] args) {
		/*
		 * 0�ε��� : ȸ���� log��
		 * 1�ε��� : �������� index
		 * 
		 * {0,1}
		 * {0,1}
		 * {1,1}
		 * {1,1}
		 *...
		 */
		
		
		/*
		 * # ���θ� [��ٱ���]
		 * 1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�.
		 * 	1) ���
		 *  2) �ٳ���
		 *  3) ����
		 * 2. ��ȣ�� ������ ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�.
		 * 3. �α��� ȸ���� �ε��� ��ȣ�� �� ���� ù��° ���� �����Ѵ�.
		 * 4. �ش� ȸ���� ������ ��ǰ�� �ε��� ��ȣ�� �� ���� �ι�° ���� �����Ѵ�.
		 * ��)
		 * {
		 * 		{0, 1},				qwerȸ�� 			> �������
		 * 		{1, 2},				javakingȸ�� 		> �ٳ�������
		 * 		{2, 1},				abcdȸ��			> �������
		 * 		{0, 3},				qwerȸ��			> ���ⱸ��
		 * 		...
		 * }
		 */
		Scanner sc = new Scanner(System.in);			
			String[] ids = {"qwer", "javaking", "abcd"};
			String[] pws = {"1111",     "2222", "3333"};
			int MAX_SIZE = 100;
			int[][] jang = new int[MAX_SIZE][2];
			int count = 0;
			String[] items = {"���", "�ٳ���", "����"};
			int log = -1;		//-1�α׾ƿ�����
			while (true) {
				System.out.println("[MART]");
				System.out.println("[1]�� �� ��");
				System.out.println("[2]�α׾ƿ�");
				System.out.println("[3]��     ��");
				System.out.println("[4]��ٱ���");
				System.out.println("[0]��     ��");
				System.out.print("�޴� ���� : ");
				int sel = sc.nextInt();

				if (sel == 1) {
					if (log == -1) {
						System.out.println("���̵� �Է��ϼ���");
						String inputId = sc.next();
						System.out.println("��й�ȣ�� �Է��ϼ���");
						String inputPws = sc.next();
						for (int i = 0; i < 3; i++) {
							if (ids[i].equals(inputId) && pws[i].equals(inputPws)) {
								System.out.println(inputId + " �� �α��εǼ̽��ϴ�");
								log = 1;
							}
						}

					} else {
						System.out.println("�α׾ƿ��� �������ּ���");
					}
				} else if (sel == 2) {
					if (log != -1) {
						System.out.println("�α׾ƿ��Ǽ̽��ϴ�");
						log = -1; // �̺κг�ħ
					} else {
						System.out.println("�α����� �������ּ���");
					}

				} else if (sel == 3) {
					if (log == 1) {
						boolean run = true;
						while (run) { // �̺κг�ħ
							for (int i = 0; i < items.length; i++) {
								System.out.printf("%d) %s\n", i + 1, items[i]);
							}
							System.out.println("0) �ڷΰ���");
							System.out.print("�����һ�ǰ�� �������ּ���");
							int buyI = sc.nextInt() - 1;
							if (buyI == -1) { // 0�Է½� �ε����� -1
								break;
							}
							if (buyI >= 0 && buyI < items.length) { // �̺κг�ħ
								jang[count][0] = log; //
								jang[count][1] = buyI;
								count++;
							}
						}
					} else {
						System.out.println("�α����� �������ּ���");
					}

				} else if (sel == 4) { // �̺κ��� Ư�������
					int myitem[] = new int[items.length];

					if (log != -1) {
						for (int i = 0; i < count; i++) {
							if (jang[i][0] == log) {
								myitem[jang[i][1]]++; 
							}
						}

						for (int i = 0; i < myitem.length; i++) {
							if (myitem[i] > 0) {
								System.out.print(items[i] + ": ");
								System.out.println(myitem[i] + "��");
							}
						}

					} else {
						System.out.println("�α����� �������ּ���");
					}

				} else if (sel == 0) {
					System.out.println("���α׷� ����");
					break;
				}
			}

		}

	}
