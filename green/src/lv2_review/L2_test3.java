package lv2_review;

import java.util.Random;

public class L2_test3 {

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
		
		int cnt=0;
		int maxN=0;
		int max=0;
		int total=0;
		int i=1;
		while(i<=10) {
			int score=rn.nextInt(100)+1;
			
			if(max<score) {
				max=score;
				maxN=i;
			}
			if(score>=60) {
				System.out.println("�հ�");
				cnt++;
			}
			total+=i;
			System.out.println(score);
			i++;
		}
		
		int avg=total/10;
		
		System.out.println("����: "+total+"���: "+avg);
		System.out.println("1�� ��ȣ: "+maxN+"����: "+max);
		System.out.println("�հ��ڼ�: "+cnt);
		
	}

}
