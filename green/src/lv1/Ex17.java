package lv1;
import java.util.Random;
import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {		
		/*
		 * # 369����[1�ܰ�]
		 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
		 * 2. �� ���� 369�� ������
		 * 	1) 2���̸�, ¦¦�� ���
		 *  2) 1���̸�, ¦�� ���
		 *  3) 0���̸�, �ش� ���ڸ� ���
		 * ��)
		 * 		33	 : ¦¦
		 * 		16	 : ¦
		 * 		 7	 : 7
		 */
		
		
		Random rn = new Random();		
		
		int quiz = rn.nextInt(50) +1;
		
		System.out.println(quiz);
		
		int ten = quiz / 10;		//10���ڸ�
		int one = quiz % 10;		//1���ڸ�
		
		int clap = 0;
		
		
		if(ten % 3 == 0 && ten != 00) {
			clap ++;
			
		}if(one % 3 == 0 && one != 00){
			clap ++;
			
		}		
		//�ڼ� ����
		System.out.println("����:" + quiz);		
		if(clap == 2) {
			System.out.println("¦¦");
		}
		else if(clap == 1) {
			System.out.println("¦");
		}
								
		
	}

}
