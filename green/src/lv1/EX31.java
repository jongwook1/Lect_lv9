package lv1;

import java.util.Random;

public class EX31 {

	public static void main(String[] args) {
		Random rn = new Random();
		
		int total = 0;		
		int pass = 0;
		int max = 0;
		int top = 0;
		
		
		int cnt = 0;
		while(cnt < 10) {
			int score = rn.nextInt(100)+1;
			total += score;
			
			System.out.println(cnt+1 + "�� �л��� ���� : " + score + "��");
			if(score >= 60) {
				pass++;
				System.out.println("�հ�");
			}else {
				System.out.println("���հ�");
			}
			if(max < score) {
				max = score;
				top = cnt +1;
			}
			
		cnt++;
		}
		System.out.println("����" + total);
		System.out.println("���" + total/10);
		System.out.println("�հ��ڼ�" + pass + "��");
		System.out.println("1���ǹ�ȣ:"+ top + "  ����: "+max);
		
	}

}
