package lv4_review;

import java.util.Scanner;

public class Z_01 {

	public static void main(String[] args) {
		//		���� 11:20
		//		���� 11:50
		//		�ҿ� 00:30
		/*
		 * # �迭 ��Ʈ�ѷ�[2�ܰ�] : ����(Vector)
		 * 1. �߰�
		 * . ���� �Է¹޾� ���������� �߰�
		 * 2. ����(�ε���)
		 * . �ε����� �Է¹޾� �ش� ��ġ�� �� ����
		 * 3. ����(��)
		 * . ���� �Է¹޾� ����
		 * . ���� �� �Է� �� ����ó��
		 * 4. ����
		 * . �ε����� ���� �Է¹޾� ����
		 */
		Scanner sc = new Scanner(System.in);
		int[] datas = null;
		int cnt = 0;

		while (true) {
			if (datas != null) {
				for (int i = 0; i < datas.length; i++) {
					System.out.print(datas[i] + " ");
				}
				System.out.println();
			}

			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3.����(�ε���)");
			System.out.println("4.����(��)");
			System.out.println("��ȣ�� �������ּ���");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("�߰��Ұ��� �Է����ּ���");
				int data = sc.nextInt();
				if (cnt > 0) {
					int temp[] = datas;
					datas = new int[cnt + 1];

					for (int i = 0; i < temp.length; i++) {
						datas[i] = temp[i];
					}
				} else {
					datas = new int[1];
				}
				datas[cnt] = data;
				cnt++;

			} else if (sel == 2) {
				System.out.println("������ ��ġ�� �Է����ּ���");
				int idx = sc.nextInt();

				if (datas != null && idx >= 0 && idx < cnt) {
					System.out.println("������ ���� �Է����ּ���");
					int data = sc.nextInt();

					int temp[] = datas;
					datas = new int[cnt + 1];

					for (int i = 0; i < temp.length; i++) {
						if (i < idx) {
							datas[i] = temp[i];
						} else {
							datas[i + 1] = temp[i];
						}
					}
					datas[idx] = data;
					cnt++;

				} else {
					System.out.println("�����Ҽ�������ġ�Դϴ�");
				}
			} else if (sel == 3) {
				System.out.println("��������ġ�Է����ּ���");
				int dIdx = sc.nextInt();
				if (datas != null && dIdx >= 0 && dIdx < cnt) {
					if (cnt == 1) {
						datas = null;
					} else {
						int temp[] = datas;
						datas = new int[cnt - 1];
						int idx = 0;
						for (int i = 0; i < temp.length; i++) {
							if (i != dIdx) {
								datas[idx] = temp[i];
								idx++;
							}
						}
					}
					cnt--;
				}

			} else if (sel == 4) {
				if (datas != null) {
					System.out.println("������ ���Է����ּ���");
					int dData = sc.nextInt();

					int dCnt = 0;
					for (int i = 0; i < cnt; i++) {
						if (dData == datas[i]) {
							dCnt++;
						}
					}
					int temp[] = datas;
					datas = new int[cnt - dCnt];

					int idx = 0;
					for (int i = 0; i < temp.length; i++) {
						if (temp[i] != dData) {
							datas[idx] = temp[i];
							idx++;
						}
					}
					cnt -= dCnt;

				} else {
					System.out.println("����ֽ��ϴ�");
				}
			}

		}

	}

}
