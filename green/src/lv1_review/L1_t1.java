package lv1_review;

import java.util.Random;
import java.util.Scanner;

public class L1_t1 {

	public static void main(String[] args) {
		/* # ����(0)����(1)��(2) ����[2�ܰ�] 
		 * # ���������� ����[2�ܰ�]��
		 *   if - else if �������� �����غ���.
		 */
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		
		int com=rn.nextInt(3);
		System.out.println(com);
		System.out.print("����(0),����(1),��(2) ");
		System.out.println("\n��(0~2)�� �Է����ּ���");
		int me=sc.nextInt();
		
		if(com==me) {
			System.out.println("����");
		}
		else if(com==0&&me==1) {
			System.out.println("�̰��");
		}
		else if(com==1&&me==2) {
			System.out.println("�̰��");
		}
		else if(com==2&&me==0) {
			System.out.println("�̰��");
		}else {
			System.out.println("����");
		}
		

	}

}
