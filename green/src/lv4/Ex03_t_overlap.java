package lv4;

import java.util.Random;

public class Ex03_t_overlap {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[2�ܰ�]
		 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
		 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
		 */
		Random rn=new Random();
		int[] arr = new int[5];
		
		for(int i=0;i<5;i++) {
			int rNum =rn.nextInt(10)+1;
			boolean check=true;
			for(int j=0;j<5;j++) {
				if(arr[j]==rNum) {
					check =false;
				}
			}
			if(check==true) {
				arr[i]=rNum;
			}
			else {//�ߺ� �߽߰�,
				i--;
				
			}
		}
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
	}
		
		
		
		
//		while������ Ǭ��		
//		int i=0;
//		while(i<5) {
//			int r=rn.nextInt(10)+1;
//			
//			int check=-1;
//			//�ߺ�Ȯ���� -> ��ȿ�� ���� ����
//			for(int j=0; j<5;j++) {
//			if(r==arr[j]) {
//				check=i;
//			}
//			}
//			
//			if(check==-1) {
//				arr[i]=r;
//				i++;
//			
//			}
//			
//		}
//		for( i=0;i<5;i++) {
//			System.out.print(arr[i]+" ");
//	}
//	
		
		

	}

}
