package lv4;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		/*
		 * # ȸ������ 
		 * 1. ����
		 * . ���̵� �� ��й�ȣ�� �Է¹޾� ����
		 * . ���̵� �ߺ��˻�
		 * 2. Ż��
		 * . ���̵� �� �Է¹޾� Ż��
		 */
		Scanner sc = new Scanner(System.in);
		int[] ids = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		int cnt = 2;
		boolean run = true;
		while (run) {
			for (int k = 0; k < ids.length; k++) {
				System.out.printf("���̵�%d  ���%d", ids[k], pws[k]);
				System.out.println();
			}
			System.out.println("\n1.����");
			System.out.println("2.Ż��");
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("���̵� �Է����ּ���");
				int inputId = sc.nextInt();
				System.out.println("��й�ȣ�� �Է����ּ���");
				int inputPw = sc.nextInt();

				boolean check = true;
				for (int i = 0; i < 5; i++) {
					if (ids[i] == inputId) {
						check = false;
					}
				}

				if (ids != null && check == true) {
					int temp[] = ids;
					int temp2[] = pws;
					ids = new int[5];
					pws = new int[5];
					for (int i = 0; i < 5; i++) {
//					if (inputId != ids[i]) {						
						ids[i] = temp[i];
						pws[i] = temp2[i];
//					}else {
//						System.out.println("�ߺ��� ���̵��Դϴ�");
//					}
					}
					ids[cnt] = inputId;
					pws[cnt] = inputPw;
					cnt++;
					System.out.println(inputId + "�� ȸ�������� �Ϸ�Ǿ����ϴ�");
				} else {
					System.out.println("�ߺ��� ���̵��Դϴ�");
				}
			}

			else if (sel == 2) {
				System.out.println("Ż���� ���̵� �Է��ϼ���");
				int inputId = sc.nextInt();

				int didx = -1;
				for (int i = 0; i < 5; i++) {
					if (ids[i] == inputId) {
						didx = i;
					}
				}

				if (didx != -1) {
					System.out.println("����Է����ּ���");
					int inputPw = sc.nextInt();

					if (pws[didx] == inputPw) {
						for (int i = didx; i < cnt - 1; i++) {
							ids[i] = ids[i + 1];
							pws[i] = pws[i + 1];
						}
						ids[cnt - 1] = 0;
						pws[cnt - 1] = 0;
						cnt--;

					}else {
						System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�");
					}

				}else {
					System.out.println("���Ե��� ���� ���̵��Դϴ�");
				}

			}
		}

	}

}
