package lv3;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		int[] arr = new int[5];		//{0,0,0,0,0}
		Random ran = new Random();
		double sum = 0;
		double avg = 0;
		int cnt = 0;
		for (int i = 0; i < 5; i++) {	// i : 0~4(�ε��� ����)
			arr[i] = ran.nextInt(100) + 1;
			System.out.println("arr�迭�� 1~100�� ������ ������ 5�� ����: " + arr[i]);
			sum += arr[i];
			if (arr[i] >= 60) {
				cnt++;
			}
		}
		System.out.println("�������� ���� : " + sum);
		avg = sum / 5;
		System.out.println("�������� ��� : " + avg);
		System.out.println("�հݻ� ��: " + cnt);

	}

}
