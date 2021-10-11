package lv3;

import java.util.Random;

public class Ex14_t_overlap {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[1�ܰ�]
		 * 1. 0~4 ������ ���ڸ� arr�迭�� �����Ѵ�.
		 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
		 * ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
		 * 
		 * ��)
		 * �������� : 1
		 * check = {0, 1, 0, 0, 0}
		 * arr   = {1, 0, 0, 0, 0}
		 * �������� : 3
		 * check = {0, 1, 0, 1, 0}
		 * arr   = {1, 3, 0, 0, 0}
		 * �������� : 2
		 * check = {0, 1, 1, 1, 0}
		 * arr   = {1, 3, 2, 0, 0}
		 */
		Random rn = new Random();
		int[] check = new int[5];		//�ߺ�ó���� ���� ����
		// {0,1,0,0,0}
		//  0 1 2 3 4 =>
		int[] arr = new int[5];			//������� ������ �迭 -->arr �迭 ��� (���)

		int idx=0; //arr�ε��� (��ȿ�� ���� ä���������� ����)
		while(idx < 5) {
			//arr�迭�� ��������-> �ߺ� ���� ��(0~4)�� ����
			int rNum = rn.nextInt(5);		//0~4
			
			if(check[rNum] == 0) {//�ߺ�Ȯ��
				//idx�������� ���ǹ� �ȿ� ���α�			
				arr[idx]=rNum;
				check[rNum] =1;	//���ó��
				idx++;
			}			
		}
		
		for(int i=0; i <5 ; i++) {
			System.out.println(arr[i]+" ");
		}
//ver.2		
//		int[] check = new int[5];
//		int[] arr = new int[5];
//		
//		for(int i=0; i<5; i++) {
//			int r = rn.nextInt(5);
//			arr[i] = r;
//			if(check[r] == 0) {
//				check[r] = 1;
//			}else {
//				i -= 1;
//			}
//		}
//		for(int i=0; i <5 ; i++) {
//			System.out.println(arr[i]+" ");
//		}
		


	}

}
