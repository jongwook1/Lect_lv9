package lv4;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {						
		int[][] arr = new int[3][3];
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}														//{ {10}{20}{30} }{ {40}{50}{60} }{ {70}{80}{90} }
		}														//�ε��� 	00	01  02		10   11  12      20  21  22
		Scanner sc = new Scanner(System.in);
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// �� 1) �ε���1 �Է� : 1 �ε���2 �Է� : 2
		// �� ��� : 60
		for (int i = 0; i < 1; i++) {
			System.out.println("�ε��� �Է� ����");
			int idx = sc.nextInt();
			int idx1 = sc.nextInt();
			System.out.println(arr[idx][idx1]);
		}

		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// �� 2) �� �Է� : 60
		// �ε���1 ��� : 1 �ε���2 ��� : 2
		System.out.println("�� �Է� ����");
		int data = sc.nextInt();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (data == arr[i][j]) {
					System.out.println(i);
					System.out.println(j);
				}

			}
		}

		System.out.println();

		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		int max = 0;
		int idx = -1;
		int idx1 = -1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
					idx = i;
					idx1 = j;
				}

			}

		}
		System.out.println(idx);		
		System.out.println(idx1);

		// ���� 4) �� 2���� �Է¹޾� �� ��ü				//�ε��� 4���ʿ� �������� �ε���2���ʿ��ϹǷ�
		System.out.println("�� �Է� ����");
		int inData1=sc.nextInt();
		int inData2=sc.nextInt();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j]==inData1) {
					
				}

			}

		}
		
		
		
		
		
		
		
		
	}

}
