//�����Ѱ�
package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex23_my {

	public static void main(String[] args) {
		/*
		 * # ������ ����[3�ܰ�]
		 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
		 * 2. ������ ���߸� 20���̴�.
		 * 3. ���� ���� ��, ������ ����Ѵ�.
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int r = 0;
		
		while(r < 5) {
		
		int rN1 = ran.nextInt(9)+1;
		int rN2 = ran.nextInt(9)+1;
		int anser = rN1 * rN2;
		System.out.println(rN1 + "X" + rN2 + "=" +"?" );
		
		
		System.out.println("������ �Է��ϼ���");
		int inputa = sc.nextInt();
		if(anser == inputa) {
			System.out.println("�����Դϴ�");
		}else {
			System.out.println("��");
		}
		int n = 0;
		if(anser == inputa) {
			n ++;
		}
		r ++;
		}
		int score = 20;
		System.out.println("������ "+r * score +"���Դϴ�");
	}
}
