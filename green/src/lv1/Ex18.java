package lv1;
import java.util.Random;
import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		/*
		 * # ����ö ��� ���
		 * 1. �̿��� ������ ���� �Է¹޴´�.		// int n = sc.nextInt();
		 * 2. ������ ���� ������ ���� ���� ����� ����ȴ�.
		 * 3. ���ǥ
		 * 1) 1~5	: 500��
		 * 2) 6~10	: 600��
		 * 3) 11,12 : 650�� (10���������Ĵ� 2�����帶�� 50���߰�)				
		 * 4) 13,14 : 700�� (10���������Ĵ� 2�����帶�� 50���߰�)
		 * 5) 15,16 : 750�� (10���������Ĵ� 2�����帶�� 50���߰�)
		 * ... 
		 */
		
		//10������ �ʰ� ��,
		
		//11      12 / 13      14 / 15     16 / 17        18 / ...
		//Ȧ+1 ==  ¦/ Ȧ+1 ==   ¦ / Ȧ+1 == ¦ /  Ȧ+1 ==   ¦  / ...      
		//  ������ ������
		//      1   /      2      /     3    /        4		 / ...
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �Է�");
		int stop = sc.nextInt();
		
		int total = 0;	// �� ���
		
		if(stop > 0) {
			total = 500;	//���� ���
			
			//1�� ���� (6~10)
			if(stop >= 6) {
				total += 100;
			}
			//2�� ���� (11~)
			if(stop > 10) {
				//2�����帶�� 50�� ����
				if(stop % 2 == 1) {
					stop ++;	//¦���� ����
				}
				int count = (stop - 10)/2;
				int add = count * 50;
				
				total += add;
			}
			
		}
		
		System.out.println("����� " + total + "���Դϴ�");
		

		/*���� �ϴ���	
		
		
		Random rn = new Random();
		
		int input = sc.nextInt();
		int r = ((input % 2) +1 )/2;			//������ 1 2 3 4
		  
		System.out.println(input);
		
		if(input <= 5) {
			System.out.println("500��");
		}
		else if (input <= 10) {
			System.out.println("600��");
		}else if (input <= 10) {
			System.out.println("600��");
		}
		
		// c /2 = 0 �� 2�� ��� 0 1 2 3 4 
		*/
	}
}






