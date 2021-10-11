package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex22_no_overlap {

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

		int[] arr = new int[4];					//1~4 {4,0,0,0}
		int[] check = new int[4];				//	  {0,0,0,1}
												//	   0 1 2 3 �ε���					
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		int gameNum =1;
		int idx=0;
		while (idx<4) {	//arr�迭�� �������� �ߺ����� ���� ����(1~4)
			int rNum =rn.nextInt(4)+1;					
			if(check[rNum-1]==0) {
				arr[idx] =rNum;
				check[rNum-1]=1;
				idx++;
			}
			
		
		}
		while(true) {
		System.out.print("��ȣ: ");
		for(int i=0; i<4;i++) {
			System.out.print(i+1 +" ");
		}
		System.out.print("\n��: ");
		for(int i=0; i<4;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n��ȣ �Է�: ");
		int input = sc.nextInt()-1;
		
		if(arr[input]==gameNum) {					//<----�̺κ�ȥ��Ǯ�� Ʋ���� �ٽú��� input�������Ƿ� for������ �������ʾƾ���
			System.out.println("������");
			gameNum++;
		}
		else {
			System.out.println("��");
		}
		if(gameNum>4) {			//����
			break;
		}
		
		}
		
		
	}

}
