package lv3;

import java.util.Scanner;

public class atest {

	public static void main(String[] args) {
		/*
		 * # 4�� ����� ����
		 * - arr �迭���� 4�� ����� ��� temp �迭�� ����
		 * - ��! temp �� ���̸� 4�� �����ŭ�� �����Ѵ�. 
		 */
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;		
		int idx=0;
		int cnt=0;		
		for(int i =0;i<5;i++) {			
		if(arr[i]%4==0) {		
			cnt++;
		}
		}
		
		temp =new int[cnt];
	
		for(int i =0;i<5;i++) {
			if(arr[i]%4==0) {
				temp[idx]=arr[i];
				idx++;
			}
		}
		for(int i =0;i<cnt;i++) {
			System.out.println(temp[i]);
		}
			

		
	
	}
}
