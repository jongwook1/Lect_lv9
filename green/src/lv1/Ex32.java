package lv1;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		/*
		 * # ���θ� �ڷΰ���
		 * 
		 * ����) ���θ����θ޴����� �����Ƿ��� �����ؼ� 
		 *      �ڷΰ��� ������������ �����Ƿ� ������ �� �����ҷ����Ѵ�.
		 * ��Ʈ) ���� ���� �ݺ����� �߰� ���ָ�ȴ�. 
		 * 1. �����Ƿ�
		 * 		1) Ƽ����
		 * 		2) ����
		 * 		3) �ڷΰ���
		 * 2. �����Ƿ�
		 * 		1) �����
		 * 		2) ġ��
		 * 		3) �ڷΰ���
		 * 3. ����
		 */

		// escape ����
		// \n : �ٹٲ�
		// \t : ��(���� 4ĭ)

		Scanner sc = new Scanner(System.in);

		boolean isRun = true;

		while (isRun) {
			System.out.println(" -----green shop-----");
			System.out.println("1.�����Ƿ� \n2.�����Ƿ�\n3. ����");
			System.out.println("----------");
			System.out.println("�޴��Է�");
			int sel = sc.nextInt();

			if (sel == 1) {
				boolean depth = true;
				while (depth) {
					System.out.println(" -----�����Ƿ�-----");
					System.out.println("1.Ƽ����");
					System.out.println("2.����");
					System.out.println("�ڷΰ���");
					System.out.println("----");
					System.out.println("�޴��Է�");
					sel = sc.nextInt();

					if (sel == 1) {
						System.out.println("Ƽ����1���� �����ϼ̽��ϴ�.");
					} else if (sel == 2) {
						System.out.println("����1���� �����ϼ̽��ϴ�.");
					} else if (sel == 3) {// �ڷΰ���
						depth = false;
					}
				}
			} else if (sel == 2) {
				boolean depth = true;
				while(depth) {
				System.out.println(" -----�����Ƿ�-----");
				System.out.println("1.Ƽ����");
				System.out.println("2.����");
				System.out.println("�ڷΰ���");
				System.out.println("----");
				System.out.println("�޴��Է�");
				sel = sc.nextInt();
				if (sel == 1) {
					System.out.println("Ƽ����1���� �����ϼ̽��ϴ�.");
				} else if (sel == 2) {
					System.out.println("����1���� �����ϼ̽��ϴ�.");
				} else if (sel == 3) {// �ڷΰ���
					depth = false;
				}
				}
			} else if (sel == 3) {
				System.out.println("�����ϰڽ��ϴ�");
				isRun = false;
			}
		}

	}

}
