package lv3_review;

import java.util.Random;

public class L3_Ex02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Random rn=new Random();
		
		// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		for(int i=0;i<5;i++) {
			int rN=rn.nextInt(100)+1;
			arr[i]=rN;
		
			System.out.print(arr[i]+" ");
			
		}
		
		
		System.out.println();
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		int sum=0;
		
		for(int i=0;i<5;i++) {
			int rN=rn.nextInt(100)+1;
			arr[i]=rN;
			sum=arr[i];
			System.out.print(arr[i]+" ");
			
		}
		int avg=sum/5;
		System.out.println("����: " +sum+"���: "+avg);
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		int cnt=0;
		for(int i=0;i<5;i++) {
			int rN=rn.nextInt(100)+1;
			arr[i]=rN;
			if(arr[i]>=60) {
				cnt++;
			}
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("�հݻ��� ��: "+cnt);
		
		
	}

}
