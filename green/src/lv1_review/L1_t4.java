package lv1_review;

import java.util.Scanner;

public class L1_t4 {

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
		
		int h=sc.nextInt();
		
		System.out.println("�θ�԰� �����ϼ̳���(yes:1, no:0)");
		int sel=sc.nextInt();
		
		if(sel==0) {
			if(h>=120) {
				System.out.println("�̿밡��!");
			}else {
				System.out.println("�̿�Ұ�!");
			}
		}else if(sel==1) {
			System.out.println("�̿밡��!");
		}

	}

}
