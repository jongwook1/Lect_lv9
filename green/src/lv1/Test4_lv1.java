package lv1;

import java.util.Scanner;

public class Test4_lv1 {

	public static void main(String[] args) {
		// �������� 1. ���̱ⱸ 
		// ���� 09:12
		// ���� 09:20
		// �ҿ� 8�� 00
		
			
		
		/*
		 * # ���̱ⱸ �̿�����
		 * 1. Ű�� �Է¹޴´�.
		 * 2. �Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ�� �̿��� �� �ִ�.
		 * 3. Ű�� 120 �̸��̸�, ���̱ⱸ�� �̿��� �� ����.
		 * 4. ��, �θ�԰� �Բ� �� ��� ���̱ⱸ �̿��� �����ϴ�.
		 *    ��) �θ�԰� �Բ� ���̳���?(yes:1, no:0)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ű�� �Է����ּ���");
		int h = sc.nextInt();
		
		if(h >= 120) {
			System.out.println("���̱ⱸ ��밡��!");
		}else if(h < 120){
			System.out.println("�θ�԰� ���̳���? ���̿����� 1�� �ȿ����� 2��");
			int y = sc.nextInt();
			
			if(y == 1) {
				System.out.println("���̱ⱸ ��밡��!");
			}else if (y == 0) {
				System.out.println("�θ�԰����� ����Ҽ��־��!");
			}			
		}		
		
	}

}
