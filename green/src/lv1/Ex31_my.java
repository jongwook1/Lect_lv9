//�����ϴ���

package lv1;

import java.util.Random;

public class Ex31_my {

	public static void main(String[] args) {
		/*
		 * # �����л� (�ݺ��� + �ִ밪)
		 * 1. 10ȸ �ݺ��� �Ѵ�.
		 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
		 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
		 * ---------------------------------------
		 * . ������(10��)�� ������ ����� ����Ѵ�.
		 * . �հ��� ���� ����Ѵ�.
		 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.    //�ִ밪
		 */

		Random ran = new Random();
		
		int a = 0;		
		int sum = 0;		
		int cnt = 0;		
		int n = 0;
		int max = 0;
		int f = 0;
		
		
		while(a < 10) {
			int rN= ran.nextInt(100)+1;
			System.out.println("����"+rN);
									//max = rN         �̺κп� �ϸ� �ȉ�
			if (max < rN) {
				max = rN;
				f = a +1;
			}
			 if(rN >= 60) {
				// System.out.println("�հ�");
				 sum +=rN;
				 cnt++;
				 
			 }else {
				 sum +=rN;
				 
			 }			 
			 a++;
		}
		System.out.println("10���� ���� :" + sum);
		int avg = (sum /10);
		System.out.println("10���� ��� :" + avg);
		System.out.println("�հ��ڼ� :" +cnt +"���Դϴ�" );
		System.out.println("1���л��� ��ȣ :" + f);
		System.out.println("1���л��� ���� :" + max);
	}

}
