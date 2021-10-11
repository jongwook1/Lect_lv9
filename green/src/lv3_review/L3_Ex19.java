package lv3_review;

import java.util.Random;
import java.util.Scanner;
//Ex22
public class L3_Ex19 {

	public static void main(String[] args) {
		/*
		 * #  1 to 4
		 * 1. arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
		 * 2. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
		 * 3. ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
		 * ��)
		 * 4 2 3 1
		 * �Է� : 3
		 * 4 2 3 9
		 * �Է� : 1
		 * 4 9 3 9
		 * ...
		 */
		
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		int gameN=1;
		int idx=0;
		while(idx<4) {
			int rN=rn.nextInt(4)+1;
			if(check[rN-1]==0) {
				arr[idx]=rN;
				check[rN-1]=1;
				idx++;
			}
			
		}
		while(true) {
			System.out.println("��ȣ");
			for(int i=0;i<4;i++) {
				System.out.print(arr[i]);
				}
				System.out.println("\n��ȣ�Է����ּ���");
				int inputN=sc.nextInt()-1;
				if(arr[inputN]==gameN) {				
					gameN++;
				}
				if(gameN>4) {
					System.out.println("Ŭ����!");
					break;
				}
		}

	}

}
