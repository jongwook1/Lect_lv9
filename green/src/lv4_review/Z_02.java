package lv4_review;

import java.util.Scanner;

public class Z_02 {

	public static void main(String[] args) {
		//���� 12:40
		//���� 13:00
		//�ҿ� 00:20
		
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
		Scanner sc=new Scanner(System.in);
		
		// ���� 1) ������ ������ �� ���
		// ���� 1) 4400, 7100, 5400

		for (int i = 0; i < pay.length; i++) {
			int sum = 0;
			for (int j = 0; j < pay.length; j++) {
				sum += pay[i][j];
			}
			System.out.print(sum + " ");
		}

		System.out.println();
		// ���� 2) ȣ�� �Է��ϸ� ������ ���
		// �� 2) �Է� : 202 ������ ��� : 2000
		System.out.println("ȣ�� �Է����ּ���");
		int inN = sc.nextInt();
		int idx1 = -1;
		int idx2 = -1;
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt.length; j++) {
				if (apt[i][j] == inN) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println(pay[idx1][idx2]);

		// ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
		// ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)
		int max = pay[0][0];
		int min = pay[0][0];

		idx1 = -1;
		idx2 = -1;
		int idx3 = -1;
		int idx4 = -1;
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay.length; j++) {
				if (max < pay[i][j]) {
					max = pay[i][j];
					idx1 = i;
					idx2 = j;
				}
				if (min > pay[i][j]) {
					min = pay[i][j];
					idx3 = i;
					idx4 = j;
				}
			}
		}
		System.out.println(apt[idx1][idx2]);
		System.out.println(apt[idx3][idx4]);
		// ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü

		System.out.println("1)ȣ���Է�");
		int n1 = sc.nextInt();
		System.out.println("2)ȣ���Է�");
		int n2 = sc.nextInt();
		idx1 = -1;
		idx2 = -1;
		idx3 = -1;
		idx4 = -1;
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt.length; j++) {
				if (apt[i][j] == n1) {
					idx1 = i;
					idx2 = j;
				} else if (apt[i][j] == n2) {
					idx3 = i;
					idx4 = j;
				}
			}
		}
		int temp = pay[idx1][idx2];
		pay[idx1][idx2] = pay[idx3][idx4];
		pay[idx3][idx4] = temp;

		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt.length; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}

	}

}
