package lv2_review;

import java.util.Random;

public class L2_Ex11 {

	public static void main(String[] args) {
		/*
		 * # �����л�
		 * 1. 10ȸ �ݺ��� �Ѵ�.
		 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
		 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
		 * ---------------------------------------
		 * . ������(10��)�� ������ ����� ����Ѵ�.
		 * . �հ��� ���� ����Ѵ�.
		 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
		 */
		Random rn=new Random();
		
		int i=1;
		int max=0;
		int cnt=0;
		int mNum=0;
		int total=0;
		int pCnt=0;
		while(i<=10) {
			int rN=rn.nextInt(100)+1;
			System.out.println(rN+" ");
			if(rN>max) {
				max=rN;
				mNum=i;
			}
			if(rN>=60) {
				pCnt++;
				System.out.println("�հ�");
			}
			total+=rN;			
			
			i++;
		}
		int avg=total/10;
		
		System.out.println("����: "+total+"  ���: "+avg);
		System.out.println("�հݻ���: "+pCnt);
		System.out.println("1���ȣ:  "+ mNum+"����:  "+max);
	}

}
