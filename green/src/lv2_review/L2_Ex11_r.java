package lv2_review;

import java.util.Random;

public class L2_Ex11_r {

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
		
		int i=1;
		int max=0;
		int maxN=0;
		int total=0;		
		int cnt=0;
		Random rn=new Random();
		while(i<=10) {
			int score=rn.nextInt(100)+1;
			System.out.println(score);
			if(max<score) {
				max=score;
				maxN=i;
			}
			if(score>=60) {
				cnt++;
				System.out.println("�հ�");
			}
			total+=score;							
			i++;
		}
		int avg=total/10;
		System.out.println("����: "+total+"���: "+avg);
		System.out.println("1���ȣ: "+maxN+"����: "+max);
		System.out.println("�հ��ڼ� : "+cnt);
	}

}
