package lv1_review;

import java.util.Scanner;

public class Ex12_l1 {

	public static void main(String[] args) {
		/*
		 * # ���̱ⱸ �̿�����
		 * 1. Ű�� �Է¹޴´�.
		 * 2. �Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ�� �̿��� �� �ִ�.
		 * 3. Ű�� 120 �̸��̸�, ���̱ⱸ�� �̿��� �� ����.
		 * 4. ��, �θ�԰� �Բ� �� ��� ���̱ⱸ �̿��� �����ϴ�.
		 *    ��) �θ�԰� �Բ� ���̳���?(yes:1, no:0)
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�θ�԰� �Բ����̳���?(yes:1, no:0)");
		int sel=sc.nextInt();
		
		if (sel == 0) {
			System.out.println("Ű���Է����ּ���");
			int h = sc.nextInt();
			if (h >= 120) {
				System.out.println("���̱ⱸ �̿밡��");
			} else if (h < 120) {
				System.out.println("���̱ⱸ �̿�Ұ�!");
			}
		}else if(sel==1) {
			System.out.println("���̱ⱸ �̿밡��");
		}
			
		
	}

}
