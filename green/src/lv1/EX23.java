package lv1;

import java.util.Random;
import java.util.Scanner;

public class EX23 {

	public static void main(String[] args) {

		/*
		 * # ������ ����[3�ܰ�]
		 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
		 * 2. ������ ���߸� 20���̴�.
		 * 3. ���� ���� ��, ������ ����Ѵ�.
		 */
		
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		//int score = 0;
		int count = 0; // �߿�!!!!!!!!!!
		int n = 0;
		while (n < 5) {
			int num1 = rn.nextInt(8) + 2; // 2~9
			int num2 = rn.nextInt(10) + 1; // 1~10
			int result = num1 * num2; // ����

			System.out.println(num1 + " X" + num2 + " = ?");
			int answer = sc.nextInt(); // ����

			// ���� �Ǵ� ��
			// ���� -> ������ ī��Ʈ or ���� ����

			if (answer == result) {
				System.out.println("������");
				count++;
				//score += 20;   // ���ھ�� ���¹�
			} else {
				System.out.println("��");
			}

			n++;
		}

		//��������
		System.out.println("���� : " +(count*20));
		//System.out.println("���� : " + score + "��");  //���ھ�� ���¹�
	}

}
