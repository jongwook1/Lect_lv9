//�����Ѱ�
package lv2;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// ��������� �����
		/*
		 * # ���θ� �ڷΰ���
		 * 
		 * ����) ���θ����θ޴����� �����Ƿ��� �����ؼ� �ڷΰ��� ������������ �����Ƿ� ������ �� �����Ϸ����Ѵ�. ��Ʈ) ���� ���� �ݺ����� �߰�
		 * ���ָ�ȴ�. 1. �����Ƿ� 1) Ƽ���� 2) ���� 3) �ڷΰ��� 2. �����Ƿ� 1) ����� 2) ġ�� 3) �ڷΰ��� 3. ����
		 */

		Scanner sc = new Scanner(System.in);
		boolean isRun = true;

		while (isRun) {
			System.out.println(" -----green shop-----");
			System.out.println("1.�����Ƿ� \n2.�����Ƿ�\n3. ����");
			System.out.println("----------");
			System.out.println("�޴��Է�");
			int sel = sc.nextInt();
			if (sel == 1) {
				boolean dpr = true;
				while (dpr) {
					System.out.println("1.�����Ƿ�");
					System.out.println("    1)Ƽ����");
					System.out.println("    2)����");
					System.out.println("    3)�ڷΰ���");

					sel = sc.nextInt();
					if (sel == 1) {
						System.out.println("1.Ƽ����");
						continue;
					} else if (sel == 2) {
						System.out.println("2.����");
						continue;
					} else if (sel == 3) {
						break;
					}
				}
			} else if (sel == 2) {
				boolean dpr = true;
				while (dpr) {
					System.out.println("1.�����Ƿ�");
					System.out.println("    1)�����");
					System.out.println("    2)ġ��");
					System.out.println("    3)�ڷΰ���");

					sel = sc.nextInt();
					if (sel == 1) {
						System.out.println("1.�����");
						continue;
					} else if (sel == 2) {
						System.out.println("2.ġ��");
						continue;
					} else if (sel == 3) {
						break;
					}
				}
			} else if (sel == 3) {
				System.out.println("�����ϰڽ��ϴ�");
				isRun = false;
			}

		}

	}
}
