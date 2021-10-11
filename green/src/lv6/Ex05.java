package lv6;

import java.util.Random;

class Omr{
	int[] answer = {1, 3, 4, 2, 5};		// ������
	int[] hgd = new int[5];				// �л����
	
	int cnt = 0;						// ���� ���� ����
	int score = 0;						// ����
}

public class Ex05 {
	
	/*
	 * # OMRī�� : Ŭ���� + ����
	 * 1. �迭 answer�� ���蹮���� �������̴�.
	 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
	 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
	 * 4. �� ������ 20���̴�.
	 * ��)
	 * answer = {1, 3, 4, 2, 5}
	 * hgd    = {1, 1, 4, 4, 3}
	 * ����ǥ     = {O, X, O, X, X}
	 * ����        = 40��
	 */

	public static void main(String[] args) {
		Omr o =new Omr();
		Random ran=new Random();
		
		
		for(int i=0;i<o.hgd.length;i++) {
			int rN=ran.nextInt(5)+1;
			o.hgd[i]=rN;
//			System.out.print(o.hgd[i]);			
		}
		int score=0;
		int passC=0;
		for(int i=0;i<o.answer.length;i++) {
			if(o.answer[i]==o.hgd[i]) {
				System.out.println("�����Դϴ�");
				score+=20;
				passC++;
			}else {
				System.out.println("�����Դϴ�");
			}
		}
		System.out.println("�����ǰ���: "+passC+" ����: " +score);
	}

}
