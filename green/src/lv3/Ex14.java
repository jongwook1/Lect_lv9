package lv3;

import java.util.Random;

public class Ex14 {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[1�ܰ�]
		 * 1. 0~4 ������ ���ڸ� arr�迭�� �����Ѵ�.
		 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
		 * ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
		 * 
		 * ��)
		 * �������� : 1
		 * check = {0, 1, 0, 0, 0}		//0 1 2 3 4
		 * arr   = {1, 0, 0, 0, 0}
		 * �������� : 3
		 * check = {0, 1, 0, 1, 0}
		 * arr   = {1, 3, 0, 0, 0}
		 * �������� : 2
		 * check = {0, 1, 1, 1, 0}
		 * arr   = {1, 3, 2, 0, 0}
		 */
		Random ran=new Random();
		int[] check = new int[5];
		int[] arr = new int[5];
		boolean run =true;
		int idx=0;	
		while(run) {
		for(int i =0;i<5;i++) {
			arr[i]=ran.nextInt(5);
			System.out.println("arr�迭"+arr[i]);
			if(arr[i]==0) {
				check[idx]=1;
				idx++;
			}else if(arr[i]==1) {
				check[idx]=1;
				idx++;
			}else if(arr[i]==2) {
				check[idx]=1;
				idx++;
			}else if(arr[i]==3) {
				check[idx]=1;
				idx++;
			}else if(arr[i]==4) {
				check[idx]=1;
				idx++;
			}System.out.println("check�迭"+check[i]);
			if(check[idx]==1) {
				System.out.println(arr[i]);
				run=false;
		}
		}
		}
		//if(check)
		
	}

}
