package lv3;

import java.util.Scanner;

public class Ex25_test {

	public static void main(String[] args) {
		//����1) �߰� �� �����ϰ� ���� �Է��ϸ� 10 , 20 �ڿ� �����Ѵ�.
		// �ִ� 5������ ����
		Scanner sc = new Scanner(System.in);
		int[] arr = {10, 20, 0, 0, 0};		//2	3	4
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			if(cnt==5) {
				break;
			}
			System.out.println();			
			System.out.println("[1]�߰�");
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			if(sel == 1) {

				for(int i=0;i<5;i++) {
				if(arr[cnt]!=0) {
					System.out.println("���̻� ���� �Է��Ҽ������ϴ�.");
				}
				}for(int i=0;i<5;i++) {
					if(arr[i]==0) {
						System.out.print("�߰��� �� �Է� : ");
						int data = sc.nextInt();
						arr[cnt]=data;
						cnt++;
					}
				}
				
				
				
				
			}
		}

	}
}
